/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion2;
import javax.swing.JOptionPane;
/**
 *
 * @author Leiber_giomar
 */
public class Introduccion3 {
    public static void main(String[] args) {
        
        /* 1. Se cargan por teclado tres numeros distindos. Mostrar por pantalla el
        *mayor de ellos*/
     
//        Double Num1;
//        Double Num2;
//        Double Num3;
//        
//    
//        Num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite el Numero 1"));
//        Num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite el Numero2"));
//        Num3 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite el Numero3"));
//        
//        if(Num1>Num2 && Num1>Num3){ 
//        JOptionPane.showMessageDialog(null,"el numero 1 es mayor");
//    } 
//        else
//             if(Num2>Num1 && Num2>Num3){ 
//        JOptionPane.showMessageDialog(null,"el numero 2 es mayor");
//    } 
//             else 
//                 if(Num3>Num1 && Num3>Num2){ 
//        JOptionPane.showMessageDialog(null,"el numero 3 es mayor");
//    } 
//    }
//        
//        
//    }
    

//*2.se ingresa por teclado un valor entero, mostrar una leyenda que indique si el numero es positivo,cero,negativo*/
//
//    Integer numero;
//    numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));
//        if (numero<0) {
//            JOptionPane.showMessageDialog(null, "El número ingresado es negativo");
//        } else {
//            if (numero==0) {
//                JOptionPane.showMessageDialog(null, "El numero ingresado es un cero");
//            } else  {
//                if (numero>0) {
//                    JOptionPane.showMessageDialog(null, "El numero ingresado es un positivo");
//                }
//            }
//        }
//        }
//}

/*3.confeccionar un programa que permita cargar un numero entero positivo de hasta tres cifras y muestre un mensaje indicando si tiene 1,2 o 3 cifras*/

//Integer Numero;
//
//Numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Número"));
//
// if (Numero>=0 && Numero<=9) {
//      JOptionPane.showMessageDialog(null, "El número ingresado es de una cifra");
//      } else {
//            if (Numero>=10 && Numero<=99) {
//               JOptionPane.showMessageDialog(null, "El numero ingresado de dos cifras");
//           } else  {
//                if (Numero>=100 && Numero <=999) {
//                   JOptionPane.showMessageDialog(null, "El numero ingresado es de tres cifras");
//               } else {
//                    JOptionPane.showMessageDialog(null, "El numero ingresado tiene que ser de maximo tres cifras");
//                }
//            }
//      }
//       
//}

    /*4.de un postulante a un empleo que realizo un test de capacitacion se obtuvo la siguiente informacion: nombre del postulante, 
    *cantidad total de preguntas,que se realizaron y cantidad de preguntas que contesto correctamente se ´pide confeccionar un programa 
    *que lea los datos del postulante e informar el nivel del mismo segun el porcentaje de respuestas correctas que a obtenido y sabiendo 
    que 
    * nivel superior: porcentaje>=90%
    nivel medio : porcentaje>=75% y <90%
    nivel regular: porcentaje>=50% y <75%
    fuera de nivel porcentaje<50%*/


//       String Nombre;
//       Double cantidad_Preguntas;
//       Double Preguntas_correctas;
//       Double porcentaje;
//       
//    
//      Nombre = JOptionPane.showInputDialog("Ingrese su nombre");
//      cantidad_Preguntas = Double.parseDouble(JOptionPane.showInputDialog(null,"escriba la cantidad de preguntas realizadas"));
//      Preguntas_correctas = Double.parseDouble(JOptionPane.showInputDialog(null,"escriba la cantidad de respuestas que tuvo correctas"));
      
//      Double nivel_superior = cantidad_Preguntas * 0.90;
//      Double nivel_medio = cantidad_Preguntas * 0.75;
//      Double nivel_regular = cantidad_Preguntas * 0.50;
//      Double fuera_nivel = cantidad_Preguntas * 
//      JOptionPane.showMessageDialog(null, "Sr " +Nombre+ ",");
      
      
      /* 5. En una univesidad, los alumnos estan categorizados en 4 categorias. A cada
       categoria le corresponde una pension mensual distinta dada en la siguiente tabla
      * Categoria Pension
      *     A        S/. 550
      *     B        S/. 500
      *     C        S/. 460
      *     D        S/. 400
      
      Semestralmente, la universidad efectua rebajas en las pensiones de sus estudiantes
      a partir del segundo ciclo en base al promedio ponderado del ciclo anterior en
      porcentajes dados en la tabla siguiente
      
      promedio       descuento
      0 a 13.99      No hay descuento
      14.00 a 15.99  10%
      16.00 a 17.99  12%
      18.00 a 20.00  15%
      
      Diseñe un programa que determine cuanto de rebaja recibira un estudiante sobre su 
      pension actual y a cuanto asciende su nueva pension*/
      
      
     /* 6. Una institucion benefica recibe anualmente una donacion proveniente de europa y lo
      reparte entre un centro de salud, un comedor de niños y una parte lo invierte en la
      bolsa de acuerdo a lo siguiente:
      
      si el monto de la donacion es de $10000 o mas: 30% se destina al centro de salud, 
      50% al comedor de niños y el resto se invierte en la bolsa
      
      si el monto de la donacion es menor de $10000: 25% se destina al centro de salud, 
      60% al comedor de niños y el resto se invierte en la bolsa
      
      la institucion desea saber cuanto de dinero destinara a cada rubro anualmente*/ 
      
//     Integer dinero; 
//     Double salud, comedor, bolsa, resto;
//     
//     dinero = Integer.parseInt(JOptionPane.showInputDialog(null, "Donacion que recibe: "));
//     
//        if (dinero>= 10000) {
//            salud = dinero * 0.30;
//            comedor = dinero * 0.50;
//            resto = dinero * 0.20;
//            
//            JOptionPane.showMessageDialog(null, "Dinero donado: " +dinero);
//            JOptionPane.showMessageDialog(null, "Cantidad destinada para centro de salud (30% de donacion): " +salud);
//            JOptionPane.showMessageDialog(null, "Cantidad destinada para comedor de niños (50% de donacion): " +comedor);
//            JOptionPane.showMessageDialog(null, "Cantidad destinada para invertir en bolsa (porcentaje sobrante): " +resto);
//            
//        } else {
//            salud = dinero * 0.25;
//            comedor = dinero * 0.60;
//            resto = dinero * 0.15;
//            
//            JOptionPane.showMessageDialog(null, "Dinero donado: " +dinero);
//            JOptionPane.showMessageDialog(null, "Cantidad destinada para centro de salud (25% de donacion): " +salud);
//            JOptionPane.showMessageDialog(null, "Cantidad destinada para comedor de niños (60% de donacion): " +comedor);
//            JOptionPane.showMessageDialog(null, "Cantidad destinada para invertir en bolsa (porcentaje sobrante): " +resto);
//        }
     
        
     /* 7 Una papelera ha puesto en oferta la venta al por mayor (en cientos) de papel bond de
        acuerdo a los siguientes criterios:
        Para los primeros 5 cientos, se hace un descuento del 10% por cada ciento.
        Para los cientos en exceso sobre 5, se hace un descuento del 15% por cada
        ciento.
        Diseñe un algoritmo que determine el importe bruto, el importe del descuento y el
        importe a pagar por una compra de papel bond*/
     
        Double Cantidad, Descuento;
        JOptionPane.showMessageDialog(null, "Compra de papel bond por cientos");
        JOptionPane.showMessageDialog(null, "Compra de papel bond por cientos");
        Cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuantos cientos desea comprar?"));
        
        
        if (Cantidad<=5) {
            Descuento = Cantidad * 0.10;
            JOptionPane.showMessageDialog(null, "Por su compra de menos de 5 cientos tiene un descuento de 10% por cada uno");
        } else {
            Descuento = Cantidad * 0.15;
            JOptionPane.showMessageDialog(null, "Por su compra de mas de 5 cientos tiene un descuento de 15% por cada uno");
        }
    }
}