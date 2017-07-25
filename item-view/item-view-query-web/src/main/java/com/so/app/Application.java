package com.so.app;

import com.so.config.ItemViewWebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by sergiu.oltean on 5/16/2017.
 */
@SpringBootApplication
@Import(ItemViewWebConfiguration.class)
@EnableEurekaClient
@FeignClient("http://item-service-query")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
