/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion2.Ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author SOPORTE
 */
public class While {
     
    public static void main(String[] args) {
       
        
       /* Ciclo while promedio de edades ingresadas*/
       
       Integer contador, suma, cantidad, edad, promedio;
       
       contador = 0;
       suma = 0;
       
       cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de edades a digitar"));
       
       while (contador<cantidad) {
           contador++;
           edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Edad #" +contador));
           suma=suma+edad;
           
       }
       promedio = suma/cantidad;
       JOptionPane.showMessageDialog(null, "El promedio de las edades es : " +promedio);
       
       
       
       
    }
}


