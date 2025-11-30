/*
7. Escribir un programa en el que dado un entero positivo n (> 1), comprobar si es primo.
 */
import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un numero entero positivo: ");
        int num = leer.nextInt();
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("El numero " + num + " es primo.");
        } else {
            System.out.println("El numero " + num + " no es primo.");
        }
        leer.close();
    }
}
