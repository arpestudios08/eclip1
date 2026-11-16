/*import java.util.Scanner;

public class Ejer9_CaracteresAes {

	public static void main(String[] args) 
	//la variable de una clase guarda la direccion del objeto
	{
		Scanner entrada = new Scanner (System.in);
		
		String caracter;
		
		System.out.println("Introduzca un carácter, $ para finalizar");
		caracter = entrada.next();
		
		if(caracter==$)
			System.out.println("Ya no puedes introducir más carácteres y el número total de aes es de " +);
		
		
	}

}

*/


import java.util.Scanner;

public class Ejer9_CaracteresAes {

	public static void main(String[] args) 
	
	{
	char letra= ' '; // caracter nulo o espacio comillas con espacio
	int contAes=0;
	
	Scanner entrada = new Scanner (System.in);
	do
		{
			System.out.println("Intro letra: ");
			letra = entrada.next().charAt(0);
			if (letra == 'a' || letra == 'A') contAes++;
			// if (Character.toUpperCase(letra)=='A');
		}
		
	while(letra!='$');
	System.out.println("Nº de aes: " + contAes);
	
	}
	

}

