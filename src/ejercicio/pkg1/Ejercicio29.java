package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {

        Scanner masa1A = new Scanner(System.in);

        System.out.println("Introduce la masa del primer cuerpo: ");
        double masa1B = masa1A.nextDouble();

        Scanner masa2A = new Scanner(System.in);

        System.out.println("Introduce la masa del segundo cuerpo: ");
        double masa2B = masa2A.nextDouble();

        Scanner distancia = new Scanner(System.in);

        System.out.println("Introduce la distancia entre: ");
        double distanciaB = distancia.nextDouble();

        double g = 6.674 * Math.pow(10, -11);
        double f = g * (((masa1B * masa2B) / Math.pow(distanciaB, 2)));

        System.out.println("El resultado son " + f + " dinas.");

        masa1A.close();
        masa2A.close();
        distancia.close();

    }

}
