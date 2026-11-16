import java.util.Scanner;

public class Ejer10B_DiasSemana {

	public static void main(String[] args)
	{
	
	byte número;
	String nombreDia;
	System.out.println("Inserte un número entero entre 1 y 7");
	Scanner entrada = new Scanner(System.in);
	número = entrada.nextByte();
	
	switch (número)
	{
	case 1: nombreDia = "Lunes";
			break;
			
	case 2: nombreDia = "Martes";
			break;
			
	case 3: nombreDia = "Miércoles";
			break;
			
	case 4: nombreDia = "Jueves";
			break;
			
	case 5: nombreDia = "Viernes";
			break;
			
	case 6: nombreDia = "Sábado";
			break;
			
	case 7: nombreDia = "Domingo";
			break;
	
	default: nombreDia = "El número no corresponde a ningún dia";
	}
	System.out.println(nombreDia);
	entrada.close();
	
	}
}
