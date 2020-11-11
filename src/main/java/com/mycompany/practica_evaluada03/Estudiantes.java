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
public class Estudiantes {
    
    public Estudiantes(){}
    
    private int arregloNotas[][];
    
    public int[][] getArregloNotas() {
        return arregloNotas;
    }

    public void setArregloNotas(int[][] arregloNotas) {
        this.arregloNotas = arregloNotas;
    }

    public Estudiantes(int[][] arregloNotas) {
        this.arregloNotas = arregloNotas;
    }


    public void rellenar (int listaN[][]){
        for(int e=0;e<listaN.length;e++){
            for(int n=0; n<listaN[e].length;n++){
                listaN[e][n]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"+n+"del estudiante "+e));
                
            }
        }   
    }
    public void mostrarN(int lista[][]){
        for(int e=0;e<lista.length;e++){
            for(int n=0;n<lista[e].length;n++){
                JOptionPane.showMessageDialog(null, "las notas del estudiante "+e+" son: "+lista[e][n]);
            }
        }
        
    }
    public void promedio(int lista[][]){
        
        for(int e=0;e<lista.length;e++){
            int sumaprom=0;
            for(int n=0;n<lista[e].length;n++){
                sumaprom=(lista[e][0]+lista[e][1]+lista[e][2]+lista[e][3]+lista[e][4]);
                //hace la suma de las notas
            }
            double totalProm=((sumaprom/3));
            JOptionPane.showMessageDialog(null, "promedio del estudiante "+e+ "es: "+ totalProm);
        }
    }
}
