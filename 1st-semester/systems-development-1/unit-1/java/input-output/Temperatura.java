/*
b) Si la temperatura es superior a 100 grados, visualizar el mensaje “por encima del punto de ebullición del agua”
sino visualizar el mensaje “por debajo del punto de ebullición del agua”.
 */
import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca temperatura: ");
        double temperatura = leer.nextDouble();
        if (temperatura > 100) {
            System.out.println("Por encima del punto de ebullicion del agua.");
        } else {
            System.out.println("Por debajo del punto de ebullicion del agua.");
        }
    }
}
