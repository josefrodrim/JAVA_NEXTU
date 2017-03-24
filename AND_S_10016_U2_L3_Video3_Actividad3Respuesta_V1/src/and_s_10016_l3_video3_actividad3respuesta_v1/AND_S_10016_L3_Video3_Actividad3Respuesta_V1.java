/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package and_s_10016_l3_video3_actividad3respuesta_v1;

import javax.swing.JOptionPane;

/**
 *
 * @author Next University
 */
public class AND_S_10016_L3_Video3_Actividad3Respuesta_V1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el primer numero"));
        int b=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el segunda numero"));
        
        int opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1. Mostrar mayor\n2.Mostrar suma\n3.Mostrar la resta"));
        switch(opc){
            case 1:
                if(a>b){
                    JOptionPane.showMessageDialog(null,"El "+a+" Es mayor");
                }else{
                     JOptionPane.showMessageDialog(null,"El "+b+" Es mayor");
                }                
                break;
            case 2:
                     JOptionPane.showMessageDialog(null,"La suma es "+(a+b));
                break;
            case 3:
                     JOptionPane.showMessageDialog(null,"La resta es "+(a-b));
                break;
                
                    
        
        
        }
    
    }
    
}
