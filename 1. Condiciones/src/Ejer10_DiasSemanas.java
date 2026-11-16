import java.util.Scanner;

public class Ejer10_DiasSemanas {
	
	public static void main(String[] args)
	
	{
		int num;
		
		System.out.println("Indica un número del 1 al 7 para visualizar el día de la smana correspondiente");
		
		Scanner entrada = new Scanner(System.in);
		
		num = entrada.nextInt();
		
		if (num == 1)
			System.out.println("El número 1 corresponde al lunes");
		else
			if (num == 2)
				System.out.println("El número 2 corresponde al martes");
			else
				if (num == 3)
					System.out.println("El número 3 corresponde al miércoles");
				else
					if (num == 4)
						System.out.println("El número 4 corresponde al jueves");
					else
						if (num == 5)
							System.out.println("El número 5 corresponde al viernes");
						else
							if (num == 6)
								System.out.println("El número 6 corresponde al sábado");
							else
								if (num == 7)
									System.out.println("El número 7 corresponde al domingo");
								else
									if (num<1)
										System.out.println("Valor fuera de rango");
									else
										if (num>7)
											System.out.println("Valor fuera de rango");
								
	}

}
