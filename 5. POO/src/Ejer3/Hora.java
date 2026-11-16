package Ejer3;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Hora 

{
	private Integer horas;
	private Integer minutos;
	private Integer segundos;

	Hora()
	{
		horas=minutos=segundos=0; // esto es necesario pq se inicializa a valores nulos por defecto
	}

	Hora(Integer horas, Integer minutos, Integer segundos)
	{
		if(horas<0 || horas>23 ||minutos<0 || minutos>59 || segundos<0 || segundos>59)
			horas=minutos=segundos=0; 
		else
		{
			this.horas=horas;
			this.minutos=minutos;
			this.segundos=segundos;
		}
	}
	
	Hora(Hora hor)
	{
		this.horas=hor.horas;
		this.minutos=hor.minutos;
		this.segundos=hor.segundos;
	}
	
	
	public static Hora obtenerHoraSistema() 
	{
		LocalTime ahora = LocalTime.now();
		return new Hora(ahora.getHour(), ahora.getMinute(), ahora.getSecond());
	}
	
	public String toString()
	{
		return horas+ ":" + minutos + ":" + segundos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
