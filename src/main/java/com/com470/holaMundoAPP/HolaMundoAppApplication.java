package com.com470.holaMundoAPP;

import com.com470.holaMundoAPP.repository.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolaMundoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaMundoAppApplication.class, args);
                
                Persona personaA=new Persona("juan","Perez");
                Persona personaB = new Persona("Marco","Torrez");
                
	}

}
