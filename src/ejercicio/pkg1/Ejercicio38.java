package ejercicio.pkg1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio38 {

    public static void main(String[] args) {
       
        Scanner valor1A = new Scanner(System.in);

        System.out.println("Introduce el valor de el artículo: ");
        double valor1B = valor1A.nextDouble();
        
        double ganar = valor1B * 1.3;
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("Deberia venderlo a " + df.format(ganar) + "€ para obtener una ganancia del 30%");
        
        
    }

}