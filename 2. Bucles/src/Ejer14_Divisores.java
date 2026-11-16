/*import java.util.Scanner;

public class Ejer14_Divisores {

	public static void main(String[] args) 

	{
//Entrada de datos
// Generar posibles divisores: bucle de 1 al número
// Si con % ->divisor
// Contar cunatos divisores van saliendo contDivisores
// salir cuando llega la numero de divisores que me han pedido
// comparar contDivisores con maxDivisores

//Mostrar datos
		
Scanner entrada = new Scanner (System.in);

int m, n; 

System.out.println("Introduce un número M para buscar sus divisores");
m = entrada.nextInt();

System.out.println("Ahora, introduce la cantidad N de divisores que desee obtener");
n= entrada.nextInt();

int contador=0;

for(int i=1;i<=n ;i++)
{
	
	if(m % i ==0)
	{
		System.out.println(i + " ");
		contador++;
	}

		if (contador==n)
		{
			break;
		}
}
if (contador<n)
	System.out.println("\n(Nota: El número " + m + " solo tiene " + contador + " divisores en total)");
	}}

*/

import java.util.Scanner;

public class Ejer14_Divisores {

	public static void main(String[] args) 

	{
		int num, maxDivisores;
		
		num=12;
		maxDivisores=3;
		
		for(int posiblesDivisores=1, contDivisores=0; posiblesDivisores<=num && contDivisores<maxDivisores; posiblesDivisores++)
		{
			if(num%posiblesDivisores==0) 
				{
				System.out.println(posiblesDivisores);
				contDivisores++;
				}
			
			
		}
	}
}



