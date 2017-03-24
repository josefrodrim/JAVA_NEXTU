/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appejemplo;

/**
 *
 * @author YO MERENGUES
 */
public class Cine {
    private String direccion;
    private String id;

    public Cine() {
        this.direccion = "calle2";
        this.id = "123";
    }
    
    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }
    
    
}
