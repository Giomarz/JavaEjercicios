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
public class FuncionesEjercicio02 {
    
    /* 2. Desarrollar un programa que a partir de la fecha de nacimiento digitada
    (año de nacimiento) permita determinar la edad de una persona*/
    
    Integer anio, resta;
    
    public void insertar() {
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento"));
    }
    
    public void resta_edad() {
        resta = 2017 - anio;
        JOptionPane.showMessageDialog(null, "Usted tiene " +resta+ " años!");
    }
    
    public static void main(String[] args) {
        
        FuncionesEjercicio02 edad = new FuncionesEjercicio02();
        edad.insertar();
        edad.resta_edad();
    }
}
