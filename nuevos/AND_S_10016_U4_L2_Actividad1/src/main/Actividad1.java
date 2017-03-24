/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Persona;

/**
 *
 * @author Next University
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();

        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***** Menu de opciones *****"
                    + "\n1.Agregar.\n2.Consultar.\n3.Mostrar.\n4.Salir"));

            switch (opcion) {
                case 1:
                    agregar(personas);
                    break;
                case 2:
                    consultar(personas);
                    break;
                case 3:
                    mostrar(personas);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Fin de la ejecucion..");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida..");
            }
        } while (opcion != 4);

    }

    private static void agregar(ArrayList<Persona> lista) {
        String id = JOptionPane.showInputDialog("Ingrese identificacion");
        String nombre = JOptionPane.showInputDialog("Ingrese nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
        lista.add(new Persona(id, nombre, edad));
        JOptionPane.showMessageDialog(null, "Persona agregada con exito!");
    }

    private static boolean consultar(ArrayList<Persona> lista) {
        String id = JOptionPane.showInputDialog("Ingrese identificacion de la persona a consultar");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equals(id)) {
                JOptionPane.showMessageDialog(null,"Persona encontrada!"
                        + "\nIdentificacion: "+lista.get(i).getId()+
                        "\nNombre: "+lista.get(i).getNombre()+"\nEdad: "+ lista.get(i).getEdad());
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Persona no encontrada");
        return false;
    }

    private static void mostrar(ArrayList<Persona> personas) {
        String result = "";
        for (int i = 0; i < personas.size(); i++) {
            result += personas.get(i).toString();
        }
        JOptionPane.showMessageDialog(null, result);
    }
    
    
}
