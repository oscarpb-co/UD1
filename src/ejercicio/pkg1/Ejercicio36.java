package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio36 {

    public static void main(String[] args) {
        Scanner hora1A = new Scanner(System.in);

        System.out.println("Introduce la hora: ");
        int hora1B = hora1A.nextInt();

        Scanner minutos1A = new Scanner(System.in);

        System.out.println("Introduce los minutos: ");
        int minutos1B = minutos1A.nextInt();
        
        int segundosH = hora1B * 3600; 
        int segundosM = minutos1B * 60;
        
        int cuantoFalta = 86_400 - (segundosH + segundosM);
        
        System.out.println("Fanltan " + cuantoFalta + " segundos para medianoche.");
        
    }

}
