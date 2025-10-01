package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {

        double c = 2.997925 * Math.pow(10, 10);

        Scanner masa1A = new Scanner(System.in);

        System.out.println("Introduce la masa en gramos: ");
        double masa1B = masa1A.nextDouble();

        double e = masa1B * Math.pow(c, 2);

        System.out.println("la energia cuando la masa se convierta en energia seran " + e + " ergios");

    }

}
