package fes.aragon.inicio;

import fes.aragon.clases.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {

        DoubleLinkedList<Integer> listaObjects =new DoubleLinkedList<>();
        listaObjects.agregarAlInicio(50);
        listaObjects.agregarAlFinal(60);
        listaObjects.agregarAlFinal(65);
        listaObjects.agregarAlFinal(70);
        listaObjects.agregarAlFinal(80);
        listaObjects.agregarAlFinal(90);

        System.out.println("Lista original");
        listaObjects.transversal(0);
        System.out.println(" ");


        System.out.println("lista actualizada: eliminar posicio 2");
        listaObjects.eliminar(1);
        listaObjects.transversal(0);

        System.out.println();
        System.out.println("lista Actualizada: actualizar el 4 elemento a 88");
        listaObjects.actualizar(80,88);
        listaObjects.transversal(0);

        System.out.println();
        System.out.println("Busca el valor 80 dentro de la lista: ");
        listaObjects.buscar(80);







    }
}