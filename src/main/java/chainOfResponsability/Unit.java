package chainOfResponsability;

import builder.Person2.PersonBuilder;

//La clase la he creado con el builder
public class Unit {
	private String name;
	//Se añade un atributo del mismo tipo
	private Unit subordinate;
	
	public Unit()
	{
	}
	
	private Unit(UnitBuilder ub)
	{
		this.name=ub.name;
		this.subordinate=ub.subordinate;
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Unit getSubordinate() {
		return subordinate;
	}



	public void setSubordinate(Unit subordinate) {
		this.subordinate = subordinate;
	}


	//Este es el comando a delegar
	public void executeCommand (String command)
	{
		//Si no tiene subordinado se ejecuta, si tiene se delega
		if(subordinate != null)
		{
			System.out.println("Orden enviada por "+name);
			subordinate.executeCommand(command);
		}
		else
		{
			System.out.println("Orden ejecutada por "+name);
		}
	}
	
	public static UnitBuilder builder() {
        return new UnitBuilder();
    }
	
	public static class UnitBuilder{
		private String name;
		private Unit subordinate;
		
		public UnitBuilder name(String name)
		{
			this.name=name;
			return this;
		}
		
		public UnitBuilder subordinate(Unit subordinate)
		{
			this.subordinate=subordinate;
			return this;
		}
		
		public Unit build()
		{
			return new Unit(this);
		}
	}

}
