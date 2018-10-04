/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion2.Ciclos.Arreglos;
import javax.swing.JOptionPane;
/**
 *
 * @author SOPORTE
 */
public class EjemploArreglo {
    public static void main(String[] args) {
        
        /*Arreglo de 5 posiciones a la cual asignamos edades y la mostramos mediante un for*/
        
        Integer edades[];
        Integer i;
        edades = new Integer[5];
        
        edades[0] = 25;
        edades[1] = 19;
        edades[2] = 54;
        edades[3] = 17;
        edades[4] = 76;
        
        for (i = 0; i < edades.length; i++) {
            JOptionPane.showMessageDialog(null, "la edad #" +i+ " es " +edades[i]);
        }
        
    }
}
