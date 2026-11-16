import java.util.Scanner;

public class Ejer14_SalarioObrero {

	public static void main(String[] args)
	
	{
		int numhoras, salario1, salario2;
		
		System.out.println("Indique el número de horas que ha trabajado.");
		
		Scanner entrada = new Scanner (System.in);
		numhoras = entrada.nextInt();
		
		if (numhoras <= 40)
		{
			salario1 = numhoras*16;
			System.out.println("Su salario por haber trabajado con un máximo de hasta 40 horas es de " + salario1 + " euros.");
		}
		else if (numhoras>40)
		{
			salario2 = (16*40)+20*(numhoras-40);
			System.out.println("Su salario por haber trabajado más de 40 horas es de " + salario2 + " euros.");
		}
	}
}
