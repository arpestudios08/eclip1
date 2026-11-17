package Ejer1;

public class TestPunto 
	{

	public static void main(String[]args)
		{
		Punto punto1 = new Punto(0,1);
		
		Punto punto2 = new Punto(0,1);
		
		Punto[] linea= {punto1, punto2, new Punto(0,1), new Punto(0,1)};
		for (Punto punto: linea)
			System.out.println(punto);
		
		/*
	System.out.println(punto1.getDistancia(punto2));
	System.out.println(Punto.getDistancia(punto1, punto2));
	System.out.println("Distancia origen: " + punto1.getDistanciaOrigen());
		*/
		}
	}
