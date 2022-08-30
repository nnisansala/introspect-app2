package com.introsept.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.introsept.app"})
public class Introspect2Application {

    public static void main(String[] args) {
        SpringApplication.run(Introspect2Application.class, args);
    }

}
