package fes.aragon.inicio;

import fes.aragon.clases.ConjuntoADT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ConjuntoADT<String> equipo1 = new ConjuntoADT<>();
        equipo1.agregar("Israel Hernandez");
        equipo1.agregar("Jesus Barragan");
        equipo1.agregar("Angel Cordoba");
        System.out.println("Equipo 1 " + equipo1.toString());

        ConjuntoADT<String> equipo2 = new ConjuntoADT<>();
        equipo2.agregar("Pancho Villanueva");
        equipo2.agregar("Camilo Sanchez");
        equipo2.agregar("Esteban Lazos");
        System.out.println("Equipo 2 " + equipo2.toString());

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingresa un alumno a comprobar en el Equipo 1: ");
        equipo1.contiene(scanner.nextLine());
        System.out.println("Ingresa un alumno a comprobar en el Equipo 2: ");
        equipo2.contiene(scanner.nextLine());

        System.out.println("ingresa un alumno a eleminar del equipo 1");
        equipo1.eliminar(scanner.nextLine());
        System.out.println("ahora agrega a un alumno al equipo 1");
        equipo1.agregar(scanner.nextLine());
        System.out.println("equipo 1 actualizado " +equipo1.toString());

        ConjuntoADT<String> unionEquipos = equipo1.union(equipo2);
        System.out.println("Unión: " + unionEquipos.toString());

        ConjuntoADT<String> interseccionEquipos = equipo1.interseccion(equipo2);
        System.out.println("Intersección: " + interseccionEquipos.toString());
    }
}