package ejercicio.pkg1;

public class Ejercicio08 {

    public static void main(String[] args) {
       int q = 2;
       int n = 10;
        System.out.println("Primer resultado: " + (q = ++n*3));
        //n vale 11
        n = 10; //Se resetea al valor original.
        //n vale 10
        System.out.println("Segundo resultado: " + (q = n++*3));
        //n vale 11 de nuevo
    }

}