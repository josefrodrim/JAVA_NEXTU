/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author YO MERENGUES
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figura figura = new Figura();
        figura.posicion();
        figura.area();
        
        Figura figura1 = new Triangulo();
        Figura figura2 = new Cuadrado();
        
        figura1.area();
        figura2.area();
    }
    
}
