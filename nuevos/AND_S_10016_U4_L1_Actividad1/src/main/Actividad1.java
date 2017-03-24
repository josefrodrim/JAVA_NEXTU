/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Next University
 */
public class Actividad1 {
    public static void main(String[] args) {
        int arreglo[] = {12, 69, 42, 35, 74, 56, 87, 5, 29, 14};
        
        int max = 0, min = arreglo[0];
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]>max) max = arreglo[i];
            if (arreglo[i]<min) min =arreglo[i];
        }
        JOptionPane.showMessageDialog(null, "Numero mayor: "+max+"\nNumero menor: "+min);
    }
}
