/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;
import javax.swing.JOptionPane;
/**
 *
 * @author SOPORTE
 */
public class FuncionesEjercicio01 {
    
    /* 1. Diseñar un programa que a partir de una cantidad de pesos ingresada,
    permita tener el valor equivalente en dolares y euros 
    (supona que un dolar son 2000 y un euro son 3000 pesos)*/
    
    Double peso, dolar, euro;
    
    public void insertar() {
    peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en pesos a convertir"));    
    }
    
    public void valor_dolar() {
        dolar = peso / 2000;
        JOptionPane.showMessageDialog(null, +peso+ " COP = " +dolar+ " USD"); 
    }
    
    public void valor_euro() {
        euro = peso / 3000;
        JOptionPane.showMessageDialog(null, +peso+ " COP = " +euro+ " EUR"); 
    }
    
    public static void main(String[] args) {
        
        FuncionesEjercicio01 conversion = new FuncionesEjercicio01();
        conversion.insertar();
        conversion.valor_dolar();
        conversion.valor_euro();
    }
}
