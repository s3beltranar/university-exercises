/*
d) Si x es mayor que y, y z es menor que 20, leer un valor para p.
 */
import java.util.Arrays;
import java.util.Scanner;
public class ValorP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un valor para x: ");
        double x = leer.nextDouble();
        System.out.println("Introduzca un valor para y: ");
        double y = leer.nextDouble();
        System.out.println("Introduzca un valor para z: ");
        double z = leer.nextDouble();
        if (x > y && z < 20) {
            System.out.println("Introduzca un valor para P:");
            double valorp = leer.nextDouble();
            System.out.println("Valor para P: " + valorp);
        }
    }
}
