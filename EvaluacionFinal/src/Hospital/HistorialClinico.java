/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class HistorialClinico {
    
    private String codigo;
    private String fecha;
    private String idPaciente;
    private String idMedico;
    private String observaciones;

    public HistorialClinico(String codigo, String fecha, String idPaciente, String idMedico, String Observaciones) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.observaciones = Observaciones;
    }

    public HistorialClinico() {
        
        codigo = JOptionPane.showInputDialog("Ingrese codigo de Historial Clinico: ");
        fecha = JOptionPane.showInputDialog("Ingrese fecha  de Historial Clinico: ");
        idPaciente = JOptionPane.showInputDialog("Ingrese id del paciente para  el Historial Clinico: ");
        idMedico = JOptionPane.showInputDialog("Ingrese id del medico para  el Historial Clinico: ");
        observaciones = JOptionPane.showInputDialog("Ingrese observaciones del paciente para  el Historial Clinico: ");
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

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
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

    public void setobservaciones(String Observaciones) {
        this.observaciones = Observaciones;
    }
    
    
    
}
