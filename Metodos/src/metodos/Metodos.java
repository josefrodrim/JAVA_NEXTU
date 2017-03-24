/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import Clases.Rectangulo;

/**
 *
 * @author YO MERENGUES
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo r = new Rectangulo();
        
        System.out.println("El area del rectangulo es: " + r.area());
        System.out.println("El area del Triangulo es: " + (r.area())/2);
    }
    
}
