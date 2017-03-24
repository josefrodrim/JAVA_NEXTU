/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuexcepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class MenuExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            
            int opciones = 0;
            
            do{
                opciones = Integer.parseInt(JOptionPane.showInputDialog(null," \tMenu de Opciones \nOpcion1 \nOpcion2  \nOpcion3 "));
                
                switch(opciones){
                    case 1: JOptionPane.showMessageDialog(null, "Elegiste la opcion 1");
                    break;
                    case 2: JOptionPane.showMessageDialog(null, "Elegiste la opcion 2");
                    break; 
                    case 3: JOptionPane.showMessageDialog(null, "Elegiste la opcion 3");
                    break; 
                }
                
            }while(opciones != 0);
            
        }catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error en el ingreso de datos");
        }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Error en el ingreso de datos el dato no es numerico");
        
        }
    
    
    }
    
}
