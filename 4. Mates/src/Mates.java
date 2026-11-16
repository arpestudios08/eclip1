
public class Mates 

{

		/*public static String saludar(String mensaje, int veces)
		{
			String resultado="";
			for(int cont=1;cont<=veces; cont++)
				resultado = resultado + "\t" + mensaje;
			
			
			//saludar=resultado// no se puede hacer
			
		}

			return resultado;
			*/
			
			
			
			public static long factorial (int num)
			{
				long facto = 1;
				
					for (int cont=1; cont<=num; cont++)
						facto*=cont;
					
			return facto;
			
			}

			
		public static int incremento (int num) // parámetro formal
		{
			num++;
			return num;	//++num++; // pre-incremento o post-incremento => lo correcto sería ++num; pre-incremento 
		}

		
		public static String felicitar(String nombre, int edad)
		{
		
		return "Felicidades " + nombre + " ya tienes " + (edad+1) + " años.";
		}
		
		
		public static float potencia (float base, float exp)
		{
			float pot=1;
			
			for(int cont=1; cont<=exp; cont++)
				pot=pot*base;
					
		return pot;
			
		}
		

		public static int compare(int num1,int num2)
		{
				
			return num1-num2;
		}

		
		
		public static boolean esMayor(int edad)
		{
			return edad>=18;
		}
		
		public static TipoEdad esMayorBis(int edad)
		{
			TipoEdad resultado;
			if (edad>=18) resultado=TipoEdad.MAYOR_EDAD;
			else resultado=TipoEdad.MENOR_EDAD;
			return resultado;
		}
		
		public static TipoEdad obtenerEtapa(int edad)
		{
			TipoEdad resultado;
			if (edad>=18) resultado=TipoEdad.MAYOR_EDAD;
			else resultado=TipoEdad.MENOR_EDAD;
			return resultado;
		}
		
		public static boolean esDivisor(int num, int div) 
		{
			return num%div==0;
		}
		
		public static boolean esPrimo(int num)
		{
			boolean esPrimo=true;
			
			for (int div=2; div<=num/2 && esPrimo; div++) // esPrimo <==> esPrimo =true
				
				if(num % div==0) esPrimo=false;
					
			return esPrimo;
		}
		
		public static String getDivisors(int num)
		{String resul="";
			for(int cont=1;cont<=num/2;cont++)
				if(num % cont==0) resul = resul + " " +cont;
			resul=resul + " " + num;
			return resul;
		}
		
		
		//Método que realice la factorización de un número
		public static int getPrimerDivisor (int num)
		{int div=num;
			for(int cont=1; cont<=num/2 && div==num;cont++)
			
				if(num%cont==0) div=cont;
			
			return num;
		}
		
		
		public static String factorizacion (int num)
		{String facto="";
		int div;
			while (num!=1)
			{
			div = Mates.getPrimerDivisor(num);
			num=num/div;
			if(facto.equals("")) facto+=div; // Integer.toString(div)
			else facto=facto + " * " + div;
			}
			return facto;
		}
	}
		
		
		
		
		
