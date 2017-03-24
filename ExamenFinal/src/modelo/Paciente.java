/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import examenfinal.persona.Persona;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author josef
 */
public class Paciente extends Persona{

   private String idPaciente;

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    
   public Paciente(){
   
   }
   

    public Paciente(String idPaciente, String nombre, String apellido, int edad, String genero) {
        super(nombre, apellido, edad, genero);
        this.idPaciente = idPaciente;
    }
   
    
    public void ingresarDatos(ArrayList<Paciente> lista){
        
        idPaciente = JOptionPane.showInputDialog("Ingrese el Id del paciente: ");
        nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
        apellido = JOptionPane.showInputDialog("Ingrese apellidos: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
        genero = JOptionPane.showInputDialog("Ingrese genero: ");
        
        Paciente a = new Paciente(idPaciente,nombre,apellido,edad,genero);
        lista.add(a);
    }
    
    public void mostrarDatos(ArrayList<Paciente> lista){
        
        String Salida= "";
                       for( int i = 0 ; i  < lista.size(); i++){
                        Salida += "  Numero posicion "+i+" : "+
                        "  idPaciente: "+ lista.get(i).getIdPaciente() + 
                        "  Nombre: "+lista.get(i).getNombre()+
                        "  apellido: "+lista.get(i).getApellido()+
                        "  edad: " +lista.get(i).getEdad()+
                        "  genero" +lista.get(i).getGenero()+ "\n\n";
                                
                           
                       }
                        JOptionPane.showMessageDialog(null, Salida); 
        
    }
    
    public void modificarDatos(ArrayList<Paciente> lista){
        String id = JOptionPane.showInputDialog("Ingrese el id a buscar");
        int indice=0;
        boolean existencia= false;
        for(int i=0;i<lista.size();i++){
           if(lista.get(i).getIdPaciente().contains(id)){
               existencia=true;
               JOptionPane.showMessageDialog(null, "ID encontrado");
               indice = lista.indexOf(lista.get(i));
               lista.get(indice).setIdPaciente(JOptionPane.showInputDialog("ingrese nuevo ID"));
               lista.get(indice).setNombre(JOptionPane.showInputDialog("ingrese nuevo Nombre"));
               lista.get(indice).setApellido(JOptionPane.showInputDialog("Ingrese nuevo apellido"));
               lista.get(indice).setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva edad")));
               lista.get(indice).setGenero(JOptionPane.showInputDialog("Ingrese nuevo genero"));
               
           }
        }
        
        if(existencia==false){
            JOptionPane.showMessageDialog(null, "Id no encontrado");
        }
         
        
    }
    
    public void eliminarDatos(ArrayList<Paciente> lista){
        String id = JOptionPane.showInputDialog("Ingrese el id a buscar");
        int indice=0;
        boolean existencia= false;
        for(int i=0;i<lista.size();i++){
           if(lista.get(i).getIdPaciente().contains(id)){
               existencia=true;
               JOptionPane.showMessageDialog(null, "ID encontrado");
               indice = lista.indexOf(lista.get(i));
              
               lista.remove(indice);
               
           }
        }
        
        if(existencia==false){
            JOptionPane.showMessageDialog(null, "Id no encontrado");
        }
        
    }
}
