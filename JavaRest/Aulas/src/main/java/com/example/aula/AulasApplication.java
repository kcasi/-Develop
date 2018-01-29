package com.example.aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan; 
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.cglib.core.ReflectUtils;

@SpringBootApplication 
@EntityScan(basePackages = { 
		"com.example.aula.model" 
		}) 
@EnableJpaRepositories(basePackages = { 
		"com.example.aula.repository" 
		})

public class AulasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulasApplication.class, args);
	}
}
