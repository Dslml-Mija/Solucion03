/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_evaluada03;

import javax.swing.JOptionPane;

/**
 *
 * @author mija2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int nEstudiates [][]=new int [5][5];//inicializa la cantidad de estudiantes y las notas
       
       Estudiantes notasEstu=new Estudiantes();
       
       //llama el metodo de la clase estudiantes rellenar
       notasEstu.rellenar(nEstudiates);
       //guarda la innformacion en la classe estudiantes
       notasEstu.setArregloNotas(nEstudiates);
       
       Estudiantes mostrar=new Estudiantes();
       //con el get extraemos la informacion de arreglo notas
       mostrar.getArregloNotas();
       mostrar.mostrarN(nEstudiates);
       
       Estudiantes promedio=new Estudiantes();
       //llama la ejecuciondel promedio de cada estudiante
       promedio.getArregloNotas();
       promedio.promedio(nEstudiates);
      
    }
    
}
