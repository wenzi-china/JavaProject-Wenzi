package com.wenzi.cloud.ui;

import com.wenzi.cloud.ui.common.ConfigurationInit;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudUiApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(CloudUiApplication.class, args);
//        SpringApplication.run(ConfigurationInit.class,args);
        System.out.println("---------------print test variable started----------");
        System.out.println(ConfigurationInit.restTemplate);
        System.out.println("---------------print test variable end----------");
    }

    @Override
    public void run(ApplicationArguments args){
        new ConfigurationInit();
        System.out.println("---------------print test variable started----------");
        System.out.println(ConfigurationInit.restTemplate);
        System.out.println("---------------print test variable end----------");
    }

}
