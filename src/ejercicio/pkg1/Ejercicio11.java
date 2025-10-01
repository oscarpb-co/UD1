package ejercicio.pkg1;

public class Ejercicio11 {

    public static void main(String[] args) {

        int x = 50;

        x = x << 3;

        System.out.println(x);

        System.out.println((byte) x);
        /*
                00110010000 (x)
        Al hacer el cast, nos quedamos con los 8 bits 
        menos significativos. El resto se cortan.
                10010000 (n)
        */

    }

}
