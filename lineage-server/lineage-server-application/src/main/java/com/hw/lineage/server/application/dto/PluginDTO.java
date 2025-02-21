package com.hw.lineage.server.application.dto;

import com.hw.lineage.server.application.dto.basic.BasicDTO;
import lombok.Data;

/**
 * @description: PluginDTO
 * @author: HamaWhite
 */
@Data
public class PluginDTO extends BasicDTO {

    private Long pluginId;

    private String pluginName;

    private String pluginCode;

    private String descr;

    private Boolean defaultPlugin;
}
