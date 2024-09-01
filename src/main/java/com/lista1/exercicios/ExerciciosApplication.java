package com.lista1.exercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosApplication.class, args);

		Exercicio2.resolucao();
	}

}
 