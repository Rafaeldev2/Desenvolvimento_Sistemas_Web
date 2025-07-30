package com.senai.estudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaWebApplication.class, args);
		System.out.println("Teste de sistema web!");
	}

}
