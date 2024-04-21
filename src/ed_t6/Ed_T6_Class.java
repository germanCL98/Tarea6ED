/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_t6;

// Este es un comentario para comprobar el funcionamiento del control de versiones desde Netbeans 
public class Ed_T6_Class {

    private static final double DESCUENTO_CANTIDAD = 5; 
    private static final double DESCUENTO_PORCENTAJE_REGULAR = 0.8;
    private static final double DESCUENTO_PORCENTAJE_BASE = 0.95;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        if(numProductos > 3)
            precioProducto -= DESCUENTO_CANTIDAD;

        double total = calcularTotal(precioProducto, numProductos);
        imprimirTotalYMensaje(total);
    }

    private double calcularTotal(double precioProducto, int numProductos) {
        if (numProductos != 0) {
            return precioProducto * DESCUENTO_PORCENTAJE_REGULAR;
        } else {
            return precioProducto * DESCUENTO_PORCENTAJE_BASE;
        }
    }

    private void imprimirTotalYMensaje(double total) {
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");
    }
}