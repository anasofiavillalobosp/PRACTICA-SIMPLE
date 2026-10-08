/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              
        Scanner teclado = new Scanner(System.in);
        Numeros num = new Numeros();

        int opcion;
        char continuar;

        do {

            System.out.println("\n=================================");
            System.out.println("       MANEJO DE ARREGLOS");
            System.out.println("=================================");
            System.out.println("1. Llenar arreglo");
            System.out.println("2. Mostrar arreglo");
            System.out.println("3. Llenar arreglo aleatorio");
            System.out.println("4. Modificar un numero");
            System.out.println("5. Modificar por posicion");
            System.out.println("6. Eliminar un dato");
            System.out.println("7. Sumar elementos del arreglo");
            System.out.println("8. Eliminar arreglo");
            System.out.println("=================================");
            System.out.println("Seleccione una opcion:");

             opcion = num.leerEntero();

            switch (opcion) {

                case 1:
                    num.llenar_arreglo();
                    break;

                case 2:
                    num.mostrar();
                    break;

                case 3:
                    num.llenar_arreglo_random();
                    break;

                case 4:
                    num.modificar_arreglo();
                    break;

                case 5:
                    num.modificar_arreglo_posicion();
                    break;

                case 6:
                    num.eliminar_dato();
                    break;

                case 7:
                    num.sumatorio_arreglo();
                    break;

                case 8:
                    num.eliminar_arreglo();
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println("\n¿Desea realizar otra operación? (s/n)");
            continuar = teclado.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("\nPrograma finalizado.");
        teclado.close();
    }
    
}
