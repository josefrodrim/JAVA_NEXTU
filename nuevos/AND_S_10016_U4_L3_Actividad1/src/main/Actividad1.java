/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Next University
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño del arreglo"));

        int arreglo[] = new int[n];

        for (int i = 0; i < n; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor del elemento " + i));
        }

        String result = "Arreglo desordenado\n" + Arrays.toString(arreglo);
        burbuja(arreglo,true);
        result += "\n\nArreglo ordenado ascendentemente\n" + Arrays.toString(arreglo);
        burbuja(arreglo, false);
        result += "\n\nArreglo ordenado descendentemente\n" + Arrays.toString(arreglo);
        JOptionPane.showMessageDialog(null, result);

    }

    private static void burbuja(int arreglo[], boolean orden) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (orden) {
                    if (arreglo[i] > arreglo[j]) {
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                } else { 
                    if (arreglo[i] < arreglo[j]) {
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }    

            }
        }
    }
}
