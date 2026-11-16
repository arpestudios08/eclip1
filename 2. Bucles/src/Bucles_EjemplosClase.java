import java.util.Scanner;
public class Bucles_EjemplosClase {
	
	public static void main(String[] args) throws InterruptedException
	
	{
		int contador=3;
		/*		
		while(contador>=0) //se repite mientras la condición sea VERDADERA
		{
			System.out.println(contador);
			contador--; //contador = contador-1;
			Thread.sleep(1000);
		}
		
		// Sigue aquí cuando sea falsa la condición
		*/
		Scanner entrada = new Scanner (System.in);
		
		int num=1, suma=0;
		
		System.out.println("Intro num ");
		num = entrada.nextInt(); // 1- inicialización del contador
		System.out.println("num = " + num + "\tsuma = " + suma);
		
		while (num != 0) // 2- condición hace que acabe el bucle
		{
			suma = suma + num;
			System.out.println("num = " + num + "\tsuma = " + suma);
			System.out.println("Intro num ");
			num = entrada.nextInt(); // 3- variación del contandor
			
		}
		
		System.out.println(suma);
	}

}
