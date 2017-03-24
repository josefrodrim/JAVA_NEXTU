/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosingleton;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class Menu {
    
    private static Menu instancia;
    
    private Menu(){};
    
    public static Menu getInstancia(){
        if(instancia==null){
            instancia= new Menu();
        }
        return instancia;
    }
    
    public void Principal(){
        int opcion = 0;
        do{
            opcion= Integer.parseInt(JOptionPane.showInputDialog("==========MENU PRINCIPAL========="+"\n\n1 Sumar.\n2 Restar \n3Restar "));
            
            switch(opcion){
                
                case 1: sumar();
                break;
                case 2: restar();
                break;
                case 3: JOptionPane.showMessageDialog(null, "Fin de la ejecucion");
                break;
                default: JOptionPane.showConfirmDialog(null, "opcion invalida");
            }
            
        }while(opcion!=3);
    }

    private void sumar() {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        
        JOptionPane.showMessageDialog(null, "La suma es: " + (numero1+numero2));
    }

    private void restar() {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        
        JOptionPane.showMessageDialog(null, "La resta es: " + (numero1-numero2));
    }
}