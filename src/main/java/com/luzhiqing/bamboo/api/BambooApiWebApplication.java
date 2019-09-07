package com.luzhiqing.bamboo.api;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@EnableTransactionManagement
@EnableFeignClients(basePackages = {"com.luzhiqing.bamboo.remote","com.codingapi.tx.netty.service"})
@SpringBootApplication(scanBasePackages = "com.luzhiqing.bamboo")
@EnableSwagger2
@EnableApolloConfig
public class BambooApiWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(BambooApiWebApplication.class, args);
    }
}
