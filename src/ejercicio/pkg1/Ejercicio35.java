package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio35 {

    public static void main(String[] args) {
       
        Scanner dato1A = new Scanner(System.in);

        System.out.println("Introduce el primer dato (dato a): ");
        double dato1B = dato1A.nextDouble();
        
        Scanner dato2A = new Scanner(System.in);

        System.out.println("Introduce el segundo dato (dato b): ");
        double dato2B = dato2A.nextDouble();
        
        double x = 0;
        
        
        System.out.println("Resultado: " + (x =  (-dato2B / dato1B)));
        
        
        // ax + b  = 0
        // ax = -b
        // x = -b / a
    }

}