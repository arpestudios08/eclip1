import java.util.Scanner;
public class Ejer3 {

	public static void main(String[]args)
{
String matricula;
int km, diasAlquilado, numCliente=0;
float precioVehiculoDia;
final int MAX_COCHES=200;	

Scanner entrada = new Scanner (System.in);

	for (int contCoche=1; contCoche<=MAX_COCHES; contCoche++ )
	{
		System.out.println("Introduce la matrícula de su vehículo");
		matricula = entrada.next();
		
		System.out.println("Introduce el precio de alquiler por día de su vehículo");
		precioVehiculoDia = entrada.nextFloat();
		
		System.out.println("Introduce el número de clientes");
		
		for (int contCliente=1; contCliente<=numCliente; contCliente++)
		{
			System.out.println("Kilómetros que ha realizado: " + contCliente + " con el vehículo: " + contCoche);
			km = entrada.nextInt();
			System.out.println("Días que el cliente: " + contCliente + " ha tenido alquilado el vehículo: " + contCoche);
			diasAlquilado = entrada.nextInt();
		}
		
	
	
	}
	
	System.out.println("Kilómetros del coche con menor número de clientes: " + );
	System.out.println("Matrícula del vehículo que más días ha sido alquilado" + );
	System.out.println("Matrículas de los coches con más de 100 km recorridos por todos sus clientes: " + );

}

}