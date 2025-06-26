/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizz.semana.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author XPC
 */
public class QuizzSemana10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos deseas registrar?"));

        TiendaAbarrotes tienda = new TiendaAbarrotes(n);

        for (int i = 0; i < n; i++) {
            String nombre = JOptionPane.showInputDialog("Ingresa el nombre del producto " + (i + 1));
            tienda.registrarProducto(i, nombre);
        }

        tienda.mostrarVentasTotalesPorProducto();
        tienda.mostrarDiaMayorVentas();
        tienda.mostrarProductoMasVendido();
    }
    
}
