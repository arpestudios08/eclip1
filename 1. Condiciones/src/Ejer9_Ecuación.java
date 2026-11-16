import java.util.Scanner;

public class Ejer9_Ecuación 
{

	public static void main(String[] args)
	
	{
		double a=0,b=4,c=6, radicando;
		String resultado= "";//inicializamos con valor vacio o cadena vacia
		//porque no compilará al estar todas sus asignaciones dentro de una condición
		//omitimos entrada por teclado por comodidad y rapdidez
		
		radicando = b*b -(4* a*c);
		if (radicando<0) resultado = "Solución dos números complejos...";
		else if (a==0) resultado = "División entre cero";
			else {	double raiz, x1,x2;
					raiz = Math.sqrt(radicando);
					x1 = (-1)*b - raiz/(2*a);
					x2 = (-1)*b + raiz/(2*a);
					resultado = "X1 = " + x1 + "\tX2 = " + x2;
					
				 }
		
		System.out.println(resultado);
	}
}
