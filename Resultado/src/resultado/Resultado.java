/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultado;

import java.util.Scanner;

/**
 *
 * @author YO MERENGUES
 */
public class Resultado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese los puntos del equipo A");
        int resultadoA = teclado.nextInt();
        System.out.println("Ingrese los puntos del equipo B");
        int resultadoB = teclado.nextInt();
        
        
        
        if(resultadoA == resultadoB){
            System.out.println("Empate");
        }else{
            if (resultadoA>resultadoB){
            System.out.println("el equipo ganador es A");
        }else{
            System.out.println("el equipo ganador es B");
        }
        }
        
    }
    
}
