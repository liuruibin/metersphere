package io.metersphere.plan.domain;

import io.metersphere.validation.groups.Created;
import io.metersphere.validation.groups.Updated;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

@Data
public class TestPlanReport implements Serializable {
    @Schema(description =  "ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{test_plan_report.id.not_blank}", groups = {Updated.class})
    @Size(min = 1, max = 50, message = "{test_plan_report.id.length_range}", groups = {Created.class, Updated.class})
    private String id;

    @Schema(description =  "测试计划ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{test_plan_report.test_plan_id.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 50, message = "{test_plan_report.test_plan_id.length_range}", groups = {Created.class, Updated.class})
    private String testPlanId;

    @Schema(description =  "报告名称", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{test_plan_report.name.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 255, message = "{test_plan_report.name.length_range}", groups = {Created.class, Updated.class})
    private String name;

    @Schema(description =  "创建人")
    private String createUser;

    @Schema(description =  "创建时间")
    private Long createTime;

    @Schema(description =  "修改人")
    private String updateUser;

    @Schema(description =  "更新时间")
    private Long updateTime;

    @Schema(description =  "开始时间")
    private Long startTime;

    @Schema(description =  "结束时间")
    private Long endTime;

    @Schema(description =  "用例数量")
    private Long caseCount;

    @Schema(description =  "执行率")
    private Double executeRate;

    @Schema(description =  "通过率")
    private Double passRate;

    private static final long serialVersionUID = 1L;
}