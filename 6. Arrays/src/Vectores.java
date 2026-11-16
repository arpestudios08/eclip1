import java.util.Random;

public class Vectores {

	//Método que acepte un vector de enteros y los muestre por pantalla
	public static String mostrar (int[] numeros)
	
	{
		String resultado="";
		for (int numero: numeros)
			resultado += "\t" + numero;
			return resultado;
	}
	
	
	// Método que retorne el mayor de un vector de números
	
	public static int getMayor (int[] numeros)
	{
		int mayor = numeros[0];
		for (int numero: numeros)
			if (numero>mayor) mayor=numero;
		return mayor;
	}

	// Método que realice una búsqueda (un dato y un vector y me diga si está)
	
	
	public static boolean buscarPos (int num, int[] numeros)
	{
		boolean encontrado=false;
		
		for (int indice=0; indice<numeros.length && !encontrado; indice++)
		{
			if (num==numeros[indice]) encontrado = true;
			
		}
		
		return encontrado;
	}
		
		
	// Método que calcule la media de un vector de entero
		
		public static float getMedia (int[] numeros)
		{
			float suma=0;
			for (int num: numeros)
				{
				suma += num;
				}
				
		return suma/numeros.length;
	}
	
	// Método que acepte un vector de chars y las ponga todas en mayúsuculas
		
		public static void setMayusculas (char[] vectorPalabra)
		{
			for (int ind=0;ind<vectorPalabra.length; ind++)
			
				if(vectorPalabra[ind]>='a' && vectorPalabra[ind]<='z')
					vectorPalabra[ind] = (char)(vectorPalabra[ind]-('a'-'A'));
			
		}

	// Método que copia un vector
		
		public static int[] copiarVector(int[] vector) {
		    int[] copia = new int[vector.length];
		    for (int ind = 0; ind < vector.length; ind++) {
		        copia[ind] = vector[ind];
		    }
		    return copia;
		}
		// Ojo: int[] b = a; NO copia, ambos nombres apuntan al mismo vector.
	
	
	//Método que invierta un vector
		
		public static void invertir(int[]vector) {
			int[] invertir = new int[vector.length];
			for (int ind1=0, ind2=vector.length-1;ind1<vector.length; ind1++, ind2--)
			{
		        invertir[ind2] = vector[ind1];
			}
		}
		
	//Método que acepte un vector y un número y el retorne el número de veces que aparece
			
			public static int getVeces (int[] numeros, int num)
			{
				int veces=0;
				for(int numero: numeros)
				{
					if(numero==num) veces++;
				}
				return veces;
			}
			
			
			
	//Método que devuelva un vector con todas las posiciones dónde está un número pasado como argumento
			
			public static int[] getVectorRepeticiones (int[] vector, int num)
			{
				int[] vectorRepe = new int[getVeces(vector, num)];
						
						for (int ind1=0; ind1< vector.length; ind1++)
						{
						}
							
				return vectorRepe;
			}
	
	//
		public static String[] sorteoExposicion (String[] alumnos)
		{
			String[] elegidos=new String[alumnos.length];
			int cont=0, ale;
			Random rnd = new Random();
			
			do { ale=rnd.nextInt(0, alumnos.length);
				
				if(!alumnos[ale].equals(""));
				{
					elegidos[cont] = alumnos[ale];
					alumnos[ale]="";
					cont++;
				}
			}while (cont<elegidos.length);
			return elegidos;
		}
	
	
		
		public static boolean compararArrays (int[] vector1, int[] vector2)
		{
			boolean iguales=true;
			if(vector1.length != vector2.length) iguales=false;
			
			else for(int ind=0; ind<vector1.length && iguales; ind++)
				{
					if(vector1[ind]!=vector2[ind]) iguales=false;
				}
			
			return iguales;
		}
	
		
		//Ejer5_Arrays: 
		
		// public static int[] productoArrays (int[] vector1, int[] vector2)
		//debe crear 
		
		//Ejer6_
		
		public static String imprimeAsterisco()
		{
			String resul="";
			Random rnd = new Random();
			int[] vector = new int[rnd.nextInt(2,6)];
			
			for(int ind=1;ind<vector.length;ind++)
			{
				vector[ind] = rnd.nextInt(1,6);
				resul=resul + "\n" + filaAsteriscos(vector[ind]);
			}	
		return resul;
		}
		
		
		public static String filaAsteriscos (int num)
		{
			String resultado="";
			for(int cont=1; cont<=num; cont++)
				resultado+="*";
			return resultado;
		}
	
	
		
	
}

