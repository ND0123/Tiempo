/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizz.semana.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author XPC
 */
public class TiendaAbarrotes {
private Producto[] productos;
    private int numProductos;

    public TiendaAbarrotes(Producto[] productos, int numProductos) {
        this.productos = productos;
        this.numProductos = numProductos;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }

public TiendaAbarrotes(int numProductos) {
        this.numProductos = numProductos;
        this.productos = new Producto[numProductos];
    }

    public void registrarProducto(int posicion, String nombre) {
        productos[posicion] = new Producto(nombre);
    }

    public void mostrarVentasTotalesPorProducto() {
        String mensaje = "Total de ventas por producto:\n";
        for (Producto p : productos) {
            mensaje += p.getNombre() + ": " + p.totalVentas() + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void mostrarDiaMayorVentas() {
        int[] ventasPorDia = new int[7];
        for (Producto p : productos) {
            int[] ventas = p.getVentasSemanales();
            for (int dia = 0; dia < 7; dia++) {
                ventasPorDia[dia] += ventas[dia];
            }
        }

        int mayorVentas = ventasPorDia[0];
        int diaMayor = 0;
        for (int i = 1; i < 7; i++) {
            if (ventasPorDia[i] > mayorVentas) {
                mayorVentas = ventasPorDia[i];
                diaMayor = i;
            }
        }

        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        JOptionPane.showMessageDialog(null, 
            "El día con mayores ventas es " + dias[diaMayor] + " (Total: " + mayorVentas + ")");
    }

    public void mostrarProductoMasVendido() {
        int mayorVentas = productos[0].totalVentas();
        String productoMasVendido = productos[0].getNombre();

        for (int i = 1; i < numProductos; i++) {
            int ventasActual = productos[i].totalVentas();
            if (ventasActual > mayorVentas) {
                mayorVentas = ventasActual;
                productoMasVendido = productos[i].getNombre();
            }
        }

        JOptionPane.showMessageDialog(null, 
            "El producto más vendido es " + productoMasVendido + " con " + mayorVentas + " unidades.");
    }
}
