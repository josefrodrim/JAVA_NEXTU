/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import java.util.Scanner;

/**
 *
 * @author YO MERENGUES
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A;
        int B;
        
        System.out.println("Ingerese el primer numero");
         A = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
         B = teclado.nextInt();
        
        
        if(A>B){
        System.out.println("la suma es" + (A+B));
        System.out.println("la resta es" + (A-B));
        System.out.println("la multiplicacion  es " + (A*B));
        System.out.println("la division es es" + (A/B));
        }else{
            System.out.println("A es menor que B ");
        }
        
    }
    
}
