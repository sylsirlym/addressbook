package com.skills.addressbook.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/**
 * Created by Sylvester Musyoki
 * Project addressbook
 * User: sylvester.musyoki
 * Date: 13/09/2021
 * Time: 22:25
 */
@Configuration
public class SpringFoxConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.skills"))
                .paths(PathSelectors.ant("/api/*"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Address Book API",
                "Simple API to manage Addresses.",
                "1.0",
                "Terms of service",
                new Contact("Sylvester Musyoki", "www.example.com", "musyokisyl81@gmail.com"),
                "License of API",
                "API license URL",
                Collections.emptyList());
    }
}
