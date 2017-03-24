/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package and_s_10016_u2_l4_video2_actividad1respuesta_v1;

import javax.swing.JOptionPane;

/**
 *
 * @author Next University
 */
public class AND_S_10016_U2_L4_Video2_Actividad1Respuesta_V1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Lectura de los numero
        int numero1= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el primer numero"));
        int numero2= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el segundo numero"));
        
        while(numero1<=numero2){
            JOptionPane.showMessageDialog(null,"Numero1 "+numero1);
            numero1++;
        
        }
        
    }
    
}
