package ejercicio.pkg1;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio39 {

    public static void main(String[] args) {

        Scanner sueldo1A = new Scanner(System.in);

        System.out.println("Introduce el sueldo fijo: ");
        double sueldo1B = sueldo1A.nextDouble();

        Scanner comision1A = new Scanner(System.in);

        System.out.println("Introduce el dinero ganado de las ventas hechas: ");
        double comision1B = comision1A.nextDouble();

        Scanner km1A = new Scanner(System.in);

        System.out.println("Introduce el kilometraje hecho: ");
        double km1B = km1A.nextDouble();

        Scanner dietas1A = new Scanner(System.in);

        System.out.println("Introduce el numero de desplazamientos: ");
        double dietas1B = dietas1A.nextDouble();

        DecimalFormat df = new DecimalFormat("#.00");

        double sueldoTotal = sueldo1B + (comision1B * 0.05) + (km1B * 0.19) + (dietas1B * 30);

        double sueldoLiq = sueldoTotal - (sueldoTotal * 0.19) - 150;

        System.out.println("El sueldo liquido total es " + df.format(sueldoLiq) + "€");
        
    }
       

}
