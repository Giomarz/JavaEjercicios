/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion2.Ciclos.Arreglos;
import javax.swing.JOptionPane;
/**
 *
 * @author giiom
 */
public class EjerciciosArreglos {
    
    public static void main(String[] args) {
        
        /* 1. Cree un arreglo de 5 posiciones y llenelos con los numeros que el usuario desee*/
        
        Integer arreglo[], i, numero;
        
        arreglo = new Integer[5];
        
        for (i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero #" +i));
        }
        
        for (i = 0; i < arreglo.length; i++) {
            JOptionPane.showMessageDialog(null, "la edad #" +i+ " es " +arreglo[i]);
        }
        
        /* 2. Crear un arreglo de n posiciones y sumar todos los elementos del arreglo*/
        
        Integer arreglo2[], posiciones, i2, suma;
        
        posiciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de posiciones del arreglo"));
        arreglo2 = new Integer[posiciones];
        
        suma = 0;
        
        for ( i2 = 0; i2 < arreglo2.length; i2++) {
            arreglo2[i2] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor #" +i2));
            suma = suma + arreglo2[i2];
        }
//        
//        JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados en el arreglo es: " +suma);
//        
        
        /* 3. Mostrar los dias de la semana en un arreglo*/
        
        Integer i3;
        String DiasSemana[];
        DiasSemana = new String[7];
        
        DiasSemana[0] = "Lunes!";
        DiasSemana[1] = "Martes!";
        DiasSemana[2] = "Miercoles!";
        DiasSemana[3] = "Jueves!";
        DiasSemana[4] = "Viernes!";
        DiasSemana[5] = "Sabado!";
        DiasSemana[6] = "Domingo!";
        
        for (i3 = 0; i3 < DiasSemana.length; i3++) {
           JOptionPane.showMessageDialog(null, DiasSemana[i3]); 
        }

         /*---------ALTERNATIVA Punto 3.-------------------*/
         
//         Integer i33;
//         String DiasSemana2[], DiasSemanaIn;
//         DiasSemana2 = new String[7];
//         
//         for (i33 = 0; i33 < DiasSemana2.length; i33++) {
//            DiasSemana2[DiasSemanaIn] = JOptionPane.showMessageDialog(null, "Ingrese el dia de la semana #" +i33);
//        }
//         
//         for (int i33 = 0; i33 < DiasSemana2.length; i33++) {
//            
//        }
                                 
         /*NO TERMNADOOOOOOOO*/
         
        /* 4. Escribir un algoritmo que lea dos arreglos de numeros enteros ordenados
        ascendentemente y luego produzca la lista ordenada de la mezcla de los dos
        Por ejemplo, si los dos arreglos tienen los numeros 1, 3, 6, 9, 17, y 2, 4, 10, 17,
        respectivamente, la lista de numeros en la pantalla debe ser 1, 2, 3, 4, 6, 9, 10, 17, 17*/
        
        Integer ordenar[],tamanoO, ordenar2[], tamanoO2, i4, i44;
        
        tamanoO = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del arreglo de numeros"));
        ordenar = new Integer[tamanoO];
        
        for (i4 = 0; i4 < ordenar.length; i4++) {
            ordenar[i4] = Integer.parseInt(JOptionPane.showInputDialog("numero #" +i4));
        }
        
        tamanoO2 = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del arreglo de numeros 2"));
        ordenar2 = new Integer[tamanoO2];
        
        for (i44 = 0; i44 < ordenar2.length; i44++) {
            ordenar2[i44] = Integer.parseInt(JOptionPane.showInputDialog("numero #" +i44));
        }
        
        
        /*IDK HOW FINISH IT ;C */
        
        /* 5. Defina un arreglo de 10 enteros. Luego pida al usuario los valores numericos (no mas de 10)*/
        
        Integer enteros[], i5;
        
        enteros = new Integer[10];
        
        for (i5 = 0; i5 < enteros.length; i5++) {
            enteros[i5] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor #" +i5+ " (el valor tiene que ser menor o igual a 10)"));
        }
        
        JOptionPane.showMessageDialog(null, "Valores ingresados!");
         
        for (i5 = 0; i5 < enteros.length; i5++) {
            JOptionPane.showMessageDialog(null, enteros[i5]);
        }

        /* 6. Realizar una carga de la informacion mencionada:
        a. generar un vector que contenga el ingreso acumulado de los sueldos en los 5 meses
        por cada empleado.
        b. mostrar por pantalla el total en sueldos a todos los empleados en los 5 meses*/
        
        Integer Sueldo[]; 
        Integer i6;
        
        Sueldo = new Integer[5];
        
        for (i6 = 0; i6 < Sueldo.length; i6++) {
            Sueldo[i6] = Integer.parseInt(JOptionPane.showInputDialog("Digite el ingreso acumulado del empleado #" +i6));
            
        }
        
        for (i6 = 0; i6 < Sueldo.length; i6++) {
            JOptionPane.showMessageDialog(null, "Los sueldos de los empleados son: empleado #"+i6+ ": " +Sueldo[i6]);
        }
        
    }
}
