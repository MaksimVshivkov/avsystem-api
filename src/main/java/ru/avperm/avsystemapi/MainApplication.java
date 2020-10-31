package ru.avperm.avsystemapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

import org.h2.tools.Console;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EnableCaching
public class MainApplication {

    public static void main(String[] args) throws Exception {
        //SpringApplication.run(MainApplication.class, args);
        ApplicationContext context = SpringApplication.run(MainApplication.class);
        Console.main(args);
    }

}
