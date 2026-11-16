import java.util.Scanner;

public class Ejer12_Factorial {

	public static void main(String[]args) throws InterruptedException
	
	{
	int num=4, factorial=1;
	Scanner entrada = new Scanner (System.in);
	
	for(; num>0; num--)
		
	{
		factorial *=num; // factorial = factorial*num;
		System.out.println("num = " + num + "\tfactorial= " + factorial);
		
	}
	
	System.out.println(factorial);
	
	}
}
