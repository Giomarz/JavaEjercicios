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
public class EjerciciosCiclos {
    public static void main(String[] args) {
        
        /* Ciclo While 
        1. Se desea leer las calificaciones de una clase de informatica
         y contar el numero total de aprobados (una asignatura se aprueba con una nota mayor
        o igual a 3)*/
        
//        Integer contador, calificacion, NumeroEst, aprobados, noAprobados;
//        
//        contador = 0;
//        aprobados = 0;
//        noAprobados = 0;
//        
//        NumeroEst = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de estudiantes en la clase de informatica"));
//        
//        while  (contador<NumeroEst) {
//            contador++;
//            calificacion = Integer.parseInt(JOptionPane.showInputDialog (null, "Calificacion de estudiante #" +contador));
//            
//            if (calificacion>=3) {
//                aprobados++;
//            } else {
//                noAprobados++;
//            }
//            
//           
//        }
//        
//         JOptionPane.showMessageDialog(null, "De un total de " +NumeroEst+ " estudiantes, " +aprobados+ " aprobaron la materia y " +noAprobados+ " no aprobaron");
         
        /*2. Elaborar un algoritmo que permita ingresar 20 numeros y muestre todos los numeros menores o iguales a 25*/
        
//        Integer contador2, numero, menores;
//        
//        contador2 = 0;
//        menores = 0;
//        
//        while (contador2<19) {
//            contador2++;
//            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero #" +contador2));
//            
//            if (numero<=25) {
//                menores++;
//            }
//        }
//        
//        JOptionPane.showMessageDialog(null, "de " +contador2+ " numeros ingresados, " +menores+ " son menores o iguales a 25");
        
        /*3. elaborar un algoritmo que permita el ingreso de 100 numeros el algoritmo debe sumar todos los numeros que sean multiplos de 3*/
        
//        Integer contador3, numero2, multiplos, SumaMultiplos;
//        
//        contador3 = 0;  
//        multiplos = 0;
//        SumaMultiplos = 0;
//        
//        while (contador3<99) {
//            contador3++;
//            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Numero #" +contador3));
//            
//            if (numero2%3==0) {
//                multiplos++;
//                SumaMultiplos = SumaMultiplos + numero2;
//            } else {
//                JOptionPane.showMessageDialog(null, "No es multiplo de 3, no suma");
//            }
//        }
//        
//        JOptionPane.showMessageDialog(null, "Suma de numeros multiplos de 3: " +SumaMultiplos);
        
        /*4. se pretende leer las edades de todos los empleados de una empresa a la terminacion de la lectura 
        se debe visualizar un mensaje que muestre el numero de trabajadores mayores a 65 años*/
        
//        Integer contador4, NumEmpleados, edad, EmpMayores;
//        
//        contador4 = 0;
//        EmpMayores = 0;
//        
//        NumEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de empleados de la empresa"));
//        
//        while (contador4<NumEmpleados) {
//            contador4++;
//            edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del empleado #" +contador4));
//            
//            if (edad>=65) {
//                EmpMayores++;
//            }
//        }
//        
//        JOptionPane.showMessageDialog(null, "Numero de empleados que son mayores: " +EmpMayores);

/*-----------------------------------------------------------------------------------------------------------------------------------------------------*/ 
        
        /* For
        1. Mostrar la tabla de multiplicar desde el 1 hasta el 10, para un numero leido desde teclado*/
        
        Integer numero3;
        
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que quiere  de la tabla de multiplicar hasta el 10"));
        
        for (int i = 0; i < 11; i++) {
            JOptionPane.showMessageDialog(null, numero3+ " x " +i+ " = " +numero3*i);
        }
    }
}  
        /* 2. */

        
        /* 3. */

        /* 4. */

/*-----------------------------------------------------------------------------------------------------------------------------------------------------*/ 
        
        /*Do While
        1. */

