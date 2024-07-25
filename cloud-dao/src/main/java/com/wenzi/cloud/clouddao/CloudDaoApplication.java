package com.wenzi.cloud.clouddao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudDaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDaoApplication.class, args);
    }

}
