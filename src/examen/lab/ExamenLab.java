/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.lab;

import java.util.Scanner;


public class ExamenLab {

   
    public static void main(String[] args) {
       
    
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        
        while (option != 5) {
            System.out.println("Menu de Opciones:");
            System.out.println("1. Piramide");
            System.out.println("2. El Mayor");
            System.out.println("3. Cobro con IVA");
            System.out.println("4. Caracteres Vocales");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();

                if (option == 1) {
                    System.out.print("Ingrese la cantidad de filas de la piramide: ");
                    int filas = scanner.nextInt();
                    int numero = 1;

                    for (int i = 1; i <= filas; i++) {
                        int sumaFila = 0;

                        for (int j = 0; j < i; j++) {
                            System.out.print(numero + " ");
                            sumaFila += numero;
                            numero += 2; 
                        }
                        System.out.println("= " + sumaFila);
                    }
                } else if (option == 2) {
                    int mayor = Integer.MIN_VALUE;
                    int suma = 0;
                    int contador = 0;
                    String respuesta = "si";

                    while (!respuesta.equalsIgnoreCase("no")) {
                        System.out.print("Ingrese un numero entero: ");
                        int numero = scanner.nextInt();
                        suma += numero;
                        contador++;

                        if (numero > mayor) {
                            mayor = numero;
                        }

                        System.out.print("¿Desea ingresar otro numero? (si/no): ");
                        respuesta = scanner.next();
                    }

                    if (contador > 0) {
                        int promedio = suma / contador;
                        System.out.println("El numero mayor ingresado es: " + mayor);
                        System.out.println("El promedio de los numeros ingresados es: " + promedio);
                    } else {
                        System.out.println("No se ingresaron numeros.");
                    }             
             
                      } else if (option == 3) {
                    System.out.print("Ingrese el nombre del Cliente: ");
                    scanner.nextLine(); // Limpiar el buffer
                    String nombreCliente = scanner.nextLine();

                    int canalesHD = 0;
                    int canalesNormales = 0;
                    String respuesta = "si";
                    int costoCanales = 0;

                    while (respuesta.equalsIgnoreCase("si")) {
                        System.out.print("Ingrese el tipo de canal (HD/NORMAL): ");
                        String tipoCanal = scanner.next();

                        if (tipoCanal.equalsIgnoreCase("HD")) {
                            canalesHD++;
                            costoCanales += 30; // 20 + 10 para HD
                        } else if (tipoCanal.equalsIgnoreCase("NORMAL")) {
                            canalesNormales++;
                            costoCanales += 20;
                        } else {
                            System.out.println("Tipo de canal no valido.");
                            continue;
                        }

                        System.out.print("Desea ingresar otro canal? (si/no): ");
                        respuesta = scanner.next();
                    }

                    System.out.print("Ingrese el tipo de Caja Digital (LIGHTBOX/HDBOX/DVRBOX): ");
                    String tipoCaja = scanner.next();
                    int costoCaja = 0;

                    if (tipoCaja.equalsIgnoreCase("LIGHTBOX")) {
                        costoCaja = 50;
                    } else if (tipoCaja.equalsIgnoreCase("HDBOX")) {
                        costoCaja = 100;
                    } else if (tipoCaja.equalsIgnoreCase("DVRBOX")) {
                        costoCaja = 150;
                    } else {
                        System.out.println("Tipo de Caja Digital no valido.");
                    }

                    int subtotal = costoCanales + costoCaja;
                    double impuesto = subtotal * 0.15;
                    double totalPagar = subtotal + impuesto;

                    System.out.println("\nDetalle del Cobro:");
                    System.out.println("Cliente: " + nombreCliente);
                    System.out.println("Canales HD: " + canalesHD);
                    System.out.println("Canales Normales: " + canalesNormales);
                    System.out.println("Subtotal: " + subtotal + " lps");
                    System.out.println("Impuesto (15%): " + impuesto + " lps");
                    System.out.println("Total a Pagar: " + totalPagar + " lps");
                } else if (option >= 5 && option <= 5) {
                    System.out.println("Has seleccionado la opcion: " + option);
                } else {
                    System.out.println("Opcion no valida. Intente de nuevo.");
                }
            } else {
                System.out.println("Por favor, ingrese un numero valido.");
                scanner.next(); 
            }

            System.out.println(); 
        }

        System.out.println("Saliendo del programa...");
        
    }
}

        

        
            