/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

/**
 *
 * @author YO MERENGUES
 */
public class Futbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Jugador jugador = new Jugador();
        jugador.funcion();
        
        Jugador jugador1 = new Arquero();
        jugador1.funcion();
        
        Jugador jugador2 = new Delantero();
        jugador2.funcion();
    }
    
}
