import java.util.Random; 
public class Ejer2 {


		    static Random random = new Random();

		    // Genera un numero aleatorio entre 2 y 4
		    public static int numeroTiradas() {
		        return random.nextInt(3) + 2;
		    }

		    // Simula una tirada del dado (entre 1 y 6)
		    public static int tirarDado() {
		        return random.nextInt(6) + 1;
		    }

		    // Realiza una fila de tiradas y devuelve su suma
		    public static int realizarFila(int numero) {

		        int suma = 0;

		        System.out.print("Fila " + numero + ": ");

		        int tiradas = numeroTiradas();

		        for (int i = 1; i <= tiradas; i++) {

		            int dado = tirarDado();

		            System.out.print(dado + " ");

		            suma = suma + dado;
		        }

		        System.out.println(" | Suma: " + suma);

		        return suma;
		    }

		    public static void main(String[] args) {

		        int fila = 1;
		        int suma = 0;

		        while (fila <= 5 && suma != 10) {

		            suma = realizarFila(fila);

		            fila++;
		        }

		        if (suma == 10) {
		            System.out.println("¡Has conseguido sumar 10!");
		        } else {
		            System.out.println("Se ha alcanzado el máximo de 5 filas.");
		        }
		
		

	}
}
