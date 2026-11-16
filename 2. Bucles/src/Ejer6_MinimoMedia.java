import java.util.Random;
import java.util.Scanner;

public class Ejer6_MinimoMedia {

	public static void main(String[] args)
	
	{
		Scanner entrada = new Scanner (System.in);
		
		int min=Integer.MAX_VALUE, num;
		String respuesta="s";
		Random random = new Random();
		
		
		
		for (int cont = 1; respuesta.equalsIgnoreCase("S") ; cont++)
		{
			num = random.nextInt(1, 11);
			System.out.println(num);
			/*if(cont==1) min=num;
			else if (num<min) min=num;
			*/
			if(cont==1 || num<min) min=num; 
			System.out.println("¿Quieres continuar? (S/N)");
			respuesta = entrada.next();
			
		}
		System.out.println(min);
		System.out.println("Fin");
			
	}
}
