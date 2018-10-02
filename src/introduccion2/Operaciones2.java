/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion2;
import java.util.Scanner;

/**
 *
 * @author SOPORTE
 */
public class Operaciones2 {
    
    public static void main (String[] args){
        Scanner Escribir = new Scanner (System.in);
        
        /*1. Realizar la carga del lado de un cuadrado, mostrar por pantalla el perimetro
        * del mismo (El perimetro de un cuadrado se calcula multiplicanco el valor del lado por 4 */
        System.out.println("Ejercicio 1");
        
        Float Numero;
        Float Perimetro;
        
        System.out.println("Ingrese el lado de un cuadrado");
        Numero = Escribir.nextFloat();
        Perimetro = Numero * 4;
        System.out.println("El perimetro de su cuadrado es: " +Perimetro);
        
        /*2. Escribir un programa en en cual se ingresen 4 numeros, calcular e informar la suma de los 2 
        * primeros y el producto del tercero y el cuarto*/
       
       System.out.println("Ejercicio 2");
       
       Integer Numero2;
       Integer Numero3;        
       Integer Numero4;
       Integer Numero5;
       Integer Suma;
       Integer Multiplicacion;
        
       System.out.println("Ingrese un primer número");
       Numero2 = Escribir.nextInt();
       System.out.println("Ingrese un segundo número");
       Numero3 = Escribir.nextInt();
       System.out.println("Ingrese un tercero número");
       Numero4 = Escribir.nextInt();
       System.out.println("Ingrese un cuarto número");
       Numero5 = Escribir.nextInt();
       
       Suma = Numero2 + Numero3;
       Multiplicacion = Numero4 * Numero5;
       
       System.out.println("El resultado de la suma de los 2 primeros numeros es: " +Suma);
       System.out.println("El resultado de la multiplicacion (producto) de los 2 ultimos numeros es: " +Multiplicacion);
        
        /* 3. Realizar un programa que lea cuatro valores numericos e informar su suma y producto */
        
        System.out.println("Ejercicio 1");
        
        Integer Numero6;
        Integer Numero7;
        Integer Numero8;
        Integer Numero9;
        Integer Suma2;
        Integer Multiplicacion2;
        
        System.out.println("Ingrese el primer número");
        Numero6 = Escribir.nextInt();
        System.out.println("Ingrese el segundo número");
        Numero7 = Escribir.nextInt();
        System.out.println("Ingrese el tercero número");
        Numero8 = Escribir.nextInt();
        System.out.println("Ingrese el cuarto número");
        Numero9 = Escribir.nextInt();
        
        Suma2 = Numero6 + Numero7+Numero8+Numero9;
        Multiplicacion2 = Numero6 * Numero7*Numero8*Numero9;

        
        System.out.println("El resultado de la suma de los 4  numeros es: " +Suma2);
        System.out.println("El resultado de la multiplicacion de los 4  numeros es: " +Multiplicacion2);

          /* 4. Se debe desarrollar un programa que pida el ingreso del precio de un articulo y la cantidad que se lleva el cliente.
          * Mostrar lo que debe abonar el comprador (Ingresar por teclado un precio sin decimales)
          *, es decir un entero: 2, 7, 90, etc.)*/
          
          System.out.println("Ejercicio 4");
          
          Integer Numero10;
          Integer Cantidad;
          Integer Multiplicacion3;
          Integer Abono;
          Integer Queda;
          
          System.out.println("Ingrese el precio del articulo");
          Numero10 = Escribir.nextInt();
          System.out.println("Cantidad que se lleva");
          Cantidad = Escribir.nextInt();
          Multiplicacion3 = Numero10 * Cantidad;
          System.out.println("Precio total de cantidad de articulos: " +Multiplicacion3);
          System.out.println("Cuanto desea abonar?");
          Abono = Escribir.nextInt();
          Queda = Multiplicacion3 - Abono;
          
          System.out.println("Usted ha abonado un total de: " +Abono+ ", le queda por pagar un total de: " +Queda);
          
          
    }
}
