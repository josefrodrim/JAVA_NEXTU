/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacionmenu;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class ValidacionMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese primero numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese segundo numero"));
        int opcion = 0; 
      
        try {
            
         do{
         
         opcion = Integer.parseInt( JOptionPane.showInputDialog(null,"\t MENU \n1 Sumar \n2 Restar \n0 Salir "));
             
         switch(opcion){
             case 1: JOptionPane.showMessageDialog(null, "la suma es" + (a+b)); break;
             case 2: JOptionPane.showMessageDialog(null, "la resta es" + (a-b)); break;
         }
         
         }while(opcion!=0);   
            
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "error de null");
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "error de formato");
        }

    }
    
}
