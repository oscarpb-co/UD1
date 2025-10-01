package ejercicio.pkg1;

public class Ejercicio17 {

    public static void main(String[] args) {

        int n = 10, p = 4, q = 2;
        double z;

        System.out.println("apartado A: " + (z = n / p));
        System.out.println("Valor de z: " + z);
        
        System.out.println("apartado B: " + (z = (double) n / p));
        System.out.println("Valor de z: " + z);
        
        System.out.println("apartado C: " + (z = (double) (n / p)));
        System.out.println("Valor de z: " + z);
        
        System.out.println("apartado D: " + (z += n));
        System.out.println("Valor de z: " + z);
        
        System.out.println("apartado E: " + (q *= z));
        System.out.println("Valor de q: " + q);
        
        System.out.println("apartado F: " + (z += 2));
        System.out.println("Valor de z: " + z);
        
    }

}
