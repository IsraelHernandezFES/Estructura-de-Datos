package fes.aragon.inicio;

import fes.aragon.clases.ColaADT;
import fes.aragon.clases.Paciente;
import fes.aragon.clases.Paciente;

public class Main {
    public static void main(String[] args) {
        ColaADT<Paciente> pacientes = new ColaADT<>();

        System.out.println("Sala de Emergencias");
        pacientes.encolar(new Paciente("Melissa",18,"Diabetes"));
        pacientes.encolar(new Paciente("Esteban" ,23,"Gonorrea"));
        pacientes.encolar(new Paciente("Jess",75,"Asma"));
        System.out.println(pacientes);

        System.out.println("Primer Atendido: " + pacientes.desEncolar());
        System.out.println("Paciente en Espera: " + pacientes);
        System.out.println("La Cola Esta vacia? ");
        System.out.println(pacientes.estaVacia());

    }
}