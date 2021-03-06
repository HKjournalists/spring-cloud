package com.lzy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CompanyServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CompanyServiceApplication.class).web(true).run(args);
    }
}
