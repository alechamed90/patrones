package strategy;

//Conectar será el método el cual cambie la ejecución según la situacion.
//Por lo que implementa la interfaz
public class Conectar implements IEstrategia{
	
	//Cualquiera de las estrategias
	public IEstrategia contexto;
	
	public Conectar()
	{
		
	}
	
	//Se establece la estrategia a ejecutar
	public void setEstrategia(IEstrategia e)
	{
		contexto=e;
	}

	//A la hora de llamar al método, se ejecutaría segun el
	//contexto, que seria una de las clases que implementen la interfaz
	public void conectar() {
		//Hace la llamada de contexto
		contexto.conectar();
	}

}
