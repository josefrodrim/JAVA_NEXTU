/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author josef
 */
public class HistorialClinico {
    private String codigo;
    private String fecha;
    private String idPaciente;
    private String idMedico;
    private String observaciones;

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public HistorialClinico(String codigo, String fecha, String idPaciente, String idMedico, String observaciones) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.observaciones = observaciones;
    }

   

    public HistorialClinico() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
     
    public void ingresarDatos(ArrayList<HistorialClinico> lista){
        
        codigo = JOptionPane.showInputDialog("Ingrese el codigo: ");
        fecha = JOptionPane.showInputDialog("Ingrese fecha: ");
        idPaciente = JOptionPane.showInputDialog("Ingrese Id del paciente: ");
        idMedico = JOptionPane.showInputDialog("Ingrese id del Medico");
        observaciones = JOptionPane.showInputDialog("Ingrese observaciones: ");
        
        HistorialClinico a = new HistorialClinico(codigo,fecha,idPaciente,idMedico,observaciones);
        lista.add(a);
    }
    
    public void mostrarDatos(ArrayList<HistorialClinico> lista){
        
        String Salida= "";
                       for( int i = 0 ; i  < lista.size(); i++){
                        Salida += "  Numero posicion "+i+" : "+
                        "  codigo: "+ lista.get(i).getCodigo() + 
                        "  fecha: "+lista.get(i).getFecha()+
                        "  Id Paciente: "+lista.get(i).getIdPaciente()+
                        "  Id Medico: " +lista.get(i).getIdMedico()+
                        "  Observaciones" +lista.get(i).getObservaciones()+ "\n\n";
                                
                           
                       }
                        JOptionPane.showMessageDialog(null, Salida); 
        
    }
    
    public void modificarDatos(ArrayList<HistorialClinico> lista){
        String id = JOptionPane.showInputDialog("Ingrese el codigo a buscar");
        int indice=0;
        boolean existencia= false;
        for(int i=0;i<lista.size();i++){
           if(lista.get(i).getCodigo().contains(id)){
               existencia=true;
               JOptionPane.showMessageDialog(null, "codigo encontrado");
               indice = lista.indexOf(lista.get(i));
               lista.get(indice).setCodigo(JOptionPane.showInputDialog("ingrese nuevo codigo"));
               lista.get(indice).setFecha(JOptionPane.showInputDialog("ingrese nuevo fecha"));
               lista.get(indice).setIdPaciente(JOptionPane.showInputDialog("Ingrese nuevo ID paciente"));
               lista.get(indice).setIdMedico(JOptionPane.showInputDialog("Ingrese nuevo ID Medico"));
               lista.get(indice).setObservaciones(JOptionPane.showInputDialog("Ingrese nuevas observaciones"));
               
           }
        }
        
        if(existencia==false){
            JOptionPane.showMessageDialog(null, "codigo no encontrado");
        }
         
        
    }
    
    public void eliminarDatos(ArrayList<HistorialClinico> lista){
        String id = JOptionPane.showInputDialog("Ingrese el codigo a buscar");
        int indice=0;
        boolean existencia= false;
        for(int i=0;i<lista.size();i++){
           if(lista.get(i).getCodigo().contains(id)){
               existencia=true;
               JOptionPane.showMessageDialog(null, "codigo encontrado");
               indice = lista.indexOf(lista.get(i));
              
               lista.remove(indice);
               
           }
        }
        
        if(existencia==false){
            JOptionPane.showMessageDialog(null, "codigo no encontrado");
        }
        
    }
    
    
    
            
}
