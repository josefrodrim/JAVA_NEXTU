/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseanidado;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class IfElseAnidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresxe el primer numero"));
       
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresxe el segundo numero"));
        
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresxe el tercer numero"));
    
        
        if(a>b){
            if(a>c){
                JOptionPane.showMessageDialog(null, "El primer numero es el amoyor");
            }
        }else if(b>a){
                if(b>c){
                    JOptionPane.showMessageDialog(null, "el segundo numero es el mayoe");
                    
                }else{
                    JOptionPane.showMessageDialog(null, "el terecer numero es el mayor");
                }
            }
    
    }
    
}
