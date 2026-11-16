
public class TestVehiculo {

	public static void main(String[] args) {

		Vehiculo vehiculo1 = new Vehiculo ("", new Fecha());
		Vehiculo vehiculo1 = new Vehiculo ("", new Fecha());
		Vehiculo vehiculo1 = new Vehiculo ("", new Fecha());
		
		System.out.println("¿Son iguales v1 y v2?: " + Vehiculo.iguales(vehiculo1, vehiculo2));
		
		System.out.println("Antigüedad v1: " + vehiculo1.calcularAntiguedad() + " años");
		System.out.println("Antigüedad v2: " + vehiculo1.calcularAntiguedad() + " años");
		System.out.println("Antigüedad v3: " + vehiculo1.calcularAntiguedad() + " años");
		
		System.out.println("Estado v1: " + vehiculo1.getEstadoVehiculo());
		System.out.println("Estado v2: " + vehiculo1.getEstadoVehiculo());
		System.out.println("Estado v3: " + vehiculo1.getEstadoVehiculo());
		
	}

}
