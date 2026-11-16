package animal;
import java.time.LocalDate;

public class TestAnimal {

	public static void main(String[] args) 
	{
		Animal animal; // se crea una referencia: dirección del futuro objeto
		
		animal = new Animal("Planaria",2); //Ahora se crea (1), se incializa (2) y se enlaza el objeto (3)
		//animal 3º = 1º new Animal (2º "Planaria, 2);

		animal.setEspecie("Pájaro");
		animal.setEdad(3);
		
		System.out.println(animal.getEspecie());
		System.out.println(animal.getEdad());
		//System.out.println(animal.mostrarEspecie());
		
		System.out.println(animal);
		
		int anio=LocalDate.now().getYear();
		System.out.println(anio);
		LocalDate fecha=LocalDate.now(); // new LocalDate();
		System.out.println(fecha.getYear());
		
	}

}
