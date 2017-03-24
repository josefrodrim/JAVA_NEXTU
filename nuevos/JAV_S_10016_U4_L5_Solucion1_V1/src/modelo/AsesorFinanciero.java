/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Next University
 */
public class AsesorFinanciero implements IManejador{
    
    private IManejador sucesor;
    
    @Override
    public void peticion(int monto) {
        if (monto >= 300) {
            JOptionPane.showMessageDialog(null, "La peticion a sido atendida por un asesor financiero en la sucursal");
        }else{
            sucesor.peticion(monto);
        }
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
