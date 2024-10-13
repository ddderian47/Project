package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Jerseyconfig extends ResourceConfig {

    public Jerseyconfig(){

        packages("com.example.demo.Services");
        System.out.println(" cualquier vaina");



    }


}
