package ejercicio.pkg1;

public class Ejercicio37 {

    public static void main(String[] args) {
       int presupuesto = 2_000_000;
       
        
       double gine = presupuesto / 0.4; 
       double pedi = presupuesto / 0.3;
       double trauma = presupuesto / 0.3;
        
       
        System.out.println("Dinero para ginecolog�a: " + gine + "$");
        System.out.println("Dinero para pediatr�a: " + (int)pedi + "$");
        System.out.println("Dinero para traumatolog�a: " + (int)trauma + "$");
    }

}