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
public class TelefonoMovil {
    
    private Bateria bateria;
    private AplicacionContactos aplicacionDeContactos;
            
            
    
    public TelefonoMovil(){
        this.bateria = new Bateria();
        this.aplicacionDeContactos = new AplicacionContactos();
        
    }
    
    public void agregar(Contacto contacto){
        this.aplicacionDeContactos.AgregarContacto(contacto);

    };
    
    public void Encender(){
        System.out.println("Encender Telefono");
        System.out.println("El porcentaje de la bateria es " + bateria.porcentajeDeBateria() + "%");
    }
    public class Bateria{
            
        public int porcentajeDeBateria(){
        
        return (int) (Math.random() *100);
        }
    
    }
}
