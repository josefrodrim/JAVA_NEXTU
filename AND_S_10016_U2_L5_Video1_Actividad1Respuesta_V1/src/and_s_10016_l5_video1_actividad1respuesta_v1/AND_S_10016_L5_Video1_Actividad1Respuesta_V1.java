/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package and_s_10016_l5_video1_actividad1respuesta_v1;

import javax.swing.JOptionPane;

/**
 *
 * @author Next University
 */
public class AND_S_10016_L5_Video1_Actividad1Respuesta_V1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i < 5; i++) {
            try {
                int e=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error al ingresar los datos");
            }
            
           
            
            
            
        }
    }
    
}
