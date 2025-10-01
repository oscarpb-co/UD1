package ejercicio.pkg1;

public class Ejercicio28 {

    public static void main(String[] args) {

        int a = 2, b = 10, c = 2;

        int resultado = (int) (-b + (Math.pow(b, 2) - (4 * a * c)) / (2 * a) + b / a);

        System.out.println("El resultado es: " + resultado);

    }

}
