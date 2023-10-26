/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_casoestudio;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Prueba_CasoEstudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero_Factura = 0;
        int numero_cliente = 0;
        double totalDeuda = 0;

        System.out.println("Por favor, ingrese el número de clientes que desea agregar: ");
        numero_Factura = scanner.nextInt();

        for (int a = 0; a < numero_cliente; a++) {
            System.out.println("Ingrese el nombre del cliente " + (a + 1) + ": ");
            String nombre = scanner.next();
            System.out.println("Ingrese la cédula del cliente " + (a + 1) + ": ");
            String cedula = scanner.next();
            System.out.println("Ingrese el número de facturas para el cliente " + (a + 1) + ": ");
            numero_Factura = scanner.nextInt();

            for (int b = 0; b < numero_Factura; b++) {
                System.out.println("Ingrese el número de factura " + (b + 1) + " para el cliente " + (b + 1) + ": ");
                int numero_Factura = scanner.nextInt();
                System.out.println("Ingrese el monto de la factura " + (b + 1) + " para el cliente " + (b + 1) + ": ");
                double monto_Factura = scanner.nextDouble();
                System.out.println("Ingrese el año de la factura " + (b + 1) + " para el cliente " + (b + 1) + ": ");
                int year_Factura = scanner.nextInt();
                System.out.println("Ingrese el mes de la factura " + (b + 1) + " para el cliente " + (b + 1) + ": ");
                int mes_Factura = scanner.nextInt();
                System.out.println("Ingrese el estado de la factura " + (b + 1) +
                        " para el cliente " + (b+1) +
                        ".\nEscriba 'pagada' si la factura está pagada o 'no pagada' si no lo está: ");
                String estado_Factura = scanner.next();
                

                if (estado_Factura.equals("no pagada")) {
                    totalDeuda += monto_Factura;
                }
            }
        }
        for (int num = 0; num < facturas(); num++) {
            Factura facturaActual = facturas.get(num);
            System.out.println("Nombre del cliente: " + facturaActual.getNombre());
            System.out.println("Cédula del cliente: " + facturaActual.getCedula());
            System.out.println("Número de factura: " + facturaActual.getNumeroFactura());
            System.out.println("Monto de la factura: " + facturaActual.getMontoFactura());
            System.out.println("Año de la factura: " + facturaActual.getAnioFactura());
            System.out.println("Mes de la factura: " + facturaActual.getMesFactura());
            System.out.println("Estado de la factura: " + facturaActual.getEstadoFactura());
        }

        double intereses = totalDeuda * 0.05;
        double totalCobrar = totalDeuda * 1.05;
        double cuotaMensual = totalCobrar / 6;

        System.out.println("Total adeudado por los clientes: " + totalDeuda);
        System.out.println("Intereses a cobrar: " + intereses);
        System.out.println("Total a cobrar: " + totalCobrar);
        System.out.printf("Cuota mensual a pagar por los clientes:", cuotaMensual);
    
    }
}

