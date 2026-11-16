import java.util.Scanner;

public class Ejer12_DiferenciaHora {

	public static void main(String[] args)
	
	{
		int HoraInicial, MinutosInicial, HoraFinal, MinutosFinal, diferencia;
		
		System.out.println("Indique la hora de comienzo (hora y minutos por separado)");
		
		System.out.println("Indique el valor incial de la hora");
		Scanner entrada = new Scanner (System.in);
		HoraInicial = entrada.nextInt();
		System.out.println("Ahora indique el valor de los minutos iniciales");
		MinutosInicial = entrada.nextInt();
		
		
		System.out.println("A continuación, indique la hora de finalización (hora y minutos por separado)");
		
		System.out.println("Indique el valor de la hora de finalización");
		HoraFinal = entrada.nextInt();
		System.out.println("Ahora indique el valor de los minutos de finalización");
		MinutosFinal = entrada.nextInt();
		
		diferencia = ((HoraInicial * 60) + MinutosInicial) - ((HoraFinal * 60) + MinutosFinal);

		if (HoraInicial<0 || HoraInicial>24)
			System.out.println("No es posible darle ese valor");
		else 
			System.out.println("La diferencia de minutos con esos datos es de " + diferencia + " minutos.");
	}
}
