import java.util.Scanner;

public class Ejer11_CalcularArea {

	public static void main(String[] args)
	
	{
		String letra;
		double radio, base, altura, areacirculo, arearectangulo;
		
		System.out.println("Introduce la letra C (si desea el área de un círculo) o bien R (si desea el área de un rectángulo)");
		Scanner entrada = new Scanner (System.in);
		letra = entrada.nextLine();
		
		if (letra.equalsIgnoreCase("C"))
		{
		System.out.println("Perfecto, ahora especifíca el radio del círculo en cm.");
		radio = entrada.nextDouble();
		areacirculo = Math.PI * Math.pow(radio, 2); 
		System.out.println("El área del círculo es de " + areacirculo + " cm.");
		}
			else if (letra.equalsIgnoreCase("R"))
			{
				System.out.println("Perfecto, ahora especifica la base del rectángulo en cm.");
				base = entrada.nextDouble();
				System.out.println("A continuación, especifíca la altura del rectángulo en cm.");
				altura = entrada.nextDouble();
				arearectangulo = base * altura;
				System.out.println("El área del rectángulo es de " + arearectangulo + " cm^2.");
			}
				else
				{
					System.out.println("Ese caracter no presenta ninguna operación");
				}
		entrada.close();
	}
}
