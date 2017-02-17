package com.coffee.model.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;


@Configuration
@EnableMongoRepositories("com.coffee.model.repository")
public class SpringMongoConfig extends AbstractMongoConfiguration{

    @Override
    protected String getDatabaseName() {
        return "coffeeCup";
    }

    @Bean
    public Mongo mongo() throws UnknownHostException {
        return new MongoClient("localhost");
    }
    
    @Bean
    public MongoTemplate mongoTemplate() throws UnknownHostException {
        return new MongoTemplate(mongo(), "coffeeCup");
    }


}
