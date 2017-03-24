/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada;

import java.util.Scanner;

/**
 *
 * @author YO MERENGUES
 */
public class Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra");
        String palabra = teclado.nextLine();
        
        System.out.println("Ingrese un numero entero");
        int entero = teclado.nextInt();
        
        System.out.println("Ingrese un numero decimal");
        double decimal = teclado.nextDouble();
        
        System.out.println("La palabra ingresada es " + palabra);
        System.out.println("el numero entero es " + entero);
        System.out.println("el numero decimal es " + decimal);
        
        teclado.close();
        
        
    
    
    
    }
    
}
