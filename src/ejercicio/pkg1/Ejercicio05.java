package ejercicio.pkg1;

public class Ejercicio05 {

    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
        int c;
        
        System.out.println("Situacion inicial:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("Situacion despues del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }

}