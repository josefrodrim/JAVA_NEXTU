/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arreglo[] = {2,3,4,6,8,10,12,14,16,18,20};
        
        int dato = Integer.parseInt(JOptionPane.showInputDialog(null,  "Ingrese el dato a buscar"));
        int busqueda = busquedaBinaria(arreglo,dato);
        
        if(busqueda!=-1){
               JOptionPane.showMessageDialog(null, "el dato ha sido encontrado en la p[osicion  " + busqueda);
        }else{
                JOptionPane.showMessageDialog(null, "el dato no ha sido encontrado   " );
        }
        
    }
    
    
    private static int busquedaBinaria(int arreglo[], int dato){
        int centro, inferior = 0, superior = arreglo.length-1;
        
        while(inferior <= superior){
            centro  = (superior + inferior)/2;
            if(arreglo[centro] ==dato){
                return centro;
            }else if(dato < arreglo[centro]){
            
                superior = centro-1;
            }else{
                inferior = centro+1;
            }
        }
        return -1;
    }
}
