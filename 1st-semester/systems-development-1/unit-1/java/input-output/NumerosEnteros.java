/*
2. Escribir un programa que permita leer 10 números enteros y obtener cuántos son positivos.
 */
import java.util.Scanner;
public class NumerosEnteros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int positivos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce un numero " + i + ": ");
            int num = leer.nextInt();
            if (num > 0) {
                positivos++;
            }
        }
        System.out.println("Cantidad de numeros positivos: " + positivos);
        leer.close();
    }
}
//El for se usa para saber EXACTAMENTE cuantas veces se va a repetir algo. En este caso (int i = 1; i <= 10; i++) se va a repetir 10, empezando por el 1

//El do se usa para un repetir algo indefinidamente, hasta que el bucle se cierre.
//Por ejemplo:
// do {
//     System.out.println("Deseas continuar? S/N");
//     desea = leer.next().charAt(0);
//     leer.nextLine();
// } while (desea == 's' || desea == 'S');