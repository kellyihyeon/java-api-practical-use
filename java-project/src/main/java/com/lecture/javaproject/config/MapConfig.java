package com.lecture.javaproject.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@ConfigurationProperties(prefix = "map")
@Configuration
public class MapConfig {

    private String clientId;
    private String clientSecret;

}
