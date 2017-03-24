/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package destructor;

/**
 *
 * @author YO MERENGUES
 */
public class Cine {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("este es el destructor invocado");
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
