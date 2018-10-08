/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;
import javax.swing.JOptionPane;

/**
 *
 * @author SOPORTE
 */
public class FuncionesEjercicio03 {
 
    /* 3. Un alumno cursa durante el semestre las siguientes materias:
    Fisica, Quimica, Algebra y Programacion, de las cuales se conoce de cada
    materia la calificacion obtenida en 3 examenes  parciales. 
    Determine como obtener el promedio total en el semestre del alumno*/
    
    Double notasQuimica[], sumaNotasQuimica, promedioQuimica, notasFisica[], sumaNotasFisica, promedioFisica, notasAlgebra[], sumaNotasAlgebra, promedioAlgebra, 
            notasProgramacion[], sumaNotasProgramacion, promedioProgramacion, sumaMaterias, promedioMaterias;
    
    public void quimica() {
        
        sumaNotasQuimica = 0.0;
        
        notasQuimica = new Double[3];
        JOptionPane.showMessageDialog(null, "Notas de Quimica");
        
        for (int i = 0; i < notasQuimica.length; i++) {
            notasQuimica[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota de Quimica #" +i));
            sumaNotasQuimica = sumaNotasQuimica + notasQuimica[i];
        }
    }
    
    public void fisica() {
        
        sumaNotasFisica = 0.0;
        
        notasFisica = new Double[3];
        JOptionPane.showMessageDialog(null, "Notas de Fisica");
        
        for (int i = 0; i < notasFisica.length; i++) {
            notasFisica[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota de Fisica #" +i));
            sumaNotasFisica = sumaNotasFisica + notasFisica[i];
        }
    }
    
    public void algebra() {
        
        sumaNotasAlgebra = 0.0;
        
        notasAlgebra = new Double[3];
        JOptionPane.showMessageDialog(null, "Notas de Algebra");
        
        for (int i = 0; i < notasAlgebra.length; i++) {
            notasAlgebra[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota de Algebra #" +i));
            sumaNotasAlgebra = sumaNotasAlgebra + notasAlgebra[i];
        }
    }
    
    public void programacion() {
        
        sumaNotasProgramacion = 0.0;
        
        notasProgramacion = new Double[3];
        JOptionPane.showMessageDialog(null, "Notas de Programacion");
        
        for (int i = 0; i < notasProgramacion.length; i++) {
            notasProgramacion[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota de Programacion #" +i));
            sumaNotasProgramacion = sumaNotasProgramacion + notasProgramacion[i];
        }
    }
    
    public void promedios() {
        
        promedioQuimica = sumaNotasQuimica / 3;
        promedioFisica = sumaNotasFisica / 3;
        promedioAlgebra = sumaNotasAlgebra / 3;
        promedioProgramacion = sumaNotasProgramacion / 3;
        
        sumaMaterias = promedioQuimica + promedioFisica + promedioAlgebra + promedioProgramacion;
        promedioMaterias = sumaMaterias / 4;
    }
    
    public void comunicados() {
        
        JOptionPane.showMessageDialog(null, "Promedios!");
        JOptionPane.showMessageDialog(null, "Quimica: " +promedioQuimica+ "\n"
        + "Fisica: " +promedioFisica+ "\n"
        + "Algebra: " +promedioAlgebra+ "\n"
        + "Programacion: " +promedioProgramacion+ "\n"
        + "\n"
        + "Suma de todas las materias (promedios): " +sumaMaterias+ "\n"
        + "Promedio final: " +promedioMaterias);
    }   
    
    public static void main(String[] args) {
        
        FuncionesEjercicio03 calificaciones = new FuncionesEjercicio03();
        
        calificaciones.quimica();
        calificaciones.fisica();
        calificaciones.algebra();
        calificaciones.programacion();
        calificaciones.promedios();
        calificaciones.comunicados();
    }
}
