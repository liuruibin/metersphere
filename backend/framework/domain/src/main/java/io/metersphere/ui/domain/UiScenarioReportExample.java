package io.metersphere.ui.domain;

import java.util.ArrayList;
import java.util.List;

public class UiScenarioReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UiScenarioReportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTriggerModeIsNull() {
            addCriterion("trigger_mode is null");
            return (Criteria) this;
        }

        public Criteria andTriggerModeIsNotNull() {
            addCriterion("trigger_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerModeEqualTo(String value) {
            addCriterion("trigger_mode =", value, "triggerMode");
            return (Criteria) this;
        }

        public Criteria andTriggerModeNotEqualTo(String value) {
            addCriterion("trigger_mode <>", value, "triggerMode");
            return (Criteria) this;
        }

        public Criteria andTriggerModeGreaterThan(String value) {
            addCriterion("trigger_mode >", value, "triggerMode");
            return (Criteria) this;
        }

        public Criteria andTriggerModeGreaterThanOrEqualTo(String value) {
            addCriterion("trigger_mode >=", value, "triggerMode");
            return (Criteria) this;
        }

        public Criteria andTriggerModeLessThan(String value) {
            addCriterion("trigger_mode <", value, "triggerMode");
            return (Criteria) this;
        }

        public Criteria andTriggerModeLessThanOrEqualTo(String value) {
            addCriterion("trigger_mode <=", value, "triggerMode");
            return (Criteria) this;
        }

        public Criteria andTriggerModeLike(String value) {
            addCriterion("trigger_mode like", value, "triggerMode");
            return (Criteria) this;
        }

        public Criteria andTriggerModeNotLike(String value) {
            addCriterion("trigger_mode not like", value, "triggerMode");
            return (Criteria) this;
        }

        public Criteria andTriggerModeIn(List<String> values) {
            addCriterion("trigger_mode in", values, "triggerMode");
            return (Criteria) this;
        }

        public Criteria andTriggerModeNotIn(List<String> values) {
            addCriterion("trigger_mode not in", values, "triggerMode");
            return (Criteria) this;
        }

        public Criteria andTriggerModeBetween(String value1, String value2) {
            addCriterion("trigger_mode between", value1, value2, "triggerMode");
            return (Criteria) this;
        }

        public Criteria andTriggerModeNotBetween(String value1, String value2) {
            addCriterion("trigger_mode not between", value1, value2, "triggerMode");
            return (Criteria) this;
        }

        public Criteria andExecuteTypeIsNull() {
            addCriterion("execute_type is null");
            return (Criteria) this;
        }

        public Criteria andExecuteTypeIsNotNull() {
            addCriterion("execute_type is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteTypeEqualTo(String value) {
            addCriterion("execute_type =", value, "executeType");
            return (Criteria) this;
        }

        public Criteria andExecuteTypeNotEqualTo(String value) {
            addCriterion("execute_type <>", value, "executeType");
            return (Criteria) this;
        }

        public Criteria andExecuteTypeGreaterThan(String value) {
            addCriterion("execute_type >", value, "executeType");
            return (Criteria) this;
        }

        public Criteria andExecuteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("execute_type >=", value, "executeType");
            return (Criteria) this;
        }

        public Criteria andExecuteTypeLessThan(String value) {
            addCriterion("execute_type <", value, "executeType");
            return (Criteria) this;
        }

        public Criteria andExecuteTypeLessThanOrEqualTo(String value) {
            addCriterion("execute_type <=", value, "executeType");
            return (Criteria) this;
        }

        public Criteria andExecuteTypeLike(String value) {
            addCriterion("execute_type like", value, "executeType");
            return (Criteria) this;
        }

        public Criteria andExecuteTypeNotLike(String value) {
            addCriterion("execute_type not like", value, "executeType");
            return (Criteria) this;
        }

        public Criteria andExecuteTypeIn(List<String> values) {
            addCriterion("execute_type in", values, "executeType");
            return (Criteria) this;
        }

        public Criteria andExecuteTypeNotIn(List<String> values) {
            addCriterion("execute_type not in", values, "executeType");
            return (Criteria) this;
        }

        public Criteria andExecuteTypeBetween(String value1, String value2) {
            addCriterion("execute_type between", value1, value2, "executeType");
            return (Criteria) this;
        }

        public Criteria andExecuteTypeNotBetween(String value1, String value2) {
            addCriterion("execute_type not between", value1, value2, "executeType");
            return (Criteria) this;
        }

        public Criteria andScenarioNameIsNull() {
            addCriterion("scenario_name is null");
            return (Criteria) this;
        }

        public Criteria andScenarioNameIsNotNull() {
            addCriterion("scenario_name is not null");
            return (Criteria) this;
        }

        public Criteria andScenarioNameEqualTo(String value) {
            addCriterion("scenario_name =", value, "scenarioName");
            return (Criteria) this;
        }

        public Criteria andScenarioNameNotEqualTo(String value) {
            addCriterion("scenario_name <>", value, "scenarioName");
            return (Criteria) this;
        }

        public Criteria andScenarioNameGreaterThan(String value) {
            addCriterion("scenario_name >", value, "scenarioName");
            return (Criteria) this;
        }

        public Criteria andScenarioNameGreaterThanOrEqualTo(String value) {
            addCriterion("scenario_name >=", value, "scenarioName");
            return (Criteria) this;
        }

        public Criteria andScenarioNameLessThan(String value) {
            addCriterion("scenario_name <", value, "scenarioName");
            return (Criteria) this;
        }

        public Criteria andScenarioNameLessThanOrEqualTo(String value) {
            addCriterion("scenario_name <=", value, "scenarioName");
            return (Criteria) this;
        }

        public Criteria andScenarioNameLike(String value) {
            addCriterion("scenario_name like", value, "scenarioName");
            return (Criteria) this;
        }

        public Criteria andScenarioNameNotLike(String value) {
            addCriterion("scenario_name not like", value, "scenarioName");
            return (Criteria) this;
        }

        public Criteria andScenarioNameIn(List<String> values) {
            addCriterion("scenario_name in", values, "scenarioName");
            return (Criteria) this;
        }

        public Criteria andScenarioNameNotIn(List<String> values) {
            addCriterion("scenario_name not in", values, "scenarioName");
            return (Criteria) this;
        }

        public Criteria andScenarioNameBetween(String value1, String value2) {
            addCriterion("scenario_name between", value1, value2, "scenarioName");
            return (Criteria) this;
        }

        public Criteria andScenarioNameNotBetween(String value1, String value2) {
            addCriterion("scenario_name not between", value1, value2, "scenarioName");
            return (Criteria) this;
        }

        public Criteria andScenarioIdIsNull() {
            addCriterion("scenario_id is null");
            return (Criteria) this;
        }

        public Criteria andScenarioIdIsNotNull() {
            addCriterion("scenario_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenarioIdEqualTo(String value) {
            addCriterion("scenario_id =", value, "scenarioId");
            return (Criteria) this;
        }

        public Criteria andScenarioIdNotEqualTo(String value) {
            addCriterion("scenario_id <>", value, "scenarioId");
            return (Criteria) this;
        }

        public Criteria andScenarioIdGreaterThan(String value) {
            addCriterion("scenario_id >", value, "scenarioId");
            return (Criteria) this;
        }

        public Criteria andScenarioIdGreaterThanOrEqualTo(String value) {
            addCriterion("scenario_id >=", value, "scenarioId");
            return (Criteria) this;
        }

        public Criteria andScenarioIdLessThan(String value) {
            addCriterion("scenario_id <", value, "scenarioId");
            return (Criteria) this;
        }

        public Criteria andScenarioIdLessThanOrEqualTo(String value) {
            addCriterion("scenario_id <=", value, "scenarioId");
            return (Criteria) this;
        }

        public Criteria andScenarioIdLike(String value) {
            addCriterion("scenario_id like", value, "scenarioId");
            return (Criteria) this;
        }

        public Criteria andScenarioIdNotLike(String value) {
            addCriterion("scenario_id not like", value, "scenarioId");
            return (Criteria) this;
        }

        public Criteria andScenarioIdIn(List<String> values) {
            addCriterion("scenario_id in", values, "scenarioId");
            return (Criteria) this;
        }

        public Criteria andScenarioIdNotIn(List<String> values) {
            addCriterion("scenario_id not in", values, "scenarioId");
            return (Criteria) this;
        }

        public Criteria andScenarioIdBetween(String value1, String value2) {
            addCriterion("scenario_id between", value1, value2, "scenarioId");
            return (Criteria) this;
        }

        public Criteria andScenarioIdNotBetween(String value1, String value2) {
            addCriterion("scenario_id not between", value1, value2, "scenarioId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andPoolIdIsNull() {
            addCriterion("pool_id is null");
            return (Criteria) this;
        }

        public Criteria andPoolIdIsNotNull() {
            addCriterion("pool_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoolIdEqualTo(String value) {
            addCriterion("pool_id =", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdNotEqualTo(String value) {
            addCriterion("pool_id <>", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdGreaterThan(String value) {
            addCriterion("pool_id >", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdGreaterThanOrEqualTo(String value) {
            addCriterion("pool_id >=", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdLessThan(String value) {
            addCriterion("pool_id <", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdLessThanOrEqualTo(String value) {
            addCriterion("pool_id <=", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdLike(String value) {
            addCriterion("pool_id like", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdNotLike(String value) {
            addCriterion("pool_id not like", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdIn(List<String> values) {
            addCriterion("pool_id in", values, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdNotIn(List<String> values) {
            addCriterion("pool_id not in", values, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdBetween(String value1, String value2) {
            addCriterion("pool_id between", value1, value2, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdNotBetween(String value1, String value2) {
            addCriterion("pool_id not between", value1, value2, "poolId");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Long value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Long value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Long value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Long value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Long> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Long> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Long value1, Long value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andIntegratedIsNull() {
            addCriterion("integrated is null");
            return (Criteria) this;
        }

        public Criteria andIntegratedIsNotNull() {
            addCriterion("integrated is not null");
            return (Criteria) this;
        }

        public Criteria andIntegratedEqualTo(Boolean value) {
            addCriterion("integrated =", value, "integrated");
            return (Criteria) this;
        }

        public Criteria andIntegratedNotEqualTo(Boolean value) {
            addCriterion("integrated <>", value, "integrated");
            return (Criteria) this;
        }

        public Criteria andIntegratedGreaterThan(Boolean value) {
            addCriterion("integrated >", value, "integrated");
            return (Criteria) this;
        }

        public Criteria andIntegratedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("integrated >=", value, "integrated");
            return (Criteria) this;
        }

        public Criteria andIntegratedLessThan(Boolean value) {
            addCriterion("integrated <", value, "integrated");
            return (Criteria) this;
        }

        public Criteria andIntegratedLessThanOrEqualTo(Boolean value) {
            addCriterion("integrated <=", value, "integrated");
            return (Criteria) this;
        }

        public Criteria andIntegratedIn(List<Boolean> values) {
            addCriterion("integrated in", values, "integrated");
            return (Criteria) this;
        }

        public Criteria andIntegratedNotIn(List<Boolean> values) {
            addCriterion("integrated not in", values, "integrated");
            return (Criteria) this;
        }

        public Criteria andIntegratedBetween(Boolean value1, Boolean value2) {
            addCriterion("integrated between", value1, value2, "integrated");
            return (Criteria) this;
        }

        public Criteria andIntegratedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("integrated not between", value1, value2, "integrated");
            return (Criteria) this;
        }

        public Criteria andRelevanceTestPlanReportIdIsNull() {
            addCriterion("relevance_test_plan_report_id is null");
            return (Criteria) this;
        }

        public Criteria andRelevanceTestPlanReportIdIsNotNull() {
            addCriterion("relevance_test_plan_report_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelevanceTestPlanReportIdEqualTo(String value) {
            addCriterion("relevance_test_plan_report_id =", value, "relevanceTestPlanReportId");
            return (Criteria) this;
        }

        public Criteria andRelevanceTestPlanReportIdNotEqualTo(String value) {
            addCriterion("relevance_test_plan_report_id <>", value, "relevanceTestPlanReportId");
            return (Criteria) this;
        }

        public Criteria andRelevanceTestPlanReportIdGreaterThan(String value) {
            addCriterion("relevance_test_plan_report_id >", value, "relevanceTestPlanReportId");
            return (Criteria) this;
        }

        public Criteria andRelevanceTestPlanReportIdGreaterThanOrEqualTo(String value) {
            addCriterion("relevance_test_plan_report_id >=", value, "relevanceTestPlanReportId");
            return (Criteria) this;
        }

        public Criteria andRelevanceTestPlanReportIdLessThan(String value) {
            addCriterion("relevance_test_plan_report_id <", value, "relevanceTestPlanReportId");
            return (Criteria) this;
        }

        public Criteria andRelevanceTestPlanReportIdLessThanOrEqualTo(String value) {
            addCriterion("relevance_test_plan_report_id <=", value, "relevanceTestPlanReportId");
            return (Criteria) this;
        }

        public Criteria andRelevanceTestPlanReportIdLike(String value) {
            addCriterion("relevance_test_plan_report_id like", value, "relevanceTestPlanReportId");
            return (Criteria) this;
        }

        public Criteria andRelevanceTestPlanReportIdNotLike(String value) {
            addCriterion("relevance_test_plan_report_id not like", value, "relevanceTestPlanReportId");
            return (Criteria) this;
        }

        public Criteria andRelevanceTestPlanReportIdIn(List<String> values) {
            addCriterion("relevance_test_plan_report_id in", values, "relevanceTestPlanReportId");
            return (Criteria) this;
        }

        public Criteria andRelevanceTestPlanReportIdNotIn(List<String> values) {
            addCriterion("relevance_test_plan_report_id not in", values, "relevanceTestPlanReportId");
            return (Criteria) this;
        }

        public Criteria andRelevanceTestPlanReportIdBetween(String value1, String value2) {
            addCriterion("relevance_test_plan_report_id between", value1, value2, "relevanceTestPlanReportId");
            return (Criteria) this;
        }

        public Criteria andRelevanceTestPlanReportIdNotBetween(String value1, String value2) {
            addCriterion("relevance_test_plan_report_id not between", value1, value2, "relevanceTestPlanReportId");
            return (Criteria) this;
        }

        public Criteria andReportSourceIsNull() {
            addCriterion("report_source is null");
            return (Criteria) this;
        }

        public Criteria andReportSourceIsNotNull() {
            addCriterion("report_source is not null");
            return (Criteria) this;
        }

        public Criteria andReportSourceEqualTo(String value) {
            addCriterion("report_source =", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceNotEqualTo(String value) {
            addCriterion("report_source <>", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceGreaterThan(String value) {
            addCriterion("report_source >", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceGreaterThanOrEqualTo(String value) {
            addCriterion("report_source >=", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceLessThan(String value) {
            addCriterion("report_source <", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceLessThanOrEqualTo(String value) {
            addCriterion("report_source <=", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceLike(String value) {
            addCriterion("report_source like", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceNotLike(String value) {
            addCriterion("report_source not like", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceIn(List<String> values) {
            addCriterion("report_source in", values, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceNotIn(List<String> values) {
            addCriterion("report_source not in", values, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceBetween(String value1, String value2) {
            addCriterion("report_source between", value1, value2, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceNotBetween(String value1, String value2) {
            addCriterion("report_source not between", value1, value2, "reportSource");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}