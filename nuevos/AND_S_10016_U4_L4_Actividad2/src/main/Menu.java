/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Profesor;

/**
 *
 * @author Next University
 */
public class Menu {
    
    private static Menu instance;
    private ArrayList<Profesor> profesores;

    private Menu() {
        profesores = new ArrayList<>();
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
                    + "\n\n1.Agregar profesor.\n2.Mostrar lista.\n3.Salir."));
            
            switch (opcion) {
                case 1:
                    agregar();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Fin de la ejecucion...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }
        } while (opcion != 3);
        
    }

    private void agregar() {
        String id = JOptionPane.showInputDialog("Ingrese identificacion del profesor");
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del profesor");
        ArrayList<String> asignaturas = new ArrayList<>();
        do {
            asignaturas.add(JOptionPane.showInputDialog("Ingrese nombre de la asignatura"));     
        } while (JOptionPane.showConfirmDialog(null, "¿Desea continuar?") == 0);
        profesores.add(new Profesor(id, nombre, asignaturas));
        JOptionPane.showMessageDialog(null, "Profesor agregado con exito!");
    }

    private void mostrar() {
        String result = "";
        for (Profesor profesor : profesores) {
            result += profesor.toString();
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
