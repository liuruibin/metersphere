package io.metersphere.api.domain;

import io.metersphere.validation.groups.*;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import lombok.Data;

@Data
public class ApiScenario implements Serializable {
    @Schema(description = "", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{api_scenario.id.not_blank}", groups = {Updated.class})
    @Size(min = 1, max = 50, message = "{api_scenario.id.length_range}", groups = {Created.class, Updated.class})
    private String id;

    @Schema(description = "场景名称", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{api_scenario.name.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 255, message = "{api_scenario.name.length_range}", groups = {Created.class, Updated.class})
    private String name;

    @Schema(description = "场景级别/P0/P1等", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{api_scenario.level.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 10, message = "{api_scenario.level.length_range}", groups = {Created.class, Updated.class})
    private String level;

    @Schema(description = "场景状态/未规划/已完成 等", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{api_scenario.status.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 20, message = "{api_scenario.status.length_range}", groups = {Created.class, Updated.class})
    private String status;

    @Schema(description = "责任人/用户fk", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{api_scenario.principal.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 50, message = "{api_scenario.principal.length_range}", groups = {Created.class, Updated.class})
    private String principal;

    @Schema(description = "场景步骤总数", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "{api_scenario.step_total.not_blank}", groups = {Created.class})
    private Integer stepTotal;

    @Schema(description = "通过率", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "{api_scenario.pass_rate.not_blank}", groups = {Created.class})
    private Long passRate;

    @Schema(description = "最后一次执行的结果状态")
    private String lastReportStatus;

    @Schema(description = "最后一次执行的报告fk")
    private String lastReportId;

    @Schema(description = "编号")
    private Integer num;

    @Schema(description = "自定义id")
    private String customNum;

    @Schema(description = "删除状态", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "{api_scenario.deleted.not_blank}", groups = {Created.class})
    private Boolean deleted;

    @Schema(description = "自定义排序", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "{api_scenario.pos.not_blank}", groups = {Created.class})
    private Long pos;

    @Schema(description = "版本fk")
    private String versionId;

    @Schema(description = "引用资源fk")
    private String refId;

    @Schema(description = "是否为最新版本 0:否，1:是")
    private Boolean latest;

    @Schema(description = "项目fk", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{api_scenario.project_id.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 50, message = "{api_scenario.project_id.length_range}", groups = {Created.class, Updated.class})
    private String projectId;

    @Schema(description = "场景模块fk")
    private String apiScenarioModuleId;

    @Schema(description = "描述信息")
    private String description;

    @Schema(description = "标签")
    private String tags;

    @Schema(description = "是否为环境组", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "{api_scenario.grouped.not_blank}", groups = {Created.class})
    private Boolean grouped;

    @Schema(description = "创建人")
    private String createUser;

    @Schema(description = "创建时间")
    private Long createTime;

    @Schema(description = "删除时间")
    private Long deleteTime;

    @Schema(description = "删除人")
    private String deleteUser;

    @Schema(description = "更新人")
    private String updateUser;

    @Schema(description = "更新时间")
    private Long updateTime;

    private static final long serialVersionUID = 1L;

    public enum Column {
        id("id", "id", "VARCHAR", false),
        name("name", "name", "VARCHAR", true),
        level("level", "level", "VARCHAR", true),
        status("status", "status", "VARCHAR", true),
        principal("principal", "principal", "VARCHAR", false),
        stepTotal("step_total", "stepTotal", "INTEGER", false),
        passRate("pass_rate", "passRate", "BIGINT", false),
        lastReportStatus("last_report_status", "lastReportStatus", "VARCHAR", false),
        lastReportId("last_report_id", "lastReportId", "VARCHAR", false),
        num("num", "num", "INTEGER", false),
        customNum("custom_num", "customNum", "VARCHAR", false),
        deleted("deleted", "deleted", "BIT", false),
        pos("pos", "pos", "BIGINT", false),
        versionId("version_id", "versionId", "VARCHAR", false),
        refId("ref_id", "refId", "VARCHAR", false),
        latest("latest", "latest", "BIT", false),
        projectId("project_id", "projectId", "VARCHAR", false),
        apiScenarioModuleId("api_scenario_module_id", "apiScenarioModuleId", "VARCHAR", false),
        description("description", "description", "VARCHAR", false),
        tags("tags", "tags", "VARCHAR", false),
        grouped("grouped", "grouped", "BIT", false),
        createUser("create_user", "createUser", "VARCHAR", false),
        createTime("create_time", "createTime", "BIGINT", false),
        deleteTime("delete_time", "deleteTime", "BIGINT", false),
        deleteUser("delete_user", "deleteUser", "VARCHAR", false),
        updateUser("update_user", "updateUser", "VARCHAR", false),
        updateTime("update_time", "updateTime", "BIGINT", false);

        private static final String BEGINNING_DELIMITER = "`";

        private static final String ENDING_DELIMITER = "`";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}