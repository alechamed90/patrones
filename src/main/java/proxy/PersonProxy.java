package proxy;

//Esta clase modificaría la ejecución, por lo que implementa el mismo método de la interfaz
public class PersonProxy implements IPersonProxyInterface{

	//E implementa el un tipo de los que implementen la misma interfaz (o solo la clase en concreto)
	public IPersonProxyInterface person;

	//En el constructor obligamos a rellenar el atributo
	public PersonProxy(IPersonProxyInterface person)
	{
		this.person=person;
	}
	
	//Y a la hora de la ejecución se puede hacer llamadas a otros métodos, antes y después.
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		antes();
		person.operation();
		despues();
	}
	
	public void antes()
	{
		System.out.println("Antes");
	}
	
	public void despues()
	{
		System.out.println("Despues");
	}
	
}
