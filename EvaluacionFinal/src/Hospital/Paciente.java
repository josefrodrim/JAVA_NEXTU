/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import Persona.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class Paciente extends Persona{
   
   private String id;
   
   
   

    public Paciente(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

  

    public Paciente() {
         
        
       
        
    }
    
     public  String imprimirLista(ArrayList<Paciente> lista){
        String result = "";
        
        for(int i=0;i<lista.size(); i++){
            result += lista.get(i).toString();
        }
        
        return result;
    }
   
   
    public void MostrarDatos(ArrayList<Paciente> lista){
        
        
        String result="Lista de Pacientes\n\n";
        for (int i = 0; i < lista.size(); i++) {
           result += "ID :"+lista.get(i) + "Nombre :"+ lista.get(i).nombre  + "Apellidos: " +lista.get(i).apellidos+
                       "Edad: " + lista.get(i).edad+ "Genero: " +lista.get(i).genero;
                    
                    //"Nombre: "+lista.get(i).getNombre()+"  direccion: "+lista.get(i).getDireccion()+
                    //"  Numero de pisos: "+lista.get(i).getNumeroPisos()+"\n";
        //}
        
        JOptionPane.showMessageDialog(null, result);
        
    }
    }
    
    public void IngresarDatos(ArrayList<Paciente> lista){
        
        id = JOptionPane.showInputDialog("Ingrese la identificacion del paciente: ");
        nombre = JOptionPane.showInputDialog("Ingrese nombre del paciente");
        apellidos = JOptionPane.showInputDialog("Ingrese apellidos del paciente");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad del paciente"));
        genero = JOptionPane.showInputDialog("Ingrese genero del paciente");
        
        Paciente e = new Paciente();
        lista.add(e);
        
        
    }
    
   
   
}
