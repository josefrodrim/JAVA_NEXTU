/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelo.Computadora;

/**
 *
 * @author Next University
 */
public class Actividad3 {
    public static void main(String[] args) {
        
        int opcion = 0;
        LinkedList<Computadora> pila = new LinkedList<>();
        
        do {
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de opciones"
                    + "\n\n1. Agregar.\n2. Eliminar.\n3. Mostrar.\n4. Salir."));
            
            switch (opcion) {
                case 1:
                    agregar(pila);
                    break;
                case 2:
                    eliminar(pila);
                    break;
                case 3:
                    mostrar(pila);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Fin de la ejecución..");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }
        } while (opcion != 4);
        
    }
    
    public static void agregar(LinkedList<Computadora> pila){
        String mac = JOptionPane.showInputDialog("Ingrese numero de mac");
        String proc = JOptionPane.showInputDialog("Ingrese tipo de procesador");
        int ram = Integer.parseInt(JOptionPane.showInputDialog("Ingrese capacidad ram"));
        int discoDuro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño del disco duro"));
        
        pila.addFirst(new Computadora(mac, proc, ram, discoDuro));
        JOptionPane.showMessageDialog(null, "PC agregado con exito");
    }
    
    public static void eliminar(LinkedList<Computadora> pila){
        pila.removeFirst();
        JOptionPane.showMessageDialog(null, "Se ha eliminado el ultimo PC ingresado con exito de la pila.");
    }
    
    public static void mostrar(LinkedList<Computadora> pila){
        String result = "";
        
        for (int i = 0; i < pila.size(); i++) {
            result += pila.get(i).toString();
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
