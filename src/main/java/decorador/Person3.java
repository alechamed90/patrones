package decorador;

//La clase Person modificada solo para el decorador y el builder (por comodidad)
//Implementa la interfaz creada, y con los métodos implementados.
public class Person3 implements IPersonInterface{
	public String name;
	public Integer age;

	public Person3()
	{
		
	}
	
	private Person3(PersonBuilder personBuilder) {
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
	
	public static PersonBuilder builder() {
        return new PersonBuilder();
    }

	public static class PersonBuilder {
        private String name;
        private int age;
        public PersonBuilder name (String name) {
            this.name = name;
            return this;
        }
        public PersonBuilder age (int age) {
            this.age = age;
            return this;
        }
        public Person3 build () {
            return new Person3(this);
        }
    }
}
