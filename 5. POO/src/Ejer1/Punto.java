package Ejer1;

public class Punto 
{
private double puntoX,puntoY;

Punto () 
	{
	puntoX=puntoY=0;
	}

	Punto (double puntoX, double puntoY)
	{
		this.puntoX = puntoX;
		this.puntoY = puntoY;
	}

	Punto (Punto punto)
	{
		this.puntoX = punto.puntoX;
		this.puntoY = punto.puntoY;
	}
	
	
	public double getDistancia(Punto punto)
	{
		return Math.sqrt(Math.pow((this.puntoX - punto.puntoX),2) + Math.pow(this.puntoY - punto.puntoY ,2));
	}
	
	public String toString()
	{
		return "PuntoX: " + puntoX + "\tPuntoY: " + puntoY + "\t(" + puntoX + ", " + puntoY + ")";
	}

	public double getDistanciaOrigen()
	{
		return getDistancia(new Punto(0,0)); //reutilizo el método anterior, pasándole un nuevo punto con 0,0
	}
	
	public static double getDistancia(Punto punto1, Punto punto2) 
	{
		return punto1.getDistancia(punto2);
	}
	
	
}
