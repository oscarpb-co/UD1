package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner nota1A = new Scanner(System.in);

        System.out.println("Introduce la nota de las media de tus tres evaluaciones parciales: ");
        double nota1B = nota1A.nextDouble();

        Scanner nota2A = new Scanner(System.in);

        System.out.println("Introduce la calificacion de tu examen final: ");
        double nota2B = nota2A.nextDouble();

        Scanner nota3A = new Scanner(System.in);

        System.out.println("Introduce la calificacion de tu trabajo final: ");
        double nota3B = nota3A.nextDouble();

        double nota1C = nota1B * 0.55;

        double nota2C = nota2B * 0.3;

        double nota3C = nota3B * 0.15;

        System.out.println((int) (nota1C + nota2C + nota3C));

    }

}
