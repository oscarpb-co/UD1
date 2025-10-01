package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        final double PI = 3.1416;

        Scanner anguloA = new Scanner(System.in);

        System.out.println("Introduce el angulo expresado en radianes: ");
        double anguloB = anguloA.nextDouble();

        double grado = anguloB * (PI / 180);

        System.out.println("El angulo dado corresponde a " + grado + "º");

        anguloA.close();

    }

}
