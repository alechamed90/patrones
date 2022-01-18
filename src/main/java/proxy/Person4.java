package proxy;

//Person (con builder) que implementa la interfaz proxy
public class Person4 implements IPersonProxyInterface{
	public String name;
	public Integer age;

	public Person4()
	{
		
	}
	
	private Person4(PersonBuilder personBuilder) {
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
        public Person4 build () {
            return new Person4(this);
        }
    }

	//Esta sería la operación que estaría entre pre y pro operaciones
	@Override
	public void operation() {
		System.out.println("Operacion normal");
	}
}
