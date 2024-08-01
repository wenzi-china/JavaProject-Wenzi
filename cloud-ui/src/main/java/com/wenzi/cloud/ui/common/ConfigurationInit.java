package com.wenzi.cloud.ui.common;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class ConfigurationInit {
    public static RestTemplate restTemplate;

    @Bean
    private static void initClass(){
        restTemplate = new RestTemplate();
    }

}
