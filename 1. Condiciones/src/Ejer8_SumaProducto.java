import java.util.Scanner;

public class Ejer8_SumaProducto {

	public static void main (String[] args)
	
	{
		int num1, num2, suma, producto;
		
		System.out.println("Indique el valor del primer número");
		Scanner entrada1 = new Scanner(System.in);
		num1 = entrada1.nextInt();
		
		System.out.println("Indique el valor del primer número");
		
		num2 = entrada1.nextInt();
		
		if (num1 >= num2)
			
		{
			
			suma = num1 + num2;
			System.out.println("El resultado de la suma es " + suma);
			
		}
		
		else
		{
			producto = num1 * num2;
		
		System.out.println("El resultado del producto es " + producto);
		}
		
	}
}
