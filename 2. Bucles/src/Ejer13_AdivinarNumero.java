import java.util.Scanner;

public class Ejer13_AdivinarNumero {

	public static void main(String[]args)
	
	{
		int contIntentos=0, num, numSecreto=(int)(Math.random()*99)+1;
		final int MAX_INTENTOS=5;
		
		Scanner entrada = new Scanner(System.in);
		
		num=entrada.nextInt();
		/*
		contIntentos++;
		if(num==numSecreto) System.out.println("Acertaste");
			else if (num<numSecreto)System.err.println("El número secreto es mayor");
				else System.err.println("El número secreto es menor");
		System.out.println("Número de intentos " + contIntentos);
		
		*/
		
	do
		{
		contIntentos++;
			if(num==numSecreto) System.out.println("Acertaste");
				else if (num<numSecreto)System.err.println("El número secreto es mayor");
					else System.err.println("El número secreto es menor");

		}
		while(contIntentos<=5);
		
		
				
	System.out.println("Número de intentos " + contIntentos);

		System.out.println(numSecreto);
		
		
	}
}
