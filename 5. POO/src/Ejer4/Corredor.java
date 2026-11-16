package Ejer4;

public class Corredor {

	private String nombre;
	private TipoSexo sexo;
	private Fecha nacimiento;
	private Hora tiempoEmpleado;
	
	private int numCorredores;

	public Corredor(String nombre, TipoSexo sexo, Fecha nacimiento, int numCorredores) {

		this.nombre = nombre;
		this.sexo = sexo;
		this.nacimiento = nacimiento;
	//	this.tiempoEmpleado = tiempoEmpleado;
		this.numCorredores = numCorredores;
	}
	
	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + ", sexo=" + sexo + ", nacimiento=" + nacimiento + ", tiempoEmpleado="
				+ tiempoEmpleado + ", numCorredores=" + numCorredores + "]";
	}
	
	
	
}
