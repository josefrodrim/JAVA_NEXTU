/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativaswhile;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class IterativasWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;
        
        while(a<5){
            JOptionPane.showMessageDialog(null, "esta es la iteracion:  " + a);
        if(a==4){
            JOptionPane.showMessageDialog(null, "Fin del while");
        }
        a++;
        }
    }
    
}
