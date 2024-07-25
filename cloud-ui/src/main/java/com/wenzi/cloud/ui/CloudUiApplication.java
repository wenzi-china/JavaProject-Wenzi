package com.wenzi.cloud.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudUiApplication.class, args);
    }

}
