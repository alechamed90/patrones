package com.example.patrones.patrones;


import singleton.*;
import strategy.Conectar;
import strategy.EstrategiaFacebook;
import strategy.EstrategiaGoogle;
import builder.*;
import chainOfResponsability.Unit;
import decorador.Person3;
import decorador.PersonDecorator;
import prototype.*;
import proxy.Person4;
import proxy.PersonProxy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatronesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PatronesApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
		//Singleton
		PersonSingleton.getInstance().setName("Antonio");
		PersonSingleton.getInstance().setName("Alejandro");
		System.out.println("Nombre "+PersonSingleton.getInstance().getName());
		PersonSingleton2.INSTANCE.setName("Paco");
		System.out.println("Nombre "+PersonSingleton2.INSTANCE.getName());
		PersonSingleton3.INSTANCE.getPerson().setName("Antonio");
		System.out.println("Nombre "+PersonSingleton3.INSTANCE.getPerson().getName());
		
		
		
		
		System.out.println("\nPrototype");
		//Prototype
		Person p2=PersonSingleton.getInstance().Clone();
		System.out.println(PersonSingleton.getInstance().getName());
		System.out.println(p2.getName());
		System.out.println(PersonSingleton.getInstance());
		System.out.println(p2);
		
		
		
		System.out.println("\nBuilder");
		//Builder
		Person2 person = Person2.builder().age(45).name("Alfonso").build();
		System.out.println(person.getName());
	
		System.out.println("\nDecorator");
		//Decorator
		Person3 per3=Person3.builder().age(45).name("Paco").build();
		PersonDecorator pd=new PersonDecorator(per3);
		System.out.println(pd.getAge());
		
		System.out.println("\nProxy");
		//Proxy
		Person4 per4=Person4.builder().age(45).name("Paco").build();
		PersonProxy pp=new PersonProxy(per4);
		pp.operation();
		
		System.out.println("\nStrategy");
		//Estrategia
		Conectar con=new Conectar();
		con.setEstrategia(new EstrategiaGoogle());
		con.conectar();
		con.setEstrategia(new EstrategiaFacebook());
		con.conectar();
		
		System.out.println("\nCadena de comando");
		//Cadena de comando
		Unit s=Unit.builder().name("Soldado").build();
		Unit c=Unit.builder().name("Capitan").subordinate(s).build();
		Unit sar=Unit.builder().name("Sargento").subordinate(c).build();
		
		sar.executeCommand("Orden");
		
	}

}
