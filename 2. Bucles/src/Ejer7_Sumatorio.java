import java.util.Random;
import java.util.Scanner;

public class Ejer7_Sumatorio {

	public static void main(String[] args)
	
	{
		Scanner entrada = new Scanner (System.in);
		
		int min=Integer.MAX_VALUE, num, suma=0, cont;
		float media;
		String respuesta="s";
		Random random = new Random();
		
		
		
		for (cont = 1; respuesta.equalsIgnoreCase("S") ; cont++)
		{
			num = random.nextInt(1, 11);
			System.out.println(num);
			/*if(cont==1) min=num;
			else if (num<min) min=num;
			*/
			suma = suma + num;
			if(cont==1 || num<min) min=num; 
			
			System.out.println("¿Quieres continuar? (S/N)");
			respuesta = entrada.next();
			
		}
			
		if ((cont - 1) != 0) // Es interesante siempre prevenir la división entre cero
		{
			media = (float)suma / (cont - 1);
			System.out.println("Media " + media);
		}
		
		System.out.println("Mínimo " + min);
		System.out.println("Fin");
			
	}
}
