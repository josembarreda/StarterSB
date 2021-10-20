package com.nttdata.bootcamp.StarterSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.Class.Saludo;

@SpringBootApplication
public class StarterSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterSbApplication.class, args);
		
		Saludo saludo = new Saludo ("Ingles");
		System.out.println(saludo.mensajeSaludo());
	}

}
