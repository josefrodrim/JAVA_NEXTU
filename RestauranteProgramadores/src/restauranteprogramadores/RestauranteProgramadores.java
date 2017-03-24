/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restauranteprogramadores;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class RestauranteProgramadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int iteraciones = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de repeticiones"));
    
    for (int i =0; i< iteraciones; i++){
        JOptionPane.showMessageDialog(null, "Restaurante para Programadores " + i);
    }
    
    }
    
}
