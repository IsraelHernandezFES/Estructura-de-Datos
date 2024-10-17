package fes.aragon.inicio;

import fes.aragon.clases.NodoArbolBinario;

public class Main {
    public static void main(String[] args) {

        NodoArbolBinario <Integer> raizInt = new NodoArbolBinario<>(10,new NodoArbolBinario<>(5,new NodoArbolBinario<>(1,null,null),null),new NodoArbolBinario<>(15,null,new NodoArbolBinario<>(25,null,null)));
        System.out.println(raizInt);

        NodoArbolBinario <String> raizString = new NodoArbolBinario<>("Diego",new NodoArbolBinario<>("Pedro",new NodoArbolBinario<>("Susan",null,null),new NodoArbolBinario<>("Diana",null,null)),new NodoArbolBinario<>("Mario",null,null));
        System.out.println(raizString);



    }
}