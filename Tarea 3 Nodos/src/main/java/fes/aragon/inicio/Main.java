package fes.aragon.inicio;

import fes.aragon.clases.Nodo;

public class Main {
    public static void main(String[] args) {

        Nodo<Integer>  head = new Nodo<>(100, new Nodo<>(200 , new Nodo<>(300 , new Nodo<>(400 , new Nodo<>(600 , null)))));
        Nodo<Integer> head2 = head;
        Nodo<Integer> head3 = head;
        Nodo<Integer> head4 = head;


                //imprimir en pantalla , creamos un nodo auxiliar para no alterar los datos originales
        Nodo<Integer> aux = head;
        System.out.print("Estructura Original");
        System.out.println();
        while (aux != null){
            System.out.print(aux.getDato() + "| ->  |" );
            aux = aux.getSiguiente();
        }
        System.out.print("null|");
        System.out.println();


        System.out.println();
        System.out.println("cambiar el valor de 3er nodo de 300 a 333");
        head2.getSiguiente().getSiguiente().setDato(333);
        while (head2 != null){
            System.out.print(head2.getDato() + "| ->  |" );
            head2 = head2.getSiguiente();
        }
        System.out.print("null|");
        System.out.println();



        System.out.println();
        System.out.println("Insertar un nodo 700 después del nodo 600");
        Nodo<Integer> nodo600 = head3.getSiguiente().getSiguiente().getSiguiente().getSiguiente(); // Nodo con valor 600
        Nodo<Integer> nuevoNodo700 = new Nodo<>(700, null);
        nuevoNodo700.setSiguiente(nodo600.getSiguiente());
        nodo600.setSiguiente(nuevoNodo700);
        aux = head3;
        while (aux != null) {
            System.out.print(aux.getDato() + "| ->  |");
            aux = aux.getSiguiente();
        }
        System.out.print("null|");
        System.out.println();


        System.out.println();
        Nodo<Integer> nuevoNodo50 = new Nodo<>(50 , head);
        head4 = nuevoNodo50;
        Nodo<Integer> aux1 = head4;
        System.out.print("Estructura después de insertar 50 al principio:");
        System.out.println();
        while (aux1 != null) {
            System.out.print(aux1.getDato() + "| ->  |");
            aux1 = aux1.getSiguiente();
        }
        System.out.print("null|");
        System.out.println();
    }
}