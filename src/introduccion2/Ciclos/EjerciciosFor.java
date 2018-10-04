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
        
        Integer numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que quiere  de la tabla de multiplicar hasta el 10"));
        
        for (int i = 0; i < 11; i++) {
            JOptionPane.showMessageDialog(null, numero+ " x " +i+ " = " +numero*i);
        }
  
        /* 2. Leidos 200 numeros de teclado, se desea conocer cuales son multiplos de
        2, de 3 y de 5*/
        
        Integer i, numero2, multiplodos, multiplotres, multiplocinco;
        
        multiplodos = 0;
        multiplotres = 0;
        multiplocinco = 0;
        
        for (i = 1; i < 4; i++) {
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Numero #" +i));
            
            if (numero2%5==0) {
                multiplocinco++;
            } else if (numero2%3==0) {
                multiplotres++;
            } else if (numero2%2==0) {
                multiplodos++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "De los " +i+ " numeros leidos, \n " +multiplocinco+ " son multiplos de cinco, \n" +multiplotres+ ""
        + " son multiplos de tres, \n" +multiplodos+ " son multiplos de 2");
        
        /* 3. Realizar un algoritmo que muestre por pantalla la tabla de multiplicar decreciente del 2*/
        
        Integer numero3;     
        
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));
     
        for (int i2 = 10; i2 > 0; i2--) {

         JOptionPane.showMessageDialog(null, numero3+ " x " +i2+ " = " +numero3*i2);
      }

        /* 4. hacer un programa  que sume los numeros  que son multipos de 3,5 y de 7  comprendidos  entre los numeros 100 y 300 inclusive */
       
       Integer i3, numero4, multiplotres1, multiplocinco1, multiplosiete1;
       
       multiplotres = 0;
       multiplocinco1 = 0;
       multiplosiete1 = 0;
       multiplotres1 = 0;
       
       for (i3 = 100; i3 < 300; i3++) {
           numero4 = Integer.parseInt(JOptionPane.showInputDialog("Numero #" +i3));
           
           if (numero4%3==0) {
               multiplotres1++;
           } else if (numero4%5==0) {
               multiplocinco1++;
           } else if (numero4%7==0) {
               multiplosiete1++;
           }
       }
       
       JOptionPane.showMessageDialog(null, multiplosiete1 +" son multiplos de siete"+ " \n " +multiplotres+ " son multiplos de tres, \n" +multiplocinco+ ""
               + " son multiplos de cinco, \n");
    }
}
