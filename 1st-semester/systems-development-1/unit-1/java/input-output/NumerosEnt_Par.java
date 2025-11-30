/*
4. Dados diez números enteros, escribir un programa que permita visualizar la suma de los números pares de la lista, cuántos números pares existen y
cuál es la media aritmética de los números impares. Usar % para detectar el número par. Ejemplo: if (número % 2 == 0).
El % hace división y devuelve el residuo, si es igual a 0 significa que es par y si devuelve 1 significa que es impar.
 */
import java.util.Scanner;
public class NumerosEnt_Par {
    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        int NumerosPares = 0;
        int NumerosImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce un numero " + i + ": ");
            int numero = leer.nextInt();
            if  (numero % 2 == 0) {
                sumaPares = sumaPares + numero;
                NumerosPares++;
            } else  {
                sumaImpares = sumaImpares + numero;
                NumerosImpares++;
            }
        }
        System.out.println("Suma de numeros pares: " +  sumaPares);
        System.out.println("Numeros pares existentes: " + NumerosImpares);
        double media = (double) sumaImpares / NumerosImpares;
        System.out.printf("Media aritmetica de numeros impares: %.2f", media);
    }
}
