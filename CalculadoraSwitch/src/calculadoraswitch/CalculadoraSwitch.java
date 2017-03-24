/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class CalculadoraSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo  numero"));
        
        int opcion  = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Opcion 1 Numero Mayor \n 2.Opcion 2 suma de los numeros \n 3.Opcion3 resta de los numero"));
        
        switch(opcion){
            case 1:
                if(a>b){
                    JOptionPane.showMessageDialog(null, "el numero mayor es" + a );
                }else{
                    JOptionPane.showMessageDialog(null, "el numero mayor es" + b );
                }
                break;
            
            case 2:
                
                JOptionPane.showMessageDialog(null, "la suma es " + (a+b) );
                break;
            
            case 3:
                JOptionPane.showMessageDialog(null, "La resta es" + (a-b) );
                break;
        
        
        }
    }
    
}
