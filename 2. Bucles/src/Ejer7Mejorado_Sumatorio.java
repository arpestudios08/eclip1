import java.util.Scanner;

public class Ejer7Mejorado_Sumatorio {

	public static void main(String[]args)
	
	{
		Scanner entrada = new Scanner (System.in);
		
		int num, suma=0;
		
		for(int cont=1; cont<20 && suma<300; cont++)
		{
			System.out.println("Indique un número");
			num= entrada.nextInt();
			suma = suma + num;
			System.out.println("El sumatorio es " + suma);
		}

	}
}
