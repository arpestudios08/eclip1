import java.util.Scanner;

public class Ejer1_Valor_Absoluto {

	public static void main(String[] args) 
	{
		int num1, valorabsoluto;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Facilite un número: ");
		num1 = entrada.nextInt();
		
if (num1 >= 0)
		
			valorabsoluto = num1;
			
		else
			valorabsoluto = num1 * (-1);

	System.out.println("El valor absoluto de este número es: " + valorabsoluto);
		
			
		entrada.close();
		
	}

}
