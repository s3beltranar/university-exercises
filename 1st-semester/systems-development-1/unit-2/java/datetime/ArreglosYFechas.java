/*
Escriba un programa en Java que simule el sistema de ventas de boletos suponiendo que es para una empresa encargada de vender los boletos y el cajero es el
que captura toda la información. La empresa organizará un concierto de música de rock / metal progresivo para Dream Theater o otra banda o grupo no metal que
ustedes gusten. El programa debe incluir manejo de fechas, precios de zonas, límite de boletos disponible por zonas, validación de datos y un menú interactivo
para el usuario.

Se requiere:
1.Lectura de la fecha del concierto con el formato dd/MM/YYYY, validar el formato correcto con try - catch que se vio en anteriores clases, en el catch
especificar DateTimeParseException y especificar el mensaje de error en caso de que no sea correcto.

2.Debe de obtenerse la fecha actual: Esto servirá para saber si el concierto ya pasó, si el concierto es hoy y cuántos días faltan para el concierto. Si el
concierto ya pasó mostrar el mensaje y terminar el programa, si es hoy mostrar advertencia que faltan pocas horas para vender, si faltan días indicar cuántos
faltan.

3.Para los precios pueden asignarlos ustedes por ejemplo General $ 500, Preferente $ 1500, VIP $ 2500.

4.Para el límite de boletos disponible por zonas pueden asignarle ustedes una cantidad por cada zona por ejemplo general: 5,000, preferente: 2,500 y vip 2000
espacios disponibles.

5.Proceso de compra de boletos: El usuario debe indicar cuántos boletos desea comprar, por cada boleto, elegir la zona (1. General, 2. Preferente, 3. VIP), se
debe de validar todos los datos que sean números válidos y positivos. El sistema debe de acumular cuántos boletos y el total recaudado en cada zona.

6.Menú principal: El programa debe de mostrar un menú con las siguientes opciones: 1. Comprar boletos. 2. Mostrar resumen de ventas. 3. Salir. Al seleccionar 1
debe de ejecutar el proceso de compra de boletos especificado en el punto 4, y hacer las validaciones especificadas en los primeros puntos. Al seleccionar 2 debe
de imprimir la cantidad de boletos vendidos por zona y el total general recaudado.

Pueden separar el código con ayuda de métodos, durante el fin de semana les publicaré unos ejemplos de cómo pueden separarlo con métodos / funciones, porque este
programa ya es más largo.
 */

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class ArreglosYFechas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Introduzca nombre de la banda: ");
        String nombreBanda = input.nextLine();
        System.out.print("Introduzca la fecha para el concierto de " + nombreBanda + ": ");
        String fecha = input.nextLine();
        try {
            LocalDate concierto = LocalDate.parse(fecha, formatoFecha);
            LocalDate fechaActual = LocalDate.now();
            if (concierto.isBefore(fechaActual)) {
                System.out.println("El concierto de la banda " + nombreBanda + "ya paso.");
                return;
            } else if (concierto.isEqual(fechaActual)) {
                System.out.println("Faltan horas para el concierto de " + nombreBanda + "!");
            } else {
                long dias = ChronoUnit.DAYS.between(fechaActual, concierto);
                System.out.println("Quedan " + dias + " días para el concierto de " + nombreBanda + ".");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Fecha no válida.");
            return;
        }
        int[] boletosDisponibles = {5000, 2500, 2000};
        double[] precios = {500, 1500, 2500};
        String[] tipoBoleto = {"General", "Preferente", "VIP"};
        int[] boletosVendidos = {0, 0, 0};
        double totalRecaudado = 0;
        int opcion;
        do {
            System.out.println("\n|| MENÚ PRINCIPAL ||\n");
            System.out.println("1. Comprar boletos");
            System.out.println("2. Resumen de ventas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n || PRECIOS ||");
                    for (int i = 0; i < tipoBoleto.length; i++) {
                        System.out.println((i+1) + ". " + tipoBoleto[i] + ": $" + precios[i] + " (Disponibles: " + boletosDisponibles[i] + ")");
                    }
                    System.out.print("\nCuantos boletos desea comprar? ");
                    int cantidad = input.nextInt();
                    double totalCompra = 0;
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("\n Boleto ." + (i+1) + ": ");
                        for (int j = 0; j < tipoBoleto.length; j++) {
                            System.out.println((j+1) + ". " + tipoBoleto[j] + " - $" + precios[j]);
                        }
                        System.out.print("Seleccione el tipo de boleto: ");
                        int zona = input.nextInt() - 1;
                        if (zona >= 0 && zona < tipoBoleto.length && boletosDisponibles[zona] > 0) {
                            boletosDisponibles[zona]--;
                            boletosVendidos[zona]++;
                            totalCompra += precios[zona];
                        } else {
                            System.out.println("No disponible.");
                            i--;
                        }
                    }
                    totalRecaudado += totalCompra;
                    System.out.printf("\nTOTAL A PAGAR: $%.2f\n", totalCompra);
                    break;
                case 2:
                    System.out.println("\n|| RESUMEN DE VENTAS ||");
                    for (int i = 0; i < tipoBoleto.length; i++) {
                        System.out.println(tipoBoleto[i] + ": " + boletosVendidos[i] + " vendidos, " + boletosDisponibles[i] + " disponibles");
                    }
                    System.out.printf("Total recaudado: $%.2f\n", totalRecaudado);
                    break;
                case 3:
                    System.out.println("Cerrando sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
        input.close();
    }
}