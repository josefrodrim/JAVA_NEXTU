/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;
import modelo.Banco;

/**
 *
 * @author Next University
 */
public class Actividad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a retirar"));
        Banco banco = new Banco();
        banco.peticion(monto);
    }
    
}
