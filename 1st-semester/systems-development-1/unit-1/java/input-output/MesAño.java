/*
6. Escribir un programa en el que dado el nombre de un mes y si el año es o no bisiesto, deducir el número de días del mes.
 */
import java.util.Scanner;
public class MesAño {
    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        System.out.println("Nombre del mes: ");
        String mes = leer.next().toLowerCase(); //Para leer cualquier formato.
        System.out.println("Es un año bisiesto? S/N");
        char bisiesto = leer.next().charAt(0);
        int dias = 0;
        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                break;
            case "febrero":
                if (bisiesto == 's' || bisiesto == 'S') {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default: // El default se usa en caso de que el caracter que se haya introducido no coincida con el case
                System.out.println("Mes invalido.");
                leer.close();
                return; // Termina el programa si el mes es invalido
        }
        System.out.println(mes + " tiene " + dias + " dias.");
    }
}
