package fi.tuni.koodimankelit.antibiootit.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi customApi() {
        return GroupedOpenApi.builder()
                .group("Antibiootit API")
                .packagesToScan("fi.tuni.koodimankelit.antibiootit")
                .build();
    }

    // TODO: Add appropriate info about API
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                .title("Antibiootit API")
                .version("1.0.0")
                .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                .description("description")
                .contact(new Contact().name("name").email("email")))
                .addServersItem(new Server().url("http://localhost:8080"));
    }    
}