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
public abstract  class InstrumentoMusical {
    
    public void detener(){
        System.out.println("Deteniendo");
      }
    
    public abstract void tocar();
}
