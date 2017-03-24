/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Next University
 */
public class Banco implements IManejador{
    
    private IManejador sucesor;
    
    @Override
    public void peticion(int monto) {
        CajeroAutomatico cajeroA = new CajeroAutomatico();
        setSucesor(cajeroA);
        
        Cajero cajero = new Cajero();
        cajeroA.setSucesor(cajero);
        
        AsesorFinanciero asesor = new AsesorFinanciero();
        cajero.setSucesor(asesor);
        
        sucesor.peticion(monto);
    }

    @Override
    public IManejador getSucesor() {
       return sucesor;
    }

    @Override
    public void setSucesor(IManejador sucesor) {
        this.sucesor = sucesor;
    }
}
