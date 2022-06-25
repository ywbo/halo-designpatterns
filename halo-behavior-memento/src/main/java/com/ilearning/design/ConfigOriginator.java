package com.ilearning.design;

import lombok.Data;

/**
 * 配置文件-记录者
 *
 * @author yuwenbo
 * @date 2022/6/25 16:50
 **/
@Data
public class ConfigOriginator {
    private ConfigFile configFile;

    public void getMemento(ConfigMemento memento) {
        configFile = memento.getConfigFile();
    }

    public ConfigMemento saveMemento() {
        return new ConfigMemento(configFile);
    }
}
