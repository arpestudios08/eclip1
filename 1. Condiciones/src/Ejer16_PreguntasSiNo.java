import java.util.Scanner;

public class Ejer16_PreguntasSiNo 
{

	public static void main(String[] args)
	
	{
		
		String r1, r2, r3;
		
		System.out.println("Responde a las siguientes preguntas mediante las palabras SI o NO.");
		
		System.out.println("Pregunta 1: ¿Colón descubrió América?");
		Scanner entrada = new Scanner (System.in);
		r1 = entrada.nextLine();
		
		if (r1.equalsIgnoreCase("SI"))
		{
			System.out.println("La respuesta es correcta, continúe");
			System.out.println("Pregunta 2: ¿Es Paría capital de Bélgica?");
			r2 = entrada.nextLine();
			if (r2.equalsIgnoreCase("NO"))
			{
				System.out.println("La respuesta es correcta, continúe.");
				System.out.println("Pregunta 3: ¿Los Beatles era un grupo de rock americano?");
				r3 = entrada.nextLine();
				if (r3.equalsIgnoreCase("NO"))
				{
					System.out.println("Felicidades, has superado la prueba.");
				}
				else
					System.out.println("Has fallado en esta ocasión, inténtelo de nuevo");
			}
			else
				System.out.println("Has fallado en esta ocasión, inténtelo de nuevo");
			}
		else
		{
			System.out.println("Has fallado en esta ocasión, inténtelo de nuevo");
		}
	}
}
