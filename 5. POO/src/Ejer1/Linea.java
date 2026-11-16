package Ejer1;

public class Linea {

	private Punto punto1, punto2;
	/*
	Linea (Punto punto1, Punto punto2)
	{
		this.punto1=punto1;
		this.punto2=punto2;
	}
	
	Linea (double x1, double y1, double x2, double y2)
	{
		this.punto1=new Punto (x1,y1);
		this.punto2=new Punto (x2,y2);
	}
	 */
	Linea (Punto punto1, Punto punto2)
	{
		this.punto1=new Punto(punto1);
		this.punto2=new Punto (punto2);
	}
	
	public double longitudLinea()
	{
		return punto1.getDistancia(punto2);
	}
	
	public String toString()
	{
		return "Punto 1: " + punto1 + "\tPunto 2: " + punto2;
	}

}
