/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarreglo;

import java.util.Scanner;

/**
 *
 * @author YO MERENGUES
 */
public class EjemploArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[3];
        int arreglo2[] = {2,3,4};
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("arreglo2[0]: " + arreglo2[0]);
        System.out.println("arreglo2[1]: " + arreglo2[1]);
        System.out.println("arreglo2[2]: " + arreglo2[2]);
        
        System.out.println("==============");
        
        for (int i=0; i<arreglo2.length; i++){
            System.out.println("arreglo ["+(i+1) + "]" + arreglo2[i]);
            
        }
        System.out.println("=============");
        
        for(int i=0; i<arreglo.length; i++){
            System.out.println("Ingrese un valor del elemento" + i);
            arreglo[i] = teclado.nextInt();
            
        }
        
           System.out.println("==============");
        
        for (int i=0; i<arreglo.length; i++){
            System.out.println("arreglo ["+(i+1) + "]" + arreglo[i]);
            
        }
        
    }
    
}
