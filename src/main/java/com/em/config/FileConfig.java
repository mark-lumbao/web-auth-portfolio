package com.em.config;

import org.springframework.stereotype.Component;

@Component
public class FileConfig implements IConfig {
    @Override
    public String getValue() {
        return "this-is-a-file-config";
    }
}
