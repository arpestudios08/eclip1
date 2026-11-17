import java.util.Scanner;

public class pruebaslibro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // definición del array y reserva de memoria en la misma línea
        int[] x = new int[6];
        x[0] = 8;
        x[1] = 33;
        x[2] = 200;
        x[3] = 150;
        x[4] = 11;
        x[5] = 11;

        System.out.println("El array x tiene 5 elementos ¿cuál de ellos quiere ver?");
        System.out.print("Introduzca un número del 0 al 4: ");
        int indice = Integer.parseInt(entrada.nextLine());
        System.out.print("El elemento que se encuentra en la posición " + indice + " es el " + x[indice]);
    }
}