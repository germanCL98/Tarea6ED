/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_t6;

public class Ed_T6_Class {
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if(numProductos > 3)
            precioProducto -= 5;

        if (numProductos != 0) {
            total = precioProducto * 0.8;
            System.out.println("El total a pagar es: " + total);
            System.out.println("Enviado");
        } else {
            total = precioProducto * 0.95;
            System.out.println("El total a pagar es: " + total);
            System.out.println("Enviado");
        }
    }
}