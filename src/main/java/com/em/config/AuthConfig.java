package com.em.config;

import org.springframework.stereotype.Component;

@Component
public class AuthConfig implements IConfig {
    @Override
    public String getValue() {
        return "this-is-a-auth-config";
    }
}
