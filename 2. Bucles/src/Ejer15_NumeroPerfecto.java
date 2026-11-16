public class Ejer15_NumeroPerfecto {

	public static void main(String[] args) 

	{
		int num, suma=0;
		
		num=8125;
				
		for(int posiblesDivisores=1; posiblesDivisores<=num/2; posiblesDivisores++)
		{
			if(num%posiblesDivisores==0) 
				{
				suma+=posiblesDivisores;
				}	
		}
		if (suma==num) System.out.println("PERFECTO");
		else System.out.println("no es perfecto");
	}
}