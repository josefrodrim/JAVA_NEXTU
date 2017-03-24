/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion = 0;
        
        do{
        
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Mennu de Opciones \n1.Opcion 1 : \n2.Opcion 2 : \n3.Opcion 3: \n0.Salir: "));
        
            switch(opcion){
                case 1:
                    JOptionPane.showMessageDialog(null, "Eligio la opcion 1");break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Eligio la opcion 2");break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Eligio la opcion 3");break;
            }
        
        }while(opcion != 0);
    }
    
}
