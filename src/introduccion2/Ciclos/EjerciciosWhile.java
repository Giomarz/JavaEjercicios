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
public class EjerciciosWhile {

    public static void main(String[] args) {

        /* Ciclo While 
        1. Se desea leer las calificaciones de una clase de informatica
         y contar el numero total de aprobados (una asignatura se aprueba con una nota mayor
        o igual a 3)*/
        
        Integer contador, calificacion, NumeroEst, aprobados, noAprobados;
        
        contador = 0;
        aprobados = 0;
        noAprobados = 0;
        
        NumeroEst = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de estudiantes en la clase de informatica"));
        
        while  (contador<NumeroEst) {
            contador++;
            calificacion = Integer.parseInt(JOptionPane.showInputDialog (null, "Calificacion de estudiante #" +contador));
            
            if (calificacion>=3) {
                aprobados++;
            } else {
                noAprobados++;
            }
            
           
        }
       
         JOptionPane.showMessageDialog(null, "De un total de " +NumeroEst+ " estudiantes, " +aprobados+ " aprobaron la materia y " +noAprobados+ " no aprobaron");
         
        /*2. Elaborar un algoritmo que permita ingresar 20 numeros y muestre todos los numeros menores o iguales a 25*/
        
        Integer contador2, numero, menores;
        
        contador2 = 0;
        menores = 0;
        
        while (contador2<19) {
            contador2++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero #" +contador2));
            
            if (numero<=25) {
                menores++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "de " +contador2+ " numeros ingresados, " +menores+ " son menores o iguales a 25");

        /*3. se pretende leer las edades de todos los empleados de una empresa a la terminacion de la lectura 
        se debe visualizar un mensaje que muestre el numero de trabajadores mayores a 65 años*/
        
        Integer contador3, NumEmpleados, edad, EmpMayores;
        
        contador3 = 0;
        EmpMayores = 0;
        
        NumEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de empleados de la empresa"));
        
        while (contador3<NumEmpleados) {
            contador3++;
            edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del empleado #" +contador3));
            
            if (edad>=65) {
                EmpMayores++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Numero de empleados que son mayores: " +EmpMayores);
         
        /* 4. dadas las horas trabajadas por 20 personas y la tarifa de pago de cada uno, calcular el 
        salario correspondiente*/
        
        Integer contador4, horast, pago, salario;
        
        contador4 = 0;
        
        while (contador4<5) {
            contador4++;
            horast = Integer.parseInt(JOptionPane.showInputDialog("persona #" +contador4+ "\n Horas trabajadas"));
            pago = Integer.parseInt(JOptionPane.showInputDialog("Tarifa de pago"));
            
            salario = pago * horast;
            
            JOptionPane.showMessageDialog(null, "Salario correspondiente:! " +salario);
        }
        
        /* 5. Determinar si un numero es primo o no. recuerde que un numero primo es aquel cuyo
        residuo de la division es 0 unicamente si se divide entre 1 y el mismo, en otro caso no.*/
        
//        Integer contador5, veces, numero4;
//
//        contador5 = 0;
//
//        veces = Integer.parseInt(JOptionPane.showInputDialog("Veces que quiere saber si un numero es primo"));
//        while (contador5 < veces) {
//            contador5++;
//            numero3 = Integer.parseInt(JOptionPane.showInputDialog("Numero a verificar #" + contador5));
//
//            if (numero3%1==0 && numero3%numero3==0) {
//                JOptionPane.showMessageDialog(null, "El numero ingresado: " + numero3 + " SI es primo!");
//            } else {
//                JOptionPane.showMessageDialog(null, "El numero ingresado: " + numero3 + " NO es primo!");
//            }
//        }

        /*Extra klsñadlkñsadsaldñkd
        1. leer 100 numeros desde el teclado y determinar el promedio de los numeros positivos y el promediio
        de los numeros negativos*/
        
//        Integer contador5, numero3, positivos, promediopos, sumapos, negativos, sumaneg, promedioneg;
//        
//        contador5 = 0;
//        positivos = 0;
//        sumapos = 0;
//        negativos = 0;
//        sumaneg = 0;
//        
//        JOptionPane.showMessageDialog(null, "Promedio de numeros positivos y negativos");
//        
//        while (contador5<100) {
//            contador5++;
//            numero3 = Integer.parseInt(JOptionPane.showInputDialog("Numero #" +contador5));
//            
//            if (numero3>=0) {
//                positivos++;
//                sumapos = sumapos + numero3;
//            } else {
//                negativos++;
//                sumaneg = sumaneg + numero3;
//            }
//        }
//        promediopos = sumapos /  positivos;
//        promedioneg = sumaneg / negativos;
//        
//        JOptionPane.showMessageDialog(null, "Promedios!");
//        JOptionPane.showMessageDialog(null, " Numeros positivos: " +positivos+ "\n suma de numeros: " +sumapos+ "\n promedio de suma de numeros: " +promediopos);
//        JOptionPane.showMessageDialog(null, "numeros negativos: " +negativos+ "\n suma de numeros: " +sumaneg+ "\n promedio de suma de numeros: " +promedioneg);
//        
        /*2. elaborar un algoritmo que permita el ingreso de 100 numeros el algoritmo debe sumar todos los numeros que sean multiplos de 3*/
        
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
    }
}
