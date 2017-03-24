/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ciclos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los ciclos"));
    
        for(int i=0; i<ciclos ;i++){
            
            JOptionPane.showMessageDialog(null,"esta es la iteracion numero " + i );
        }
    }
    
}
