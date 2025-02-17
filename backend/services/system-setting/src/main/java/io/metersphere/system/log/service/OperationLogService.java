package io.metersphere.system.log.service;

import io.metersphere.project.domain.Project;
import io.metersphere.sdk.domain.OperationLogBlob;
import io.metersphere.sdk.dto.LogDTO;
import io.metersphere.sdk.dto.OptionDTO;
import io.metersphere.sdk.exception.MSException;
import io.metersphere.system.log.vo.OperationLogRequest;
import io.metersphere.system.log.vo.OperationLogResponse;
import io.metersphere.sdk.mapper.*;
import io.metersphere.sdk.util.Translator;
import io.metersphere.system.domain.Organization;
import io.metersphere.system.mapper.BaseOperationLogMapper;
import io.metersphere.system.mapper.BaseOrganizationMapper;
import io.metersphere.system.mapper.BaseProjectMapper;
import io.metersphere.system.mapper.BaseUserMapper;
import jakarta.annotation.Resource;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Transactional(rollbackFor = Exception.class)
public class OperationLogService {
    @Resource
    private OperationLogMapper operationLogMapper;
    @Resource
    private OperationLogBlobMapper operationLogBlobMapper;
    @Resource
    private SqlSessionFactory sqlSessionFactory;

    @Resource
    private BaseOperationLogMapper baseOperationLogMapper;

    @Resource
    private BaseUserMapper baseUserMapper;

    @Resource
    private BaseProjectMapper baseProjectMapper;

    @Resource
    private BaseOrganizationMapper baseOrganizationMapper;

    public void add(LogDTO log) {
        if (StringUtils.isBlank(log.getProjectId())) {
            log.setProjectId("none");
        }
        if (StringUtils.isBlank(log.getCreateUser())) {
            log.setCreateUser("admin");
        }
        log.setContent(subStrContent(log.getContent()));
        operationLogMapper.insert(log);
        operationLogBlobMapper.insert(getBlob(log));
    }

    private OperationLogBlob getBlob(LogDTO log) {
        OperationLogBlob blob = new OperationLogBlob();
        blob.setId(log.getId());
        blob.setOriginalValue(log.getOriginalValue());
        blob.setModifiedValue(log.getModifiedValue());
        return blob;
    }

    private String subStrContent(String content) {
        if (StringUtils.isNotBlank(content) && content.length() > 500) {
            return content.substring(0, 499);
        }
        return content;
    }

    @Async
    public void batchAdd(List<LogDTO> logs) {
        if (CollectionUtils.isEmpty(logs)) {
            return;
        }
        SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH);
        OperationLogBlobMapper logBlobMapper = sqlSession.getMapper(OperationLogBlobMapper.class);

        if (CollectionUtils.isNotEmpty(logs)) {
            long currentTimeMillis = System.currentTimeMillis();
            logs.forEach(item -> {
                item.setContent(subStrContent(item.getContent()));
                item.setCreateTime(currentTimeMillis);
                // 限制长度
                operationLogMapper.insert(item);
                logBlobMapper.insert(getBlob(item));
            });
        }
        sqlSession.flushStatements();
        if (sqlSessionFactory != null) {
            SqlSessionUtils.closeSqlSession(sqlSession, sqlSessionFactory);
        }
    }

    public List<OperationLogResponse> list(OperationLogRequest request) {
        int compare = Long.compare(request.getStartTime(), request.getEndTime());
        if (compare > 0) {
            throw new MSException(Translator.get("startTime_must_be_less_than_endTime"));
        }
        List<OperationLogResponse> list = baseOperationLogMapper.list(request);

        if (CollectionUtils.isNotEmpty(list)) {
            List<String> userIds = list.stream().map(OperationLogResponse::getCreateUser).collect(Collectors.toList());
            List<String> projectIds = list.stream().map(OperationLogResponse::getProjectId).collect(Collectors.toList());
            List<String> organizationIds = list.stream().map(OperationLogResponse::getOrganizationId).collect(Collectors.toList());
            List<OptionDTO> userList = baseUserMapper.selectUserOptionByIds(userIds);
            Map<String, String> userMap = userList.stream().collect(Collectors.toMap(OptionDTO::getId, OptionDTO::getName));
            List<Project> projects = baseProjectMapper.selectProjectByIdList(projectIds);
            Map<String, String> projectMap = projects.stream().collect(Collectors.toMap(Project::getId, Project::getName));
            List<Organization> organizations = baseOrganizationMapper.selectOrganizationByIdList(organizationIds);
            Map<String, String> organizationMap = organizations.stream().collect(Collectors.toMap(Organization::getId, Organization::getName));
            list.forEach(item -> {
                item.setUserName(userMap.getOrDefault(item.getCreateUser(), StringUtils.EMPTY));
                item.setProjectName(projectMap.getOrDefault(item.getProjectId(), StringUtils.EMPTY));
                item.setOrganizationName(organizationMap.getOrDefault(item.getOrganizationId(), StringUtils.EMPTY));
            });
        }
        return list;
    }
}
