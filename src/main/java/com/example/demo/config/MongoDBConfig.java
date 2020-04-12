package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

@PropertySource("classpath:application.properties")
@Configuration
//@EnableMongoRepositories(basePackages = "com.example.demo.repo")
public class MongoDBConfig {

	@Value("${spring.data.mongodb.uri}")
	String uri;

//	@Bean
//	public MongoDbFactory mongoDbFactory() {
//		System.out.println(uri);
//		MongoDbFactory fact = new SimpleMongoDbFactory(new MongoClientURI(uri));
//		return fact;
//	}
//
//	@Bean
//	public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory) {
//		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory);
//		return mongoTemplate;
//
//	}

	@Bean
	public MongoClient mongoClient() {

		MongoClient mongoClient = MongoClients.create(uri);
		MongoDatabase database = mongoClient.getDatabase("userdb");
		return mongoClient;
	}

}
