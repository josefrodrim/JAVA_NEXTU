/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import examenfinal.persona.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author josef
 */
public class Medico extends Persona{

   private String idMedico;

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
   private String especialidad;

    public Medico(String idMedico, String especialidad) {
        this.idMedico = idMedico;
        this.especialidad = especialidad;
    }

    public Medico(String idMedico,String nombre,String apellido,String especialidad){
           
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }
    public Medico() {
    }

    
  
    public void ingresarDatos(ArrayList<Medico> lista){
        
        idMedico = JOptionPane.showInputDialog("Ingrese el Id del Medico: ");
        nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
        apellido = JOptionPane.showInputDialog("Ingrese apellidos: ");
        especialidad = JOptionPane.showInputDialog("Ingrese especialidad: ");
        
        Medico a = new Medico(idMedico,nombre,apellido,especialidad);
        
        lista.add(a);
    }
    
    public void mostrarDatos(ArrayList<Medico> lista){
        
        String Salida= "";
                       
        for( int i = 0 ; i  < lista.size(); i++){
                        Salida += "  Numero posicion "+i+" : "+
                        "  idMedico: "+ lista.get(i).getIdMedico() + 
                        "  Nombre: "+lista.get(i).getNombre()+
                        "  apellido: "+lista.get(i).getApellido()+                       
                        "  especialidad:" +lista.get(i).getEspecialidad()+ 
                        "\n\n";
                                
                           
                       }
                        
                       JOptionPane.showMessageDialog(null, Salida); 
        
    }
    
    public void modificarDatos(ArrayList<Medico> lista){
        String id = JOptionPane.showInputDialog("Ingrese el id a buscar");
        int indice=0;
        boolean existencia= false;
        for(int i=0;i<lista.size();i++){
           if(lista.get(i).getIdMedico().contains(id)){
               existencia=true;
               JOptionPane.showMessageDialog(null, "ID encontrado");
               indice = lista.indexOf(lista.get(i));
               lista.get(indice).setIdMedico(JOptionPane.showInputDialog("ingrese nuevo ID"));
               lista.get(indice).setNombre(JOptionPane.showInputDialog("ingrese nuevo Nombre"));
               lista.get(indice).setApellido(JOptionPane.showInputDialog("Ingrese nuevo apellido"));
               lista.get(indice).setEspecialidad(JOptionPane.showInputDialog("Ingrese nueva especialidad"));
               
           }
        }
        
        if(existencia==false){
            JOptionPane.showMessageDialog(null, "Id no encontrado");
        }
         
        
    }
    
    public void eliminarDatos(ArrayList<Medico> lista){
        String id = JOptionPane.showInputDialog("Ingrese el id a buscar");
        int indice=0;
        boolean existencia= false;
        for(int i=0;i<lista.size();i++){
           if(lista.get(i).getIdMedico().contains(id)){
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
