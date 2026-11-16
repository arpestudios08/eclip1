package Ejer4;

public class TestCorredor {

	public static void main (String[]args)
	{
		Fecha fecha =new Fecha (30,5,2023);
		System.out.println(fecha);
		System.out.println(fecha.mes());
		Corredor corredor=new Corredor("Manuel", TipoSexo.HOMBRE, fecha, 0);
		
		System.out.println(corredor);
	}
}
