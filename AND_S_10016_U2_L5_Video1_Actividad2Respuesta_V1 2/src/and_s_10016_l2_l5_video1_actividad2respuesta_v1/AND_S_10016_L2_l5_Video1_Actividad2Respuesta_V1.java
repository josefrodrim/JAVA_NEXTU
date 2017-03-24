/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package and_s_10016_l2_l5_video1_actividad2respuesta_v1;

import javax.swing.JOptionPane;

/**
 *
 * @author Next University
 */
public class AND_S_10016_L2_l5_Video1_Actividad2Respuesta_V1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        try {
            int opcion;
            
            int numero1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el primer numero")); 
            int numero2= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el segundo numero"));
            do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Menu de opciones\n1.Sumar 1\n2.Restar \n0. Salir"));
           
             switch(opcion){
                case 1:
                    JOptionPane.showMessageDialog(null,"La suma es "+(numero1+numero2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"La resta es "+(numero1-numero2));
                    break;
               
            }
            }while(opcion!=0);
        
        } catch (NullPointerException e) {
           JOptionPane.showMessageDialog(null,"Error, no se ingreso nada");
        }catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(null,"Error, no se ingreso un numero");
        }
 
        
        
       
       
      
      
            
    }
    
}
