import java.util.Scanner;

public class Ejer3_1 {

	public static void main(String[]args)
	
	{
		int limInf, limSup;
		String resultado = " ";
		Boolean salir=false;
		Scanner entrada = new Scanner (System.in);
	
	do {
		
		do 
		{
			System.out.println("Intro límite inferior");
			limInf =  entrada.nextInt();
			System.out.println("Intro límite superior");
			limSup = entrada.nextInt();
		}
		while (limInf>limSup);
		if (limInf == 0 && limSup == 0) salir=true;
		
		if (limInf%2==0) limInf++;
				
			for(int cont=limInf; cont<=limSup; cont +=2)
				resultado += "\t" + cont;
			
			System.err.println(resultado);
		}
			while (salir == false);
	}
}
