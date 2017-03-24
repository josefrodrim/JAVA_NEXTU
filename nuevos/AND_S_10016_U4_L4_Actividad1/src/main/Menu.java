/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Next University
 */
public class Menu {
    private static Menu instance;

    private Menu() {
        
    }
    
    public static Menu getInstance(){
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }
    
    public void Principal(){
        int opcion = 0;
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***** Menu principal *****"
                    + "\n\n1.Sumar.\n2.Restar.\n3.Multiplicar.\n4.Dividir.\n5.Salir."));
            
            switch (opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Fin de la ejecucion...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }
        } while (opcion != 5);
        
    }

    private void sumar() {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+(numero1 + numero2));
    }

    private void restar() {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+(numero1 - numero2));
    }

    private void multiplicar() {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: "+(numero1 * numero2));
    }

    private void dividir() {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        JOptionPane.showMessageDialog(null, "El resultado de la division es: "+(numero1 / numero2));
    }
}
