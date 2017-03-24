/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.HistorialClinico;
import modelo.Medico;
import modelo.Paciente;

/**
 *
 * @author josef renato rodriguez mallma
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        menuPrincipal();
        
        
    }
    
     
    public  static void menuPrincipal(){
         int opcion = 0;

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "+++++++++++MENU PRINCIPAL++++++++\n1.GestionarPacientes \n2.Gestionar Medicos \n 3.Gestionar Historial Clinico \n4.Salir"));
            switch(opcion){
                case 1:  mostrarMenuPaciente();
                break;
                case 2:  mostrarMenuMedico();
                break;
                case 3: mostrarMenuHistorialClinico();
                break;
                case 4: JOptionPane.showMessageDialog(null, "Finalizacion del Sistema ");break;

                default: JOptionPane.showMessageDialog(null, "opcion equivocada");
            }
        }while(opcion != 4);

    }

    public static void mostrarMenuPaciente(){
        ArrayList<Paciente> lista = new ArrayList();
        Paciente paciente = new Paciente();
        int opc = 0;
              do{
                 opc = Integer.parseInt(JOptionPane.showInputDialog(null, "+++++++++++MENU PACIENTES++++++++\n1.REGISTRAR PACIENTES \n2.MOSTRAR PACIENTES \n3.MODIFICAR PACIENTES \n4.ELIMINARPACIENTES \n5. REGRESAR"));
                 switch(opc){
                     case 1: paciente.ingresarDatos(lista);
                     break;
                     case 2: paciente.mostrarDatos(lista);
                     break;
                     case 3: paciente.modificarDatos(lista);
                     break;
                     case 4: paciente.eliminarDatos(lista);
                     break;
                     case 5:JOptionPane.showMessageDialog(null, "Regresando...");
                     break;
                     default: System.out.println("opcion invalida");

                 }

              }while(opc != 5);


   }
    
   public static void mostrarMenuMedico(){
        ArrayList<Medico> lista = new ArrayList();
        Medico medico = new Medico();
        int opc = 0;
              do{
                 opc = Integer.parseInt(JOptionPane.showInputDialog(null, "+++++++++++MENU MEDICOS++++++++\n1.REGISTRAR PMEDICOS \n2.MOSTRAR MEDICOS \n3.MODIFICAR MEDICOS \n4.ELIMINAR MEDICOS \n5. REGRESAR"));
                 switch(opc){
                     case 1: medico.ingresarDatos(lista);
                     break;
                     case 2: medico.mostrarDatos(lista);
                     break;
                     case 3: medico.modificarDatos(lista);
                     break;
                     case 4: medico.eliminarDatos(lista);
                     break;
                     case 5:  JOptionPane.showMessageDialog(null, "Regresando...");
                     break;
                     default: System.out.println("opcion invalida");

                 }

              }while(opc != 5);


   }
    
     public static void mostrarMenuHistorialClinico(){
        ArrayList<HistorialClinico> lista = new ArrayList();
        HistorialClinico historialC = new HistorialClinico();
        int opc = 0;
              do{
                 opc = Integer.parseInt(JOptionPane.showInputDialog(null, "+++++++++++MENU HISTORIAL CLINICO++++++++\n1.REGISTRAR HISTORIAL CLINICO \n2.MOSTRAR HISTORIAL CLINICO \n3.MODIFICAR HISTORIAL CLINICO \n 4.ELIMINAR HISTORIAL CLINICO \n5. REGRESAR"));
                 switch(opc){
                     case 1: historialC.ingresarDatos(lista);
                     break;
                     case 2: historialC.mostrarDatos(lista);
                     break;
                     case 3: historialC.modificarDatos(lista);
                     break;
                     case 4: historialC.eliminarDatos(lista);
                     break;
                     case 5:  JOptionPane.showMessageDialog(null, "Regresando...");
                     break;
                     default: System.out.println("opcion invalida");

                 }

              }while(opc != 5);


   }
    
}
