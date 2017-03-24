/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuoperaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class MenuOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion = 0;
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el primer numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el segundo numero"));
        do{
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"\tMENU \n1. Suma \n 2.Resta \n 0.Salir"));
        
       switch(opcion){
           case 1:
               JOptionPane.showMessageDialog(null, "Suma: "+ (a+b) );break;
           case 2:
               JOptionPane.showMessageDialog(null, "Resta" + (a-b) );break;
               
       }     
        
        }while (opcion!= 0);
    }
    
}
