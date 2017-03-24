/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velocidad;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class Velocidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int velocidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese velocidad en km/H"));
        
        
        if(velocidad>0 && velocidad<=60 ){
            JOptionPane.showMessageDialog(null, "Vas a una velocidad adecuada");
        }else if(velocidad >60 && velocidad <= 80){
            JOptionPane.showMessageDialog(null, "Vas rapido");
        }else if(velocidad>80){
            JOptionPane.showMessageDialog(null, "!Llevas exceso de velocidad");
        }
    }
    
}
