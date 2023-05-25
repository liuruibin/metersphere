
package io.metersphere.api.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import io.metersphere.validation.groups.Updated;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@ApiModel(value = "场景步骤详情")
@Table("api_scenario_blob")
@Data
@EqualsAndHashCode(callSuper=false)
public class ApiScenarioBlob implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @NotBlank(message = "{api_scenario_blob.api_scenario_id.not_blank}", groups = {Updated.class})
    @ApiModelProperty(name = "场景pk", required = true, allowableValues = "range[1, 50]")
    private String id;

    @ApiModelProperty(name = "场景步骤内容", required = false, dataType = "byte[]")
    private byte[] content;

}