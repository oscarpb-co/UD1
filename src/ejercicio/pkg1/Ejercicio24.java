package ejercicio.pkg1;

public class Ejercicio24 {

    public static void main(String[] args) {
       
        
        int ladoG = 100;
        int ladoP = 2;
        
        // int numCasillas = ladoG^2 / ladoP;
        int numCasillas = (ladoG * ladoG) / (ladoP * ladoP); 
       
        System.out.println("El numero de casillas sera: " + numCasillas);
        
        
    }

}