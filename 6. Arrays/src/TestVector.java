import java.util.Arrays;

public class TestVector {

	public static void main(String[] args) {
		
		//String[] nombres = new String[3];		Creamos las variables
		//nombres[2] = "Manuel";				Las definimos una a una
		
		//String[] nombres = {"Alberto", "María", "Juan"};		// Creamos las variables con el nombre inicialmente
		
		
		
		//System.out.println(nombres[2]);

		//System.out.println(Arrays.toString(nombres)); muestra todas las variables. 
		
		
		/*for (int ind=0; ind<nombres.length; ind++)		//Bucle para acceder a cada dato
		{
			System.out.println(nombres[ind]);
		}
		
		for (String copia: nombres)				//Bucle exclusivo de lectura. Solo accedo a la copia de ese dato. Recorre todos los datos
			
			System.out.println(copia);
		
		*/
		
		//Arrays: conjuntos de datos del mismo tipo (verdad relativa)
		
		
		int  numero=4, misNumeros[] = {2,4,5,7};
		System.out.println(Arrays.stream(misNumeros).sum());
		System.out.println(Arrays.toString(misNumeros));
		
		System.out.println(Vectores.getVeces(misNumeros,4));
		System.out.println(Arrays.toString(Vectores.getVectorRepeticiones(misNumeros,4)));
		
		
		
		
		/*
		// int[] ó int numeros[]
		System.out.println(Vectores.buscar(4, misNumeros));
		
		System.out.println(Vectores.getMedia(misNumeros));
		*/
		
		/*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		char car = 'a';
		System.out.println((int) car);
		int numCar = 36;
		car = (char) numCar;
		car++;
		System.out.println(car);
		
		System.out.println((char) numCar);
		
		car = 'B';
		if (car >=65 && car <=92) System.out.println("May");
		if (car >='A' && car <='B') System.out.println("May");
		*/
		
		/*
		char[] caracteres = {'m', 'a', 'd', 'r', 'i', 'g', 'u', 'e', 'r', 'a'};
		Vectores.setMayusculas(caracteres);
		System.out.println(caracteres);
		
		System.out.println(Vectores.copiarVector(misNumeros));
		*/
		
		/*
		String[] nombresDigi= {
				"Andres",
				"Victor",
				"Cristobal",
				"Ale",
		};
		
		System.out.println(Arrays.toString(Vectores.sorteoExposicion(nombresDigi)));
		*/
		
		
		System.out.println(Arrays.toString(Vectores.imprimeAsterisco()));
		
		
	
	}

}

