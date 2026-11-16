import java.util.Scanner;

public class Ejer6_PresupuestoHospital {
	
	public static void main(String[] args)
	
	{
		double presupuesto, presugine, presutrauma, presupedia;
		System.out.println("Indique cual es el presupuesto anual destinado al hospital");
		Scanner entrada = new Scanner (System.in);
		presupuesto = entrada.nextDouble();
		
		presugine = 0.4 * presupuesto;
		presutrauma = 0.3 * presupuesto;
		presupedia = 0.3 * presupuesto;
		
		System.out.println("Con el valor de este presupuesto el valor destinado para el área de ginecología es de " + presugine + " euros, para el área de traumatología es de " + presutrauma + " euros y para el área de pediatría es de " + presupedia + " euros.");
		
		entrada.close();
		
		
		
	}

}
