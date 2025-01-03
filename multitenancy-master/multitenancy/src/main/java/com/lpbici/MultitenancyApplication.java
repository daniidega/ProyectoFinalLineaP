package com.lpbici;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.lpbici.config.MultitenancyProperties;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableConfigurationProperties(MultitenancyProperties.class)
public class MultitenancyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultitenancyApplication.class, args);
    }
}
