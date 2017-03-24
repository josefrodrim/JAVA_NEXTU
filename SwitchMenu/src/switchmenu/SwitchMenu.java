/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchmenu;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class SwitchMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, " menu de Opciones \n1.Opcion  1 \n2. Opcion2 \n3.Opcion 3  "));
    
        switch(opcion){
         
            case 1:
                JOptionPane.showMessageDialog(null, "Seleccionaste la opocion 1"); break;
            case 2:
                JOptionPane.showMessageDialog(null, "Seleccionaste la opocion 2"); break;
            case 3:
                JOptionPane.showMessageDialog(null, "Seleccionaste la opocion 3");break;
            default:
                
                JOptionPane.showMessageDialog(null, "Esa opcion no es valida"); break;
        
            
        }
    
    }
    
}
