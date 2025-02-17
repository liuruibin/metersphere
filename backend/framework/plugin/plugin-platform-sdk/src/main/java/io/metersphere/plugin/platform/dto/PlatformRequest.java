package io.metersphere.plugin.platform.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlatformRequest {
    private String integrationConfig;
    private String organizationId;
    private String userAccountConfig;
    private String pluginId;
}
