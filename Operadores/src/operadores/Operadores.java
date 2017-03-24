/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author YO MERENGUES
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a =6;
        int b= 4;
        
        System.out.println("esta es l suma "+ (a+b));
        System.out.println("esta es la resta "+ (a-b));
        System.out.println("esta es la multiplicacion "+ (a*b));
        System.out.println("esta es la division "+ (a/b));
        System.out.println("esta es el resto "+ (a%b));
        
        a+=4; //a= a+4
        b-=2;//b = b-2
        
        System.out.println("el resultado del operador += " + a);
        System.out.println("el resultado del operador -= " + b);
        
        
    }
    
}
