/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoseleccion;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class MetodoSeleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = {3,5,2,7,4,8,9,4};
        seleccion(arreglo);
        
        JOptionPane.showMessageDialog(null, Arrays.toString(arreglo));
    }
    
    private static void seleccion(int arreglo[]){
        for(int i=0;i< arreglo.length ;i++){
            int maximo = i;
            for(int j=i+1;j<arreglo.length;j++){
                
                if(arreglo[j] > arreglo[maximo]){
                    maximo=j;
                }
            }
            
            if(i!= maximo){
                int aux = arreglo[i];
                arreglo[i]= arreglo[maximo];
                arreglo[maximo]= aux;
            }
        }
    }
}
