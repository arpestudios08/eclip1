import java.util.Scanner;

public class Ejer3_ImparesEntreN1N2 {

	public static void main(String[] args)
	
	{
		int num1, num2;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Este programa te dice los números impares comprendidos entre los números que facilites");
		System.out.println("Introduce el primer número");
		num1 = entrada.nextInt();
		System.out.println("Introduce el segundo número");
		num2 = entrada.nextInt();
		
		int inicio = Math.min(num1, num2);
		int fin = Math.max(num1, num2);
		
		System.out.println("El número menor es el " + inicio + "y el número mayor es el " + fin);
		for (int i = inicio; i <= fin; i++)
		{if (i%2!=0) 
			{
			System.out.println(i);
			}
		}
		
		
		
	}
}



int num1=3, num2=7
string resultado= " ";
for(int cont=num1, cont<=2; cont +=2)
resultado += "\t" + cont
system.err.println(resultado);
