package Ejer4;

public record Fecha( int dia, int mes, int anio) 
{

	public boolean esMayor()
	{
		boolean mayor=false;
		
		
		return mayor;
	}
	public String toString() //Aunque sea una clase inmutable (record), también podemos sobreescritura
	{
		return Fecha;
				// return formatearFecha(dia) + "\\" + formatearFecha(mes) + "\\" + formatearFecha(anio)
	}
/*private String formatearFecha (Integer digito)
	{
	String result=""+digito
	if (digito<10) resul="0" + digito;
	return resul	
	}
*/
}
