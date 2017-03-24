/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salida3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Salida3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        String nombre;
        int identificacion;
        double estatura;
        
        //Salida y lectura
        System.out.print("Ingresa el nombre ");
        nombre=teclado.nextLine();
        System.out.println("Ingresa la identificacion ");
        identificacion=teclado.nextInt();
        System.out.println("Ingresa la estatura ");
        estatura=teclado.nextDouble();
        //Impresion
        System.out.println("El nombre es: "+nombre+ "\nLa indentificacion es: "+ identificacion+"\nLa estatura es: "+estatura);
        
        
        
        
    }
    
}
