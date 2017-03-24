/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcine;

/**
 *
 * @author YO MERENGUES
 */
public class Cine {
    private String telefono;
    private String direccion;

    public Cine() {
        System.out.println("Este es un constructor sencillo");
        this.telefono = "9876744";
        this.direccion = "calle 3";
    }

    public Cine(String direccion) {
        
        System.out.println("Este es un constructor con direccion");
        this.telefono = "2343253";
        this.direccion = direccion;
    }

    public Cine(String telefono, String direccion) {
        System.out.println("Este es un constructor con telefono y direccion");
        this.telefono = telefono;
        this.direccion = direccion;
    }

 
    
    
}
