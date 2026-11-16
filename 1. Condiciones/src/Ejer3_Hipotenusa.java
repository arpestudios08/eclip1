import java.util.Scanner;

public class Ejer3_Hipotenusa {

	public static void main(String[] args)
	{
		double cat1, cat2, hipotenusa;
		System.out.println("Indique la longitud (cm) de uno de los catetos ");
		Scanner entrada1 = new Scanner (System.in);
		cat1 = entrada1.nextDouble();
		
		System.out.println("Indique la longitud (cm) del otro cateto ");
		Scanner entrada2 = new Scanner (System.in);
		cat2 = entrada2.nextDouble();
		
		hipotenusa = Math.sqrt((cat1 * cat1) + (cat2 * cat2));
		System.out.println("La longitud de la hipotenusa es de " + hipotenusa + " cm.");
	
	
	}

	}

