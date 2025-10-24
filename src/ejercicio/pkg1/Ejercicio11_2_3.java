package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio11_2_3 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        short numCasos = num.nextShort();
        int n;
        double media;
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < numCasos; i++) {
            n = num.nextShort();
            suma += n;
            if (n > mayor) 
                mayor = n;
            
 
            if (n < menor) 
                menor = n;
            

        }
        media = (double) suma / numCasos;
        System.out.println(mayor);
        System.out.println(menor);
        System.out.println(media);
    }
}
