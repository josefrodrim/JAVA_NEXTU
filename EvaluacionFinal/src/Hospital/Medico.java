/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import Persona.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class Medico extends Persona{
     private String id;
     private String especialidad;

    public Medico() {
        System.out.println("Este es un nuevo Medico");
       
       id = JOptionPane.showInputDialog("Ingrese la identificacion del Medico: ");
       nombre = JOptionPane.showInputDialog("Ingrese nombre del Medico");
       apellidos = JOptionPane.showInputDialog("Ingrese apellidos del Medico");
       especialidad = JOptionPane.showInputDialog("Ingrese especialidad del medico");
    }

    

    
     
     
}
