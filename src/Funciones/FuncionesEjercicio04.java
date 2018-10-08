/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;
import javax.swing.JOptionPane;

/**
 *
 * @author giiom
 */
public class FuncionesEjercicio04 {
    
    /* 4. Juan tiene x billetes de $200 pesos, y billetes de $100 y z billetes de $50,
    determinar los datos de entrada, proceso y salida para conocer cuanto dinero tiene juan*/
    
    Integer billetes_x, billetes_y, billetes_z, total_x, total_y, total_z, dinero;
    
    public void billetes_x() {
        billetes_x = Integer.parseInt(JOptionPane.showInputDialog("Cuantos billetes de $200 pesos tenés?"));
    }
    
    public void billetes_y() {
        billetes_y = Integer.parseInt(JOptionPane.showInputDialog("Cuantos billetes de $100 pesos tenés?"));
    }
    
    public void billetes_z() {
        billetes_z = Integer.parseInt(JOptionPane.showInputDialog("Cuantos billetes de $50 pesos tenés?"));
    }
    
    public void cantidades() {
        total_x = billetes_x * 200;
        total_y = billetes_y * 100;
        total_z = billetes_z * 50;
        
        dinero = total_x  + total_y + total_z;
    }
    
   public void comunicado() {
       JOptionPane.showMessageDialog(null, "Mr Juan, usted tiene " +billetes_x+ " billetes x, \n"
               + "dinero total con billetes x ($200): " +total_x+ "\n"
               + "" +billetes_y+ " billetes y, \n"
               + "dinero total con billetes y ($100): " +total_y+ "\n"
               + "y " +billetes_z+ " billetes z \n"
               + "dinero total con billetes z ($50): " +total_z+ "\n"
               + "dinero total!: " +dinero);
   }
   
    public static void main(String[] args) {
        
        FuncionesEjercicio04 Juan = new FuncionesEjercicio04();
        Juan.billetes_x();
        Juan.billetes_y();
        Juan.billetes_z();
        Juan.cantidades();
        Juan.comunicado();
    }
}
