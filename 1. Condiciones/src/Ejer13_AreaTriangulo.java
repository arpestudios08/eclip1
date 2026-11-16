import java.util.Scanner;

public class Ejer13_AreaTriangulo {

	public static void main(String[] args)
	
	{
		float base, altura, area;
		
		System.out.println("Indique la base del triángulo en cm.");
		Scanner entrada = new Scanner(System.in);
		base = entrada.nextFloat();
		System.out.println("A continuación. indique la altura del triángulo en cm.");
		altura = entrada.nextFloat();
		
		if (base<0 || altura<0) 
		{
			System.out.println("No es posible determinar el área con números negativos, indique ambos con carácter positivo,");
		}
		else 
		{	area = (base * altura) / 2;
			System.out.println("El área del triángulo es de " + area + " cm^2.");
		}
	}
}


//char = car
//system.out.println("intro figura (C o R)");

//car = scanner.next().charAt(0);
//if (car == 'C')	system.out.println("Círculo");
	//else if (car == 'R')	system.out.println("Rectángulo");
		//else system.out.println("Figura no conocida");



//car = caracter