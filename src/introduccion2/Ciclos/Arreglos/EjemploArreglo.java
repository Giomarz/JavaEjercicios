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
        
        /*ejemplo arreglo que guarda el numero de posiciones que la persona quiera,
        ademas ingresa en cada posicion una edad, y a partir de ella, determinar cuantas de esas edades
        ingresadas, son mayores y menoores de edad*/
        
        Integer TamanoArreglo, Edades2[], Mayores, Menores, i2;
        Integer auxiliar; //almacena el valor de edades
        
        TamanoArreglo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
        
        Edades2 = new Integer[TamanoArreglo];
        
        for (i2 = 0; i2 < Edades2.length; i2++) {
            Edades2[i2] = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad #" +i2));
            
        }
        
        Mayores  = 0;
        Menores  = 0;
        
        for (i2 = 0; i2 < Edades2.length; i2++) {
            if (Edades2[i2]>=18) {
                Mayores++;
            } else {
                Menores++;
            }
        }
        JOptionPane.showMessageDialog(null, "Cantidad de mayores: " +Mayores+ "\n"
                + "Cantidad de menores: " +Menores);
    }
    
}
