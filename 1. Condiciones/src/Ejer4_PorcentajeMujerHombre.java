import java.util.Scanner;

public class Ejer4_PorcentajeMujerHombre {

	public static void main(String[] args)
	{
		int numHom, numMuj, personas;
		float porcentajeHom, porcentajeMuj;
		
		System.out.println("Indique el número de hombres en el grupo");
		Scanner entrada1 = new Scanner (System.in);
		numHom = entrada1.nextInt();
		
		System.out.println("Indique el número de mujeres en el grupo");
		Scanner entrada2 = new Scanner (System.in);
		numMuj = entrada2.nextInt();

		
		personas = numHom + numMuj;
		
		System.out.println("Perfecto, en total hay un número de " + personas + " personas");
		
		porcentajeHom = (numHom * 100f)/personas;
		porcentajeMuj = (numMuj * 100f)/ personas;
		
		System.out.println("Por tanto, este grupo de estudiantes está compuesto por el " + porcentajeHom + " % de hombres y el " + porcentajeMuj + " % de mujeres.");
		
		entrada1.close();
		entrada2.close();
	}
}
