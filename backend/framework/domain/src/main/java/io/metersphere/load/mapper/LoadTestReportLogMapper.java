package io.metersphere.load.mapper;

import io.metersphere.load.domain.LoadTestReportLog;
import io.metersphere.load.domain.LoadTestReportLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoadTestReportLogMapper {
    long countByExample(LoadTestReportLogExample example);

    int deleteByExample(LoadTestReportLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(LoadTestReportLog record);

    int insertSelective(LoadTestReportLog record);

    List<LoadTestReportLog> selectByExampleWithBLOBs(LoadTestReportLogExample example);

    List<LoadTestReportLog> selectByExample(LoadTestReportLogExample example);

    LoadTestReportLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LoadTestReportLog record, @Param("example") LoadTestReportLogExample example);

    int updateByExampleWithBLOBs(@Param("record") LoadTestReportLog record, @Param("example") LoadTestReportLogExample example);

    int updateByExample(@Param("record") LoadTestReportLog record, @Param("example") LoadTestReportLogExample example);

    int updateByPrimaryKeySelective(LoadTestReportLog record);

    int updateByPrimaryKeyWithBLOBs(LoadTestReportLog record);

    int updateByPrimaryKey(LoadTestReportLog record);
}