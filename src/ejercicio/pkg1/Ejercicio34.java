package ejercicio.pkg1;

public class Ejercicio34 {

    public static void main(String[] args) {
       int h = 22;
       int m = 3;
       int t = h + m;
       
       int porcientoH = (h * 100) / t;
       int porcientoM = (m * 100) / t;
        System.out.println("Porcentaje de hombres: " + porcientoH + "%"); 
        System.out.println("Porcentaje de mujeres: " + porcientoM + "%"); 
        
    }

}