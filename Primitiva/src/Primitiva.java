import java.util.Random;

public class Primitiva {

	// Máquina de los boletos: 6 números aleatorios de 1 a 49, que no se repitan!
	
	public static byte[] getBoleto()
	{
		byte[] boleto = new byte[6];
		Random rnd = new Random();
		
		//bucle sigue mientras no tengamos los 6 números diferentes
		
		for (int cont=0; cont<boleto.length;) // sin incremento en la cabecera del for
		{
			
		}
			
	return boleto;
	
	}
	
	private static void ordenarBoleto(int[] boleto)
	{
		int min,aux;
		int posMin=0;
		for(int ind1=0; ind1<boleto.length;ind1 ++)
		{
			posMin=ind1;
			min=boleto[ind1];
			for(int ind2=ind1; ind1<boleto.length;ind2++)
			if(boleto[ind2]<min)
			{
				min = boleto[ind2];
				posMin = ind2;
			}
			aux = boleto[ind1];
			boleto [ind1] = boleto[ind2];
			posMin=ind2;
		}
		
		
	}
	
	public static boolean buscar(int num, int[] numeros )
	{
		boolean enc=false;
		
		for(int indice=0; indice<numeros.length && enc==false; indice++)
			if(num == numeros[indice]) enc=true;
		
		return enc;
	}
	
	// metodo que ordene el boleto
	
	public static long sortear (int[]boleto) {
		long numSorteos=0;
		int [] combinacionGanadora;
		//repetir hasta que acertemos
		
			//generar combinación ganadora
				compararBoletos(boleto, combinacion);
			//comparar boleto con conbinacion ganadora ->metodo
			
			// contar número de sorteos (vuelta)
		
	return numSorteos;
	}
	
	public static boolean compararBoletos (int[] boleto1, int [] boleto2)
	{
		boolean iguales=true;
		for(int ind=0; ind<boleto1.length && iguales; ind++)
			if(boleto1[] = boleto2[ind]) iguales=false;
	
	}
}
