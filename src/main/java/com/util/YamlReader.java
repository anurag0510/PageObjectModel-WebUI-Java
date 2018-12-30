package com.util;

import org.yaml.snakeyaml.Yaml;

import com.models.Config;

public class YamlReader {
    private String filePath;

    public YamlReader(String filePath) {
        this.filePath = filePath;
    }

    public Config readConfig() {
        return new Yaml().loadAs(FileReader.read(filePath), Config.class);
    }
}