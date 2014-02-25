package com.akelio.speed.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.akelio"})
@EnableAutoConfiguration
//@PropertySource("classpath:application.properties")
public class Application {

    public static void main(String[] args) {
    	SpringApplication app = new SpringApplication(Application.class); 
        app.setShowBanner(false); 
        app.run(args);
    }
}
