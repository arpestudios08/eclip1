package animal;

public class Animal 
{
	private String especie;
	private int edad;

	Animal(String espe, int ed) // Este es el constructor (lleva paréntesis)	(se tiene que llamar obligatoriamente igual que el nombre de la clase y del archivo)
	{
		this.especie=especie;
		this.edad=edad;
	}

	
	public int getEdad()
	{
		return edad;
	}
	
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	
		
	
	public String getEspecie()
	{
		return especie;
	}
	
	public void setEspecie(String especie)
	{
		if(edad>=0)
		this.especie=especie;
	}
	
	
	
	public String mostrarEspecie()
	{
		return "Especie: " + especie + "\tEdad: " + edad;
	}
	
	
	public String toString()
	{
		return "Especie: " + especie + "\tEdad: " + edad;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
