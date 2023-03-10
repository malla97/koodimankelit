package fi.tuni.koodimankelit.antibiootit.database;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 * MongoDB configuration class
 */
@Configuration
@EnableMongoRepositories(basePackages = "fi.tuni.koodimankelit.antibiootit.database")
@PropertySource(value="classpath:secrets.properties", ignoreResourceNotFound = true)
public class MongoDBConfig extends AbstractMongoClientConfiguration {

    @Value("${MONGO_URL}")
    private String MONGO_URL;

    @Override
    protected String getDatabaseName() {
        return "antibioticApplication";
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create(MONGO_URL);
    }

    @Bean
    public MongoTemplate mongoOperations() {
        return new MongoTemplate(mongoClient(), getDatabaseName());
    }
}
