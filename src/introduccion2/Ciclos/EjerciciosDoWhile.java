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
        
        Integer contador, suma, precio, pesos;
        
        contador = 0;
        suma = 0;
        
        JOptionPane.showMessageDialog(null, "Suma de 5 precios de camisas en dolares");
        
        do {
            contador++;
            precio = Integer.parseInt(JOptionPane.showInputDialog("Camisa #"+contador+ "\n Precio de camisa en dolares:"));
            suma = suma+precio;   
        }
        
        while (contador<5); 
        pesos = suma * 3000;
        JOptionPane.showMessageDialog(null, "Precio de camisas en dolares: $" +suma+ "\n Equivalencia de peso a dolar: $1 USD = $3000 COP \n Precio de camisas convertidos a pesos: $" +pesos);
        
        /* 2. Se pretende leer todos los empleados de una empresa situados en un archivo y a la
        terminacion de la lectura del archivo se debe visualizar un mensaje que muestre 
        el numero de trabajadores que ganan mas de 2.500.000*/
        
        Integer contador2, NumEmpleados, Dinero, EmpMasDinero;
        
        contador2 = 0;
        EmpMasDinero = 0;
        
        NumEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Numero de trabajadores de la empresa "));
        
        do {
            contador2++;
            Dinero = Integer.parseInt(JOptionPane.showInputDialog("Trabajador #" +contador2+ "\n Dinero que gana"));
            
            if (Dinero>2500000) {
                EmpMasDinero++;
            }
        } 
        while (contador2<NumEmpleados);
        JOptionPane.showMessageDialog(null, "De " +NumEmpleados+ " trabajadores, " +EmpMasDinero+ " ganan mas de 2.500.000");
        
        /* 3. Leidos 200 numeros de teclado, se desea conocer cuales son multiplos de
        2, de 3 y de 5*/
        
        Integer contador3, numero, MultiplosCinco, MultiplosTres, MultiplosDos;
        
        contador3 = 0;
        MultiplosCinco = 0;
        MultiplosTres= 0;
        MultiplosDos= 0;
        
        JOptionPane.showMessageDialog(null, "Ingrese 200 numeros ");
        do {
            contador3++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero #" +contador3));
            
            if (numero%3==0) {
                MultiplosTres++;
            } else if (numero%2==0) {
                    MultiplosDos++;
            } else if (numero%5==0){
                MultiplosCinco++;
            }
            }
        
        while (contador3<200);
        
        JOptionPane.showMessageDialog(null, "De los " +contador3+ " numeros ingresados, se concluyo que: \n " +MultiplosDos+ " son multiplos de 2, \n " +MultiplosTres+ " son multiplos de 3, \n y " +MultiplosCinco+ " son multiplos de 5");
        
        /* 4. La compañia Lacteos Purace abre diariamente una caja con 500.000 para la cual se registran
        egresos (en numeros positivos). Calcular los egresos de la compañia y mostrar cuanto queda en la caja
        El programa termina cuando se ingresa un egreso imaginario de 0*/
        
        Integer contador4, numegresos, egresos, caja;
        
        contador4 = 0;
        caja = 500000;
        
        numegresos = Integer.parseInt(JOptionPane.showInputDialog("cuantos egresos va a realizar?"));
        
        do {
            contador4++;
            egresos = Integer.parseInt(JOptionPane.showInputDialog("Valor egreso #" +contador4));
            caja = caja - egresos;  
        }
        while (contador4<numegresos);
        
        JOptionPane.showMessageDialog(null, "Dinero que aun queda en la caja: " +caja);
        
        /*Extras lsadksadklkñslda
        1. hacer un programa que clasifique 400 personas segun el deporte que practica
        Los deportes son: ajedrez, atletismo, baloncesto, futbol, gimnasia, karate, natacion
        tiro y voleibol*/
        
//        String deporte;
//        Integer contador4, ajedrez, atletismo, baloncesto, futbol, gimnasia, karate, natacion, tiro, voleibol;
//        
//        contador4 = 0;
//        ajedrez = 0;
//        atletismo = 0;
//        baloncesto = 0;
//        futbol = 0;
//        gimnasia = 0;
//        karate = 0;
//        natacion = 0;
//        tiro = 0;
//        voleibol = 0;
//        
//        
//        JOptionPane.showMessageDialog(null, "Clasificacion de deportes de 400 personas!");
//        JOptionPane.showMessageDialog(null, "Deportes que puede escoger: ajedrez, atletismo, baloncesto, futbol, gimnasia, karate, natacion, tiro o voleibol");
//        do {
//            contador4++;
//            deporte = JOptionPane.showInputDialog("Deporte de persona #" +contador4);
//            
//            if ("ajedrez".equals(deporte)) {
//                ajedrez++;
//            } else if ("atletismo".equals(deporte)){
//                atletismo++;
//            } else if ("baloncesto".equals(deporte)) {
//                baloncesto++;
//            } else if ("futbol".equals(deporte)) {
//                futbol++;
//            } else if ("gimnasia".equals(deporte)) {
//                gimnasia++;
//            }  else if ("karate".equals(deporte)) {
//                karate++;
//            } else if ("natacion".equals(deporte)) {
//                natacion++;
//            } else if ("tiro".equals(deporte)) {
//                tiro++;
//            } else if ("voleibol".equals(deporte)) {
//                voleibol++;
//            } else {
//                JOptionPane.showMessageDialog(null, "Debe ingresar uno de los deportes mencionados");
//            } 
//        }
//        
//        while (contador4<400);
//        JOptionPane.showMessageDialog(null, "Resultados!: \nPersonas que practican ajedrez: " +ajedrez+ "\n"
//                + "Personas que practican atletismo: " +atletismo+ "\n"
//                + "Personas que practican baloncesto: " +baloncesto+ "\n"
//                + "Personas que practican futbol: " +futbol+ "\n"
//                + "Personas que practican gimnasia: " +gimnasia+ "\n"
//                + "Personas que practican karate: " +karate+ "\n"
//                + "Personas que practican natacion: " +natacion+ "\n"
//                + "Personas que practican tiro: " +tiro+ "\n"
//                + "Personas que practican voleibol: " +voleibol+ "\n");
        
        /* 2. Dado N, mostrar los numeros 2, 4, 6, 8, ... N*/
        
//        Integer contador, N;
//        
//        contador = 0;
//        
//        N = Integer.parseInt(JOptionPane.showInputDialog("limite de numeros pares"));
//        do {
//            contador = contador +2;
//            JOptionPane.showMessageDialog(null, +contador);
//        }
//        while (contador<N);
}    }