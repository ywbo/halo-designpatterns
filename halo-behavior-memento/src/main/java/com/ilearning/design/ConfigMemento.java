package com.ilearning.design;

import lombok.Data;

/**
 * 配置文件-备忘录
 *
 * @author yuwenbo
 * @date 2022/6/25 16:49
 **/
@Data
public class ConfigMemento {
    private ConfigFile configFile;

    public ConfigMemento(ConfigFile configFile) {
        this.configFile = configFile;
    }
}
