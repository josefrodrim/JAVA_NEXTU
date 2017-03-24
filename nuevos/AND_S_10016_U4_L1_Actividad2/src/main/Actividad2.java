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
public class Actividad2 {
    public static void main(String[] args) {
        int n = 2, m = 3;
        
        int matriz[][] = new int[n][m];
        int matriz1[][] = new int[n][m];
        int matriz2[][] = new int[n][m];
        
        llenarMatriz(matriz);
        llenarMatriz(matriz1);
        matriz2 = sumarMatriz(matriz, matriz1);
        
        JOptionPane.showMessageDialog(null, imprimirMatriz(matriz)+"+\n"+imprimirMatriz(matriz1)+
                "=\n"+imprimirMatriz(matriz2));
        
    }
    
    private static void llenarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor["+i+"]["+j+"]"));
            }
        }
        JOptionPane.showMessageDialog(null, "Matriz registrada con exito!");
    }
    
    private static int[][] sumarMatriz(int matriz1[][], int matriz2[][]){
        int resultado[][] = new int[matriz1.length][matriz1[0].length];
        
        if (matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length) {
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Los tamaños de las matrices no concuerdan");
        }
        
        return resultado;
    }
    
    private static String imprimirMatriz(int matriz[][]){
        String result="";
        for (int i = 0; i < matriz.length; i++) {
                result += Arrays.toString(matriz[i])+"\n";
        }
        return result;
    }
}
