/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colaprioridad;

import java.util.PriorityQueue;

/**
 *
 * @author Admin
 */
public class ColaPrioridad {

    public static void main(String[] args) {
        //Simular la reversa de turnos de un hospital
        
        Registro paciente1 = new Registro("Ander",2);
        Registro paciente2 = new Registro("Cristian",2);
        Registro paciente3 = new Registro("Maria",3);
        Registro paciente4 = new Registro("William",1);
        Registro paciente5 = new Registro("Carolina",5);
        
        Prioridad p = new Prioridad();
        
       p.agregarPaciente(paciente1);
       p.agregarPaciente(paciente2);
       p.agregarPaciente(paciente3);
       p.agregarPaciente(paciente4);
       p.agregarPaciente(paciente5);
        
        p.mostrarPacientes();
        p.atenderPaciente();
        p.mostrarPacientes();
        
    }
}
