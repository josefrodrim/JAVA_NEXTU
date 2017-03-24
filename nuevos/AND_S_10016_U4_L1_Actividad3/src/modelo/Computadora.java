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
public class Computadora {
    
    private String mac;
    private String procesador;
    private int ram;
    private int tamañoDiscoDuro;

    public Computadora(String mac, String procesador, int ram, int tamañoDiscoDuro) {
        this.mac = mac;
        this.procesador = procesador;
        this.ram = ram;
        this.tamañoDiscoDuro = tamañoDiscoDuro;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getTamañoDiscoDuro() {
        return tamañoDiscoDuro;
    }

    public void setTamañoDiscoDuro(int tamañoDiscoDuro) {
        this.tamañoDiscoDuro = tamañoDiscoDuro;
    }

    @Override
    public String toString() {
        return "Mac: "+mac+"  Procesador: "+procesador+"\nRAM: "+ram+"  Disco duro: "+
                tamañoDiscoDuro+"\n\n";
    }
    
    
}
