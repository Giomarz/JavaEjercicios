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
public class EjerciciosDoWhile {
    public static void main(String[] args) {
        
        /*Do While
        1. Hacer un programa que sume 5 precios  de camisas en dolares, y que
        luego muestre el total de la venta en pesos*/
        
//        Integer contador5, suma, precio, pesos;
//        
//        contador5 = 0;
//        suma = 0;
//        
//        JOptionPane.showMessageDialog(null, "Suma de 5 precios de camisas en dolares");
//        
//        do {
//            contador5++;
//            
//            precio = Integer.parseInt(JOptionPane.showInputDialog("Camisa #"+contador5+ "\n Precio de camisa en dolares:"));
//            suma = suma+precio;
//            
//        }
//        while (contador5<5); 
//        pesos = suma * 3000;
//        JOptionPane.showMessageDialog(null, "Precio de camisas en dolares: $" +suma+ "\n Equivalencia de peso a dolar: $1 USD = $3000 COP \n Precio de camisas convertidos a pesos: $" +pesos);
//        
//        }

        /* 2. Se pretende leer todos los empleados de una empresa situados en un archivo y a la
        terminacion de la lectura del archivo se debe visualizar un mensaje que muestre 
        el numero de trabajadores que ganan mas de 2.500.000*/
        
//        Integer contador6, NumEmpleados2, Dinero, EmpMasDinero;
//        
//        contador6 = 0;
//        EmpMasDinero = 0;
//        
//        NumEmpleados2 = Integer.parseInt(JOptionPane.showInputDialog("Numero de trabajadores de la empresa "));
//        
//        do {
//            contador6++;
//            Dinero = Integer.parseInt(JOptionPane.showInputDialog("Trabajador #" +contador6+ "\n Dinero que gana"));
//            
//            if (Dinero>2500000) {
//                EmpMasDinero++;
//            }
//        } 
//        while (contador6<NumEmpleados2);
//        
//        JOptionPane.showMessageDialog(null, "De " +NumEmpleados2+ " trabajadores, " +EmpMasDinero+ " ganan mas de 2.500.000");
//        }
        
        /* 3. Leidos 200 numeros de teclado, se desea conocer cuales son multiplos de
        2, de 3 y de 5*/
        
        Integer contador7, numero4, MultiplosCinco, MultiplosTres, MultiplosDos;
        
        contador7 = 0;
        MultiplosCinco = 0;
        MultiplosTres= 0;
        MultiplosDos= 0;
        
        JOptionPane.showMessageDialog(null, "Ingrese 200 numeros ");
        do {
            contador7++;
            numero4 = Integer.parseInt(JOptionPane.showInputDialog("Numero #" +contador7));
            
            if (numero4%3==0) {
                MultiplosTres++;
            } else if (numero4%2==0) {
                    MultiplosDos++;
            } else if (numero4%5==0){
                MultiplosCinco++;
            }
                
            }
        
        while (contador7<6);
        
        JOptionPane.showMessageDialog(null, "De los " +contador7+ " numeros ingresados, se concluyo que: \n " +MultiplosDos+ " son multiplos de 2, \n " +MultiplosTres+ " son multiplos de 3, \n y " +MultiplosCinco+ " son multiplos de 5");
        }  
        
            
   
        /* 4. */

    }

