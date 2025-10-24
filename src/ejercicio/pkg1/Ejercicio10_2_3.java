package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio10_2_3 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        short numCasos = num.nextShort();

        int x = 1;

        for (int i = 1; i < numCasos; i++) {
            System.out.printf("%2d, ", x);
        
            x *= -2;  
        }
        if (numCasos > 0)
            System.out.println(x);
    }
}
