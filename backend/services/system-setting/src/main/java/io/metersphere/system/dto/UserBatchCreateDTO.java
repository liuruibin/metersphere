package io.metersphere.system.dto;

import io.metersphere.validation.groups.Created;
import io.metersphere.validation.groups.Updated;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

@Data
public class UserBatchCreateDTO {

    @Schema(description =  "用户信息集合", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(groups = {Created.class, Updated.class}, message = "{user.info.not_empty}")
    List<@Valid UserCreateInfo> userInfoList;

    @Schema(description =  "用户组", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(groups = {Created.class, Updated.class}, message = "{user_role.id.not_blank}")
    List<@Valid @NotBlank(message = "{user_role.id.not_blank}", groups = {Created.class, Updated.class}) String> userRoleIdList;

}

