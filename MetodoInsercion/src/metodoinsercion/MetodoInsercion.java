/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoinsercion;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class MetodoInsercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = {9,8,6,7,5,3,4,2,1};
        insercion(arreglo);
        JOptionPane.showMessageDialog(null, Arrays.toString(arreglo));
    }
    
    public static void insercion(int arreglo[]){
        for(int i=1;i<arreglo.length;i++){
            int aux =arreglo[i];
            int j= i-1;
            while(j>=0 && (aux > arreglo[j])){
                arreglo[j+1]=arreglo[j];
                j--;
            }
            arreglo[j+1]=aux;
        }
                
    }
}
