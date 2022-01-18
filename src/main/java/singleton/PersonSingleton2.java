package singleton;

import prototype.Person;

//Igual que el otro singleton, pero con la diferencia que se inicializa la instancia.
//Al ser un objeto estático se puede obtener la instancia desde fuera.
public class PersonSingleton2 {
   public static final Person INSTANCE = new Person();
	    
   private PersonSingleton2() {
	        super();
   }
}
