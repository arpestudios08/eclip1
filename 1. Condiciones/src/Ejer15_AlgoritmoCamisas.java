import java.util.Scanner;

public class Ejer15_AlgoritmoCamisas {

	public static void main(String[] args)
	
	{
		int NumCamisa;
		double PrecioCamisa, PrecioFinal;
	
		System.out.println("Indica cual es el número de camisas que desea comprar");
		Scanner entrada = new Scanner (System.in);
		NumCamisa = entrada.nextInt();
		
		System.out.println("Ahora indique el precio de una camisa");
		PrecioCamisa = entrada.nextDouble();
		
		if (NumCamisa>=3)
		{
			PrecioFinal = (NumCamisa * PrecioCamisa) * 0.8;
			System.out.println("El total de su compra es de " + PrecioFinal + " euros.");
		}
		
			else if (NumCamisa >= 1 || NumCamisa <=2)
		{
				PrecioFinal = (NumCamisa * PrecioCamisa) * 0.9;		
				System.out.println("El total de su compra es de " + PrecioFinal + " euros.");
		}
		
	}
}
