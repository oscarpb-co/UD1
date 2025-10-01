package ejercicio.pkg1;

public class Ejercicio32 {

    public static void main(String[] args) {
       
        double fahrenheit = 86;
        double celsius = 33;
        
        
        double celsius1 = ((fahrenheit - 32) / 9) * 5; 
        System.out.println("Los 86 grados Fahrenheit en grados Celsius son: " + celsius1);
        double fahrenheit1 = celsius * 9 / 5 + 32;
        System.out.println("Los 33 grados Celsius en grados Fahrenheit son: " + fahrenheit1);
        
        
        
        
        
    }

}