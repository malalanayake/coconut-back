package com.sysensor.coconut.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class URLConfig {
    public static final String API = "/api";
    public static final String AUTHENTICATE = API + "/authenticate";
    public static final String USER = API + "/user";
}
