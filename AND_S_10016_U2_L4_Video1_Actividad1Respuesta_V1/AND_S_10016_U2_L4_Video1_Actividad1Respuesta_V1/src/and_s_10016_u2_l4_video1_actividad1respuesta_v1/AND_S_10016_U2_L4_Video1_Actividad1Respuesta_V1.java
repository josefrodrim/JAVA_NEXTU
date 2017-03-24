/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package and_s_10016_u2_l4_video1_actividad1respuesta_v1;

import javax.swing.JOptionPane;

/**
 *
 * @author Next University
 */
public class AND_S_10016_U2_L4_Video1_Actividad1Respuesta_V1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int veces= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero de iteraciones"));
        
        for (int i = 0; i < veces; i++) {
            JOptionPane.showMessageDialog(null,"Restaurante para programadores "+i);
        }
        
    }
    
    
}
