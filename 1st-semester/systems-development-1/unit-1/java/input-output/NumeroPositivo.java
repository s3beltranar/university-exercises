/*
c) Si el número es positivo, sumar el número a total de positivos, sino sumar al total de negativos.
 */
import java.util.Scanner;
public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        double numero = leer.nextDouble();
        double totalPositivos = 20;
        double totalNegativos = -20;
        if (numero > 0) {
            totalPositivos = totalPositivos + numero;
            System.out.println("Total positivos: " + totalPositivos);
        } else {
            totalNegativos = totalNegativos + numero;
            System.out.println("Total negativos: " + totalNegativos);
        }
    }
}
