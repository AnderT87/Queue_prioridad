/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colaprioridad;

import java.util.PriorityQueue;

/**
 *
 * @author Admin
 */
public class Prioridad {
 
    private PriorityQueue<Registro> cola;

    public Prioridad() {
        // Menor número = mayor prioridad
        cola = new PriorityQueue<>((p1, p2) -> Integer.compare(p1.getPrioridad(), p2.getPrioridad()));
    }

    // Agregar un paciente
    public void agregarPaciente(Registro paciente) {
        
        cola.add(paciente);
        System.out.println("Ingresó: " + paciente);
    }

    // Atender al siguiente paciente
    public void atenderPaciente() {
        if (cola.isEmpty()) {
            System.out.println("No hay pacientes en espera.");
        } else {
            System.out.println("Atendiendo a: " + cola.poll());
        }
    }

    // Ver todos los pacientes en espera
    public void mostrarPacientes() {
        if (cola.isEmpty()) {
            System.out.println("No hay pacientes.");
            return;
        }

        System.out.println("\n--- Pacientes en espera ---");
        for (Registro p : cola) {
            System.out.println(p);
        }
    }

    // Saber si la cola está vacía
    public boolean estaVacia() {
        return cola.isEmpty();
    }
}
