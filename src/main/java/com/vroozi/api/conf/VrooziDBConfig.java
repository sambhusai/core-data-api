package com.vroozi.api.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;

@Configuration
@EnableMongoRepositories(basePackages = "com.vroozi.api.repositories")
public class VrooziDBConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "vroozi_demo";
	}

	@Override
	public Mongo mongo() throws Exception {
		ServerAddress serverAdress = new ServerAddress("localhost", 27017);
//		MongoCredential credential = MongoCredential.createMongoCRCredential("username", "database", "password".toCharArray());
		// Do not use new Mongo(), is deprecated.
		Mongo mongo = new MongoClient(serverAdress);
		mongo.setWriteConcern(WriteConcern.SAFE);
		return mongo;
	}

	@Override
	public MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongo(), getDatabaseName());
	}

	@Override
	public String getMappingBasePackage() {
		return "com.vroozi.api.model";
	}

}