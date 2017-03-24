/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesifelse;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class CondicionalesIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int  edad = Integer.parseInt( JOptionPane.showInputDialog(null, "Ingrese edad"));
        
        if(edad>0 &&edad<18){
            JOptionPane.showMessageDialog(null, "Eres Joven");
        }else if(edad>=18 && edad<60){
            JOptionPane.showMessageDialog(null, "Eres Adulto");
        }else{
            JOptionPane.showMessageDialog(null, "eres un adulto mayor");
        }
            
        
    }
    
}
