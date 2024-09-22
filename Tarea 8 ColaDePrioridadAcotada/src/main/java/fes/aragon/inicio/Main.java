package fes.aragon.inicio;

import Clases.ClienteBanco;
import Clases.ColaPrioridadAcotada;

public class Main {
    public static void main(String[] args) {
        ColaPrioridadAcotada<ClienteBanco> clientes = new ColaPrioridadAcotada<>(5);
        clientes.encolar(4, new ClienteBanco("Esteban Lazos" , 4));
        clientes.encolar(4, new ClienteBanco("Jose Ramirez" , 4));
        clientes.encolar(5, new ClienteBanco("Carlos Hernandez" , 5));
        clientes.encolar(5, new ClienteBanco("Jesus Pacheco" , 5));
        clientes.encolar(5, new ClienteBanco("Israel Hernandez" , 5));
        clientes.encolar(1, new ClienteBanco("Luisito Comunica" , 1));
        System.out.println(clientes);
        System.out.println(clientes.desencolar().retirarDinero(10000));
        clientes.encolar(3, new ClienteBanco("Alejandra Pacheco", 3));
        clientes.encolar(2, new ClienteBanco("Manuel Gonzalez", 2));
        System.out.println();
        System.out.println("Llegan mas clientes a la cola");
        System.out.println(clientes);
        System.out.println("El siguiente en pasar es el " + clientes.desencolar());
        System.out.println("El siguiente en pasar es el " + clientes.desencolar());
        System.out.println("El siguiente en pasar es el " + clientes.desencolar());
        System.out.println("El siguiente en pasar es el " + clientes.desencolar());
        System.out.println("El siguiente en pasar es el " + clientes.desencolar());
        System.out.println("El siguiente en pasar es el " + clientes.desencolar());
        System.out.println("El siguiente en pasar es el " + clientes.desencolar());

        System.out.println();
        System.out.println("Parece que hemos terminado de atender a todos los clientes!");
        System.out.println(clientes);







    }
}