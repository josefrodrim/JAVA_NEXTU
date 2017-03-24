/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YO MERENGUES
 */
public class AplicacionContactos {
    private List<Contacto> contactos;
    
    public AplicacionContactos(){
        this.contactos = new ArrayList<>();
    }
    
    public void AgregarContacto(Contacto contacto){
        System.out.println("Se ha gregado un contacto");
        this.contactos.add(contacto);
    }
}
