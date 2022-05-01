package com.andre.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andre.bookstore.service.DBservice;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBservice dbService;
	
	@Bean
	public void instanciaBaseDeDados() {
		System.out.println("Passei aqui TESTE CONFIG");
		this.dbService.instanciaBaseDeDados();
	
	}
	
	
}
