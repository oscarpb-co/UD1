package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {

        Scanner piesa = new Scanner(System.in);

        System.out.println("Introduce el numero de pies: ");
        double piesb = piesa.nextDouble();

        System.out.println("\tSu resultado en yardas es: " + (piesb * 3));
        System.out.println("\tSu resultado en pulgadas es: " + (piesb * 12));
        System.out.println("\tSu resultado en centimetros es: " + (piesb * 12 * 2.54));
        System.out.println("\tSu resultado en metros es: " + (piesb * 12 * 2.54 * 100));

        piesa.close();

    }

}
