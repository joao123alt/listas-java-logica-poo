package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lista1.exercicios.lista1.Exercicio4;

@SpringBootApplication
public class ExerciciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosApplication.class, args);

		Exercicio4.resolucao();
	}
 
}
 