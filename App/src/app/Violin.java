/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author YO MERENGUES
 */
public class Violin extends  InstrumentoMusical implements InstrumentoAfinado{

    @Override
    public void tocar() {
        System.out.println("tocando violin");
    }

    @Override
    public void afinar() {
        System.out.println("afinando violin");
    }
    
}
