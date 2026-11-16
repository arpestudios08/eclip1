import java.util.Scanner;

public class Ejer7_Llamada {
	
	public static void main(String[] args)
	
	{
		float tiempollamada, preciollamada;
		
		System.out.println("Indique cuantos minutos ha durado su llamada (solo el valor de los minutos)");
		Scanner entrada1 = new Scanner (System.in);
		tiempollamada = entrada1.nextFloat();
		
		if (tiempollamada <= 3);
				
				{
					System.out.println("El costo de su llamada es de 0.10 céntimos");
				}
			
		else
		
			preciollamada = (0,1 + 0,0375);
			System.out.println("El costo de su llamada es de " + preciollamada + " euros.");
		
	}

}
