package prototype;

//Person que implementa la interfaz y el método clone
public class Person implements IPrototype{
	public String name;
	public Integer age;

	public Person()
	{
		
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

	@Override
	public Person Clone() {
		Person p=new Person();
		p.setName(this.name);
		p.setAge(this.age);
		return p;
	}
}
