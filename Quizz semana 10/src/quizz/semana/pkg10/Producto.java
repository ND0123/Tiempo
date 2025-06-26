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
public class Producto {
  private String nombre;
    private int[] ventasSemanales; // Arreglo de 7 posiciones, ventas de lunes a domingo.

  public Producto(String nombre) {
        this.nombre = nombre;
        this.ventasSemanales = new int[7];
        pedirVentas();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getVentasSemanales() {
        return ventasSemanales;
    }

    public void setVentasSemanales(int[] ventasSemanales) {
        this.ventasSemanales = ventasSemanales;
    }
   public void pedirVentas() {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (int i = 0; i < 7; i++) {
            ventasSemanales[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingresa ventas de " + dias[i] + " para " + nombre + ":")
            );
        }
    }

    public int totalVentas() {
        int total = 0;
        for (int ventas : ventasSemanales) {
            total += ventas;
        }
        return total;
        }

    
    
    
    
    
}
