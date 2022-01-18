package singleton;

import prototype.Person;

//Singleton simple, solo podemos modificar valores, no podemos tener mas de un objeto.
public class PersonSingleton {
	   private static Person INSTANCE;

	   private PersonSingleton() {}

	   public static Person getInstance() {
	       if (INSTANCE == null) {
	           INSTANCE = new Person();
	       }
	       return INSTANCE;
	   }
}