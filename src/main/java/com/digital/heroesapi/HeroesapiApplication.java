package com.digital.heroesapi;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDynamoDBRepositories
@SpringBootApplication
public class HeroesapiApplication {
//para fazer subirt o projeto
	public static void main(String[] args) {
		SpringApplication.run(HeroesapiApplication.class, args);
		   System.out.println("super poderes com webflux");
	}

}
