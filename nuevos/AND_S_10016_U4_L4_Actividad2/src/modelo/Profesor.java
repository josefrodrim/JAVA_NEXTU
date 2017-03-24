/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Next University
 */
public class Profesor {
    
    private String id;
    private String nombre;
    private ArrayList<String> asignaturas;

    public Profesor(String id, String nombre, ArrayList<String> asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<String> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        
        String result = "";
        for (String asignatura : asignaturas) {
            result += " - "+asignatura;
        }
        
        return "Identificacion: "+id+"\nNombre: "+nombre+"\n"+result+"\n\n";
    }
    
    
    
}
