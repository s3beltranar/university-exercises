/*
e) Si distancia es mayor que 20 y menos que 35, leer un valor para tiempo.
 */
import java.util.Scanner;
public class ValorTiempo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca una distancia: ");
        int distancia = leer.nextInt();
        if (distancia > 20 && distancia < 35) {
            System.out.println("Introduzca un valor para tiempo: ");
            int tiempo  = leer.nextInt();
            System.out.println("Valor para tiempo: " + tiempo);
        }
    }
}
