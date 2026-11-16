import java.util.Scanner;
import java.util.Random;

public class Ejer2_DatosFamilia {

	public static void main(String[] args) 
	
	{
		Scanner entrada = new Scanner (System.in);
		Random rnd= new Random();
		
		String familia, familiaMaxHijos="";
		float salario, media=0, suma=0, contFamiliasMayor3Hijos=0;
		int numHijos, edad, contHombresMayores=0, minEdad, maxNumHijos=0;
		char sexo;
		final int MAX_FAMILIAS=2;
		
		
		
		for(int contFamilias = 1; contFamilias<=MAX_FAMILIAS; contFamilias++)
		{
			System.out.println("Introduce el nombre de la familia: ");
			familia = entrada.next();
			
			salario= rnd.nextFloat(1221,3000);
			System.out.println("\tSalario: " + salario);
			
			
			numHijos = rnd.nextInt(3,4);
			System.out.println("\tNº de hijos: " + numHijos);
			
			if (numHijos>=3)
			{
				contFamiliasMayor3Hijos++;
				suma+=salario;
			}
			
			if(contFamilias==1) 
			{
				maxNumHijos=numHijos;
				familiaMaxHijos=familia;
			}
			else if(numHijos>maxNumHijos)
			{
				maxNumHijos=numHijos;
				familiaMaxHijos=familia;
			}
				else if(numHijos==maxNumHijos)
			
					familiaMaxHijos=familiaMaxHijos + "y" + familia;
		
		
			contHombresMayores=0;
			minEdad=200;
			
			for(int contNumHijos=1; contNumHijos<=numHijos; contNumHijos++)				
			{
				edad=rnd.nextInt(0,100);
				
				//INICIALIZACION
					
				if(rnd.nextInt(1,3) == 1) sexo = 'H';
				else sexo = 'M';
				
				if(edad>=18 && sexo=='H') contHombresMayores++;
				System.out.println("Edad: " + edad + "\tSexo: " + sexo);
				
				if (edad<minEdad) minEdad=edad;
			}//buclehijos
				
			//VISTA
			System.out.println("Menor de esta familia: " + minEdad);
			System.out.println("\tNº hijos mayores de edad " + contHombresMayores);

				
			
		
		}//bucle de todas las familias
	
	if(contFamiliasMayor3Hijos>0)
	{
		media=suma/contFamiliasMayor3Hijos;
		System.out.println("\tEl salario media de las familias con más de tres hijos es de " + media + " euros");
	}
		
	System.out.println("\tFamilia con más hijos: " + familiaMaxHijos);
	}
}
