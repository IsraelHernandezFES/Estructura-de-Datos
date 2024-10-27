package fes.aragon.inicio;

import fes.aragon.clases.MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int [] numeros = {15,42,12,29,72,60,50};
        System.out.println("Arreglo original: ");
        System.out.println(Arrays.toString(numeros));

        MergeSort ordenaminento = new MergeSort();
        ordenaminento.mergeSort(numeros);
        System.out.println("Arreglo Ordenado: ");
        System.out.println(Arrays.toString(numeros));



    }
}