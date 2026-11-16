import java.util.Scanner;

public class Ejer17_DeporteTemperatura {

	public static void main(String[] args)
	
	{
		float temperatura;
		
		System.out.println("Indique el valor de la temperatura");
		
		Scanner entrada = new Scanner (System.in);
		
		temperatura = entrada.nextFloat();
		
		if (temperatura > 85)
			System.out.println("Es apropiado que realice natación con esta temperatura");
		else if (temperatura > 70 && temperatura <= 85)
			System.out.println("Es apropiado que realice tenis con esta temperatura");
			else if (temperatura > 32 && temperatura <= 70)
				System.out.println("Es apropiado que realice golf con esta temperatura");
				else if (temperatura > 10 && temperatura <= 32)
					System.out.println("Es apropiado que realice esquí con esta temperatura");
					else if (temperatura <= 10)
						System.out.println("Es apropiado que realice deportes de interior con esta temperatura");


	}
}
