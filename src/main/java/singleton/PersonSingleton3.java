package singleton;

import prototype.Person;

//Con este singleton podemos obtener la instancia y poder guardarla en un objeto de tipo Person.
public enum PersonSingleton3 {
	INSTANCE;
	Person person;
	   private PersonSingleton3() {
		   this.person = new Person();
	   }    
	   public Person getPerson()
	   {
		   return this.person;
	   }
}
