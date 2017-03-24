/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Edificio;

/**
 *
 * @author Next University
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();
        int opcion = 0;
        do {
            agregar(edificios);
            ordenar(edificios);
            mostrar(edificios);
            opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
        } while (opcion == 0);
        JOptionPane.showMessageDialog(null, "Fin de la ejecucion...");
        
    }
    
    private static void agregar(ArrayList<Edificio> lista){
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del edificio");
        String direccion = JOptionPane.showInputDialog("Ingrese direccion del edificio");
        int nPisos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de pisos del edificio"));
        Edificio e = new Edificio(nombre, direccion, nPisos);
        lista.add(e);
    }
    
    private static void mostrar(ArrayList<Edificio> lista){
        String result="Lista de estudiantes\n\n";
        for (int i = 0; i < lista.size(); i++) {
            result += "Nombre: "+lista.get(i).getNombre()+"  direccion: "+lista.get(i).getDireccion()+
                    "  Numero de pisos: "+lista.get(i).getNumeroPisos()+"\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }
    
    private static void ordenar(ArrayList<Edificio> lista) {
        for (int i = 1; i < lista.size(); i++) { 
            Edificio aux = lista.get(i); 
            int j = i - 1; 
            while ((j >= 0) && (aux.getNumeroPisos() > lista.get(j).getNumeroPisos())) { 
                lista.set(j+1, lista.get(j));
                j--;
            }
            lista.set(j+1, aux);
        }
    }
}
