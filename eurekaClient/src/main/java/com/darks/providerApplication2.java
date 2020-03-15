package com.darks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class providerApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(providerApplication2.class,args);
    }
}
