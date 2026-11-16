import java.util.Scanner;

public class Ejer5_Salario {

	public static void main (String[] args)
	
	{
		double anteriorsalario, nuevosalario;
		System.out.println("Indique cual es el valor del salario anterior del obrero");
		Scanner entrada = new Scanner (System.in);
		anteriorsalario = entrada.nextDouble();
		
		nuevosalario = anteriorsalario + (0.25 * anteriorsalario);
		
		System.out.println("El nuevo salario del obrero es " + nuevosalario + " euros.");
		
		entrada.close();
		
		
		
	}
}
