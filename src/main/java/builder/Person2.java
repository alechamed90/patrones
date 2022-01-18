package builder;

//He modificado este person para ver solo que hay que añadir en el Person para ver el builder.
public class Person2{
	public String name;
	public Integer age;

	public Person2()
	{
		
	}
	
	//Con este método se ejecuta en el builder (build) para que pueda devolver una Person
	private Person2(PersonBuilder personBuilder) {
        super();
        this.name = personBuilder.name;
        this.age = personBuilder.age;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	//Con este método podemos llamar desde fuera al builder que nos crea el tipo PersonBuilder.
	public static PersonBuilder builder() {
        return new PersonBuilder();
    }

	//Esta clase la tenemos que crear dentro para que podamos utilizar el builder
	public static class PersonBuilder {
        private String name;
        private int age;
        
        //Al llamar al .name se puede cambiar el nombre
        public PersonBuilder name (String name) {
            this.name = name;
            return this;
        }
        //Al llamar al .age se puede cambiar la edad
        public PersonBuilder age (int age) {
            this.age = age;
            return this;
        }
        
        //Al llamar el build se crea ya el Person
        public Person2 build () {
            return new Person2(this);
        }
    }
}
