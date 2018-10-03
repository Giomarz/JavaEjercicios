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
public class For {
    public static void main(String[] args) {
        
        /* Ciclo for numeros positivos negativos, suma y promedio de cada uno*/
        
        Integer contador, SumaPos, SumaNeg, cantidad, promedioPos = null, promedioNeg = null, numero, ContPos, ContNeg;
        
        
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de numeros a ingresar"));
        
        ContPos = 0;
        ContNeg = 0;
        SumaPos = 0;
        SumaNeg = 0;
        
        for (contador = 1; contador < cantidad+1; contador++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog(" Numero #" +contador));
            
            if (numero>=0)
            {
                ContPos++;
                SumaPos = SumaPos + numero;
                promedioPos = SumaPos/ContPos;
            } else {
                
                ContNeg++;
                SumaNeg = SumaNeg + numero;
                promedioNeg = SumaNeg/ContNeg;
               
            }
            
        }
        
         JOptionPane.showMessageDialog(null, "Cantidad de numeros positivos: " +ContPos);
         JOptionPane.showMessageDialog(null, "Suma de numeros positivos ingresados: " +SumaPos);
         JOptionPane.showMessageDialog(null, "Promedio de numeros positivos: " +promedioPos);
         
         JOptionPane.showMessageDialog(null, "Cantidad de numeros negativos: " +ContNeg);
         JOptionPane.showMessageDialog(null, "Suma de numeros negativos ingresados: " +SumaNeg);
         JOptionPane.showMessageDialog(null, "Promedio de numeros positivos: " +promedioNeg);
         
        
    }
    
    
}
