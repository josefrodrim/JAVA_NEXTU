/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionfinal;

import Hospital.HistorialClinico;
import Hospital.Medico;
import Hospital.Paciente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author YO MERENGUES
 */
public class EvaluacionFinal {

    
    public static void main(String[] args) {
      
        menuPrincipal();
       
    }
    public  static void menuPrincipal(){
         int opcion = 0; 
         
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "+++++++++++MENU PRINCIPAL++++++++\n1. GestionarPacientes \n2.Gestionar Medicos \n 3.Gestionar Historial Clinico \n 4.Salir"));
            switch(opcion){
                case 1:  mostrarMenuPaciente();// JOptionPane.showMessageDialog(null, "opcion 1");
                break;
                case 2: JOptionPane.showMessageDialog(null, "opcion 2");
                break;
                case 3: JOptionPane.showMessageDialog(null, "opcion 2");
                break; 
                case 4: JOptionPane.showMessageDialog(null, "Finalizacion de todo mierda ");break;
                
                default: JOptionPane.showMessageDialog(null, "opcion equivocada");
            }
        }while(opcion != 4);
        
    }
    
    public static void mostrarMenuPaciente(){
        ArrayList<Paciente> lista = new ArrayList();
        Paciente paciente = new Paciente();
        int opc = 0;
              do{
                 opc = Integer.parseInt(JOptionPane.showInputDialog(null, "+++++++++++MENU PACIENTES++++++++\n1. REGISTRAR PACIENTES \n2.MOSTRAR PACIENTES \n3.MODIFICAR PACIENTES \n 4.ELIMINARPACIENTES \n5. Regresar"));    
                 switch(opc){
                     case 1: paciente.IngresarDatos(lista);
                     break;
                     case 2: System.out.println("hola mundo ");paciente.imprimirLista(lista); JOptionPane.showMessageDialog(null, paciente.imprimirLista(lista));
                     break;
                     case 3:System.out.println("3");
                     break;
                     case 4:System.out.println("4");
                     break;
                     case 5:System.out.println("7");
                     break;
                     default: System.out.println("opcion invalida");    
                 
                 }
              
              }while(opc != 5);
              
              
   }
    
  

}
