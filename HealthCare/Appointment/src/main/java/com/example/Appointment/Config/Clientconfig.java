package com.example.Appointment.Config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Clientconfig {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL; // Enables detailed logs
    }

    @Bean
    public Request.Options options() {
        return new Request.Options(5000, 10000); // Set connection and read timeouts
    }
}
