package decorador;

//Esta clase tambien implementa la interfaz
public class PersonDecorator implements IPersonInterface{

	//Pero contiene un atributo del tipo a decorar
	private Person3 person;
	
	//Con un constructor que rellena el atributo
	public PersonDecorator(Person3 p)
	{
		this.person=p;
	}
	
	//Y ambos métodos que modifican al método del atributo.
	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return this.person.getAge()+100;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Nombre: "+this.person.getName();
	}

}
