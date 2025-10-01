package ejercicio.pkg1;

public class Ejercicio14 {

    public static void main(String[] args) {
        int totalSegundos = 186455;

        int segundosMinuto = 60;
        int minutoHora = 60;
        int horaDia = 24;

        int segundos = totalSegundos % segundosMinuto;

        int minutos = totalSegundos / segundosMinuto % minutoHora;

        int hora = totalSegundos / segundosMinuto / minutoHora % horaDia;

        int dias = totalSegundos / segundosMinuto / minutoHora / horaDia;

        System.out.println(segundos + " segundos");
        System.out.println(minutos + " minutos");
        System.out.println(hora + " horas");
        System.out.println(dias + " dias");
    }

}
