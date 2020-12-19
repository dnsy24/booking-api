package com.example.bookingapi.config;

import com.example.bookingapi.datastorage.DataStorageImpl;
import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public DataStorageImpl dataStorage() {
        return new DataStorageImpl();
    }

    @Bean
    public Faker faker() {
        return new Faker();
    }

}
