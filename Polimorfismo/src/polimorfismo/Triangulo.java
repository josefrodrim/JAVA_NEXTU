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
public class Triangulo extends Figura {
    private int base = 2;
    private int altura = 4;
    
   
    public void area(){
        System.out.println("El are de un triangulo es " + (base*altura/2));
    }
}
