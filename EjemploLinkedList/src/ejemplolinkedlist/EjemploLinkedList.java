/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolinkedlist;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelo.Persona;

/**
 *
 * @author YO MERENGUES
 */
public class EjemploLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedList<Persona> lista = new LinkedList<>();
       
       lista.add(new Persona("1","Juan"));
       lista.add(new Persona("2","Pedro"));
       lista.add(new Persona("3","Luis"));
       
       JOptionPane.showMessageDialog(null,ImprimirLista(lista));
       
       lista.addFirst(new Persona("4","jorge"));
       
        JOptionPane.showMessageDialog(null,ImprimirLista(lista));
        
        lista.addLast(new Persona("5","josef"));
        
        JOptionPane.showMessageDialog(null,ImprimirLista(lista));
        
        
      
    }
    
    private static String ImprimirLista(LinkedList<Persona> lista){
         String result = "";
        for(int i =0;i<lista.size();i++){
           result += lista.get(i).toString();
            
        }
        return result;
    }
    
}
