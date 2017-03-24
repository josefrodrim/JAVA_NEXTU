/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class Validacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
            
          for(int i =0; i<5 ;i++){
              
          
              try {
                  int  palabra = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la palabra " + i )); 
              } catch (Exception e) {
                  JOptionPane.showMessageDialog(null, "Es un Dato no valido");
              }
          
          }  
            
            
        
    }
    
}
