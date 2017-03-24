/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edadtalla;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class EdadTalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int edad =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        
        double talla = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su talla"));
    
        if(talla > 2.00 && edad > 18 ){
            JOptionPane.showMessageDialog(null, "Usted puede jugar baloncesto voleybol y futbol");
        }else if(talla > 2.00 && edad < 18){
            JOptionPane.showMessageDialog(null, "Usted puede jugar voleibol y futbol");                
        }else if(talla>2.00 && edad<18){
            JOptionPane.showMessageDialog(null, "Usted piuede jugar voleibol y futbol ");
        }else{
            JOptionPane.showMessageDialog(null, "Usted no puede jugar xd ");
        }
    
    }
    
}
