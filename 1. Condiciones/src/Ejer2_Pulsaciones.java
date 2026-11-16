import java.util.Scanner;

public class Ejer2_Pulsaciones {

	public static void main(String[] args)
	{
	float pulsaciones, edad;
	Scanner entrada = new Scanner (System.in);
	System.out.println("Indique cual es su edad: ");
	edad = entrada.nextInt();
	
	pulsaciones = (220 - edad) / 10;
	
	System.out.println("Su número de pulsaciones por cada 10 segundos de ejercicio es " + pulsaciones + " pulsaciones");
	
	entrada.close();

	}
}
