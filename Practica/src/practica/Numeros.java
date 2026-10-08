/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Numeros {
    
    //atributos
    //Tipo_dato identificados = 0;
    public int leerEntero() {
        while (true) {
            try {
                return teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: debe introducir un numero entero.");
                teclado.next();
            }
        }
    }
    
     int Numeros[] = new int[10];
     int NumerosRan[] = new int[10];
    //metodos
     Scanner teclado = new Scanner(System.in);
     
     public void llenar_arreglo(){   
        for (int i=0; i<10; i++){
            System.out.println("Digite lo numeros a continuacion para llenar el arreglo en la posicion " + (i+1) +".");
            Numeros[i]= leerEntero();
           
        }
     }
     public void llenar_arreglo_random(){
        for (int i = 0; i < NumerosRan.length; i++){
            NumerosRan[i] = (int) (Math.random() * 1001);
            
        }
        for (int i=0; i<10; i++){
            System.out.println("Numeros RANDOM");
             System.out.println((i+1)+". "+ NumerosRan[i]);          
        }  
     }
     
     public void mostrar(){
         for (int i=0; i<10; i++){
            System.out.println("Numeros arreglo escrito ");
             System.out.println((i+1)+". "+ Numeros[i]);          
        }     
     }
     
     public void modificar_arreglo(){
        mostrar();
        System.out.println("Introduce el numero a cambiar(tenga en cuenta introducir el entero ejem. 1,2,3 ...");
         int numeroBusqueda= leerEntero();
         boolean verdadero = false;
         for (int i=0; i<10; i++){
            if (Numeros[i] == numeroBusqueda) { 
                System.out.println("Encontrado en la posicion " + (i+1) + "!");
                verdadero = true;
                
                System.out.println("Introduce el nuevo valor");
                int nuevoValor = leerEntero();
                Numeros[i] = nuevoValor;
                break;                          
            }
         }
        if (verdadero) {
            System.out.println("Arreglo modificado:");
            mostrar();
        }
         if(!verdadero){
             System.out.println("El numero " + numeroBusqueda + " no existe en el arreglo.");
        }
     
     }
     public void modificar_arreglo_posicion() {
        mostrar();

        System.out.println("Introduce la posicion del número que deseas cambiar (ejem. 1,2,3 ..., 10):");
        int numeroPosicion = leerEntero();

        if (numeroPosicion < 1 || numeroPosicion > 10) {
            System.out.println("Posicion invalida.");
            return;
        }

        System.out.println("Introduce el nuevo valor:");
        int nuevoValor = leerEntero();

        Numeros[numeroPosicion - 1] = nuevoValor;

        System.out.println("Arreglo modificado:");
        mostrar();
     }
         
     
// Se utiliza int en lugar de Integer para trabajar con valores primitivos,
// por lo que no se puede asignar null; se usa 0 para indicar una posición vacía.
     public void eliminar_arreglo(){
        for (int i = 0; i < 10; i++) {
            Numeros[i] = 0;
        }
        System.out.println("Arreglo eliminado.");
        mostrar();
    }   
     public void eliminar_dato() {
        mostrar();

        System.out.println("Introduce el numero que deseas eliminar:");
        int numero = leerEntero();

        boolean encontrado = false;

        for (int i = 0; i < 10; i++) {
            if (Numeros[i] == numero) {
                Numeros[i] = 0;
                encontrado = true;
                System.out.println("Numero eliminado.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El numero no existe en el arreglo.");
        }
    }        
     public void sumatorio_arreglo() {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += Numeros[i];
        }

        System.out.println("La suma total del arreglo es: " + sum);
    }
}

