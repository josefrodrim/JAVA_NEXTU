/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package and_s_10016_u2_l3_video1_actividad1_v1;

import javax.swing.JOptionPane;

/**
 *
 * @author Next University
 */
public class AND_S_10016_U2_L3_Video1_Actividad1_V1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int velocidad= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la velocidad"));
        
        if(velocidad>0 && velocidad<=60){
                JOptionPane.showMessageDialog(null,"Vas a una velocidad adecuada");
        }else if (velocidad>60 && velocidad<=80){
                JOptionPane.showMessageDialog(null,"Vas rapido");
        } else {
                JOptionPane.showMessageDialog(null,"¡Vas con exceso de velocidad!");
        }      
    }
    
}
