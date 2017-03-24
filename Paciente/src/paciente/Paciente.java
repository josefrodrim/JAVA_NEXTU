/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paciente;

import java.util.Scanner;

/**
 *
 * @author YO MERENGUES
 */
public class Paciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del paciente");
        String nombre = teclado.nextLine();
        
        System.out.println("Ingrese la identificacion del paciente");
        int identificacion = teclado.nextInt();
        
        System.out.println("Ingrese la estatura");
        double estatura = teclado.nextDouble();
        
        
        
        
        System.out.println("el nombre del paciente es "+ nombre);
        System.out.println("La identificacion delk paciente es " + identificacion);
        System.out.println("la estatura del pacienter es " + estatura);
        
        teclado.close();
    }
    
}
