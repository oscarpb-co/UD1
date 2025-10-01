package ejercicio.pkg1;

public class Ejercicio31 {

    public static void main(String[] args) {

        double inversion = 10000;

        inversion *= 1.1;
        System.out.println("El primer año tendria: " + inversion + "€");
        inversion -= 500;
        System.out.println("El segundo año tendria: " + inversion + "€");
        inversion *= 1.12;
        System.out.println("El tercer año tendria: " + inversion + "€");

    }

}
