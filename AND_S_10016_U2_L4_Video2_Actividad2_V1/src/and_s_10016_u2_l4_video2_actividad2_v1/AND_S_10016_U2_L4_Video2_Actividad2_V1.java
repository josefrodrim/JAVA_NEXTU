/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package and_s_10016_u2_l4_video2_actividad2_v1;

import javax.swing.JOptionPane;

/**
 *
 * @author Next University
 */
public class AND_S_10016_U2_L4_Video2_Actividad2_V1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int numero1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el primer numero"));
            int numero2= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el segundo numero"));
       int opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Menu de opciones\n1.Sumar 1\n2.Restar \n0. Salir"));
            switch(opcion){
                case 1:
                    JOptionPane.showMessageDialog(null,"La suma es "+(numero1+numero2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"La resta es "+(numero1-numero2));
                    break;
               
            }
            
    }
    
}
