package libro;

public class TestLibro {
	
	public static void main (String[]args)
	
	{
	Libro libro=new Libro("3434", "El diario de Noah", TipoGenero.NOVELA, 1988);
	Libro copia, libro2=new Libro("Matar a un ruiseñoble");
	//Libro libro3 = new Libro(); // no funciona si ya tenemos otros
	//libro=libro2;
	//libro.setAnio(2000);
	
		copia=new Libro(libro);
		copia.setAnio(2000);
	System.out.println(copia);
	System.out.println(libro);
	}
}
