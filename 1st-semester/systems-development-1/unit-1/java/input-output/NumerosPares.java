/*
3. Escribir un programa que permita sumar los números pares del 2 al 100 e imprimir su valor.
 */
import java.util.Scanner;
public class NumerosPares {
    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        int suma = 0;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0){
                suma = suma + i;
            }
        }
        System.out.println("Total de la suma de los numeros pares: " + suma);
        leer.close();
    }
}
// for (int i = 2; i <= 100; i++) Recorre desde 2 hasta 100.
// if (i % 2 == 0): Verifica si el número es par.
// % es el operador módulo (resto de división).
// Si i % 2 == 0, significa que es divisible entre 2 (par).