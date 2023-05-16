package com.zdz;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringBootDemoActuatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoActuatorApplication.class,args);
    }
}
