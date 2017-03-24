/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codificacionwhile;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class CodificacionWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
        
        while(a<=b){
            if(a==b){
                JOptionPane.showMessageDialog(null, "el numero es " + a);
            }
            a++;
        }
    }
    
}
