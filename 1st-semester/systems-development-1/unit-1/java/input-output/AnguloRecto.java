/*
a) Si un ángulo es igual a 90 grados, imprimir el mensaje "El ángulo es un ángulo recto"sino imprimir el mensaje "El ángulo no es un ángulo
recto"
*/
import java.util.Scanner;
public class AnguloRecto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca grados: ");
        int grados = leer.nextInt();
        if (grados == 90) {
            System.out.println("El angulo es un angulo recto");
        } else {
            System.out.println("El angulo es un angulo recto");
        }
    }
}
