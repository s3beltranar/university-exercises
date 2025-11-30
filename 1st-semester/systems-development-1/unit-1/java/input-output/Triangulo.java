/*
5. Escribir un programa que visualice un triángulo isósceles.
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
 */
import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // > El for principal se encarga de controlar las filas del triangulo.
            for (int c = 0; c < 5 - i - 1; c++) { // > Funciona para anadir los espacios del triangulo para que este centrado.
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) { // > Es para imprimir los asteriscos que le dan forma al triangulo.
                System.out.print("*");
            }
            System.out.println(); // Para anadir espacio extra al final del programa.
        }
    }
}
