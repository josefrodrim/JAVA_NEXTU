/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salidasporventana;
import javax.swing.JOptionPane;
/**
 *
 * @author YO MERENGUES
 */
public class SalidasPorVentana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String  palabra = JOptionPane.showInputDialog(null, "Ingrese una palabra");
       JOptionPane.showMessageDialog(null,"la  palabra ingresada es " + palabra );
       
    }
    
}
