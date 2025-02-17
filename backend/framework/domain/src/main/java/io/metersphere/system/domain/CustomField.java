package io.metersphere.system.domain;

import io.metersphere.validation.groups.*;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import lombok.Data;

@Data
public class CustomField implements Serializable {
    @Schema(description = "自定义字段ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{custom_field.id.not_blank}", groups = {Updated.class})
    @Size(min = 1, max = 50, message = "{custom_field.id.length_range}", groups = {Created.class, Updated.class})
    private String id;

    @Schema(description = "自定义字段名称", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{custom_field.name.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 255, message = "{custom_field.name.length_range}", groups = {Created.class, Updated.class})
    private String name;

    @Schema(description = "使用场景", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{custom_field.scene.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 30, message = "{custom_field.scene.length_range}", groups = {Created.class, Updated.class})
    private String scene;

    @Schema(description = "自定义字段类型", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{custom_field.type.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 30, message = "{custom_field.type.length_range}", groups = {Created.class, Updated.class})
    private String type;

    @Schema(description = "自定义字段备注")
    private String remark;

    @Schema(description = "是否是内置字段", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "{custom_field.internal.not_blank}", groups = {Created.class})
    private Boolean internal;

    @Schema(description = "组织或项目级别字段（PROJECT, ORGANIZATION）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{custom_field.scope_type.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 50, message = "{custom_field.scope_type.length_range}", groups = {Created.class, Updated.class})
    private String scopeType;

    @Schema(description = "创建时间")
    private Long createTime;

    @Schema(description = "更新时间")
    private Long updateTime;

    @Schema(description = "创建人")
    private String createUser;

    @Schema(description = "项目字段所关联的组织字段ID")
    private String refId;

    @Schema(description = "是否需要手动输入选项key", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "{custom_field.enable_option_key.not_blank}", groups = {Created.class})
    private Boolean enableOptionKey;

    @Schema(description = "组织或项目ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{custom_field.scope_id.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 50, message = "{custom_field.scope_id.length_range}", groups = {Created.class, Updated.class})
    private String scopeId;

    private static final long serialVersionUID = 1L;

    public enum Column {
        id("id", "id", "VARCHAR", false),
        name("name", "name", "VARCHAR", true),
        scene("scene", "scene", "VARCHAR", false),
        type("type", "type", "VARCHAR", true),
        remark("remark", "remark", "VARCHAR", false),
        internal("internal", "internal", "BIT", false),
        scopeType("scope_type", "scopeType", "VARCHAR", false),
        createTime("create_time", "createTime", "BIGINT", false),
        updateTime("update_time", "updateTime", "BIGINT", false),
        createUser("create_user", "createUser", "VARCHAR", false),
        refId("ref_id", "refId", "VARCHAR", false),
        enableOptionKey("enable_option_key", "enableOptionKey", "BIT", false),
        scopeId("scope_id", "scopeId", "VARCHAR", false);

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