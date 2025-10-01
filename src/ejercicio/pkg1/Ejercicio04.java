package ejercicio.pkg1;

public class Ejercicio04 {

    public static void main(String[] args) {
       char a = 'a';
       char z ='z';
       
       /*
       a contiene el codigo de la letra 'a' que es 97
       Java, al ver que es una variable de tipo char,
       recurre a la tabla ASCII e imprime el carácter
       asociado a su codigó.
        */
        System.out.println("Variables al principio:");
        System.out.println(a);
        System.out.println(z);
    
        System.out.println("Variables al final:");
        System.out.println((byte)a);
        System.out.println((byte)z);
       
        System.out.print("Cantidad de letras entre la a y la z: ");
        System.out.println((byte)++z - (byte)a);
    }   

}