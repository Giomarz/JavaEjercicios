/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion2.Ciclos;
import javax.swing.JOptionPane;

/**
 *
 * @author giiom
 */
public class EjerciciosFor {
    public static void main(String[] args) {
        
        /* For
        1. Mostrar la tabla de multiplicar desde el 1 hasta el 10, para un numero leido desde teclado*/
        
        Integer numero3;
        
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que quiere  de la tabla de multiplicar hasta el 10"));
        
        for (int i = 0; i < 11; i++) {
            JOptionPane.showMessageDialog(null, numero3+ " x " +i+ " = " +numero3*i);
        }
    
  
        /* 2. */

        
        /* 3. */

        /* 4. */
    }
}
