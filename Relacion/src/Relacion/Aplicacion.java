/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relacion;

/**
 *
 * @author YO MERENGUES
 */
public class Aplicacion {
    public static void main (String[] args){
        
        TelefonoMovil miTelefono = new TelefonoMovil();
        
        miTelefono.Encender();
        
        Contacto contacto1 = new Contacto("Nextu");
        miTelefono.agregar(contacto1);
        
        Contacto contacto2 = new Contacto("Nextu2");
        miTelefono.agregar(contacto2);
        
    
    }
}
