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
public class EjemplosFunciones {
    Double numero, numero2, suma, resta, multiplicacion, division;
    
    public void ingresar() {
        numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));           
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
    }
    
    public void sumar() {
        suma = numero + numero2;
        JOptionPane.showMessageDialog(null, +numero+ " + " +numero2+ " = " +suma);
    }
    
    public void restar() {
        resta = numero - numero2;
        JOptionPane.showMessageDialog(null, +numero+ " - " +numero2+ " = " +resta);
    }
    
    public void multiplicar() {
        multiplicacion = numero * numero2;
        JOptionPane.showMessageDialog(null, +numero+ " x " +numero2+ " = " +multiplicacion);
    }
    
    public void dividir() {
        division = numero / numero2;
        JOptionPane.showMessageDialog(null, +numero+ " / " +numero2+ " = " +division);
    }
    
    public static void main(String[] args) {
        
        EjemplosFunciones operaciones = new EjemplosFunciones();
        operaciones.ingresar();
        operaciones.sumar();
        operaciones.restar();
        operaciones.multiplicar();
        operaciones.dividir();
    }
}   

    

