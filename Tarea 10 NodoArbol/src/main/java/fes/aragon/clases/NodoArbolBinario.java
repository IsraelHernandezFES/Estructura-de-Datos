package fes.aragon.clases;

import java.util.Objects;

public class NodoArbolBinario <T>{
    private T dato;
    private NodoArbolBinario<T> hijoIzuierdo;
    private NodoArbolBinario<T> hijoDerecho;

    public NodoArbolBinario() {
    }

    public NodoArbolBinario(T dato, NodoArbolBinario<T> hijoIzuierdo, NodoArbolBinario<T> hijoDerecho) {
        this.dato = dato;
        this.hijoIzuierdo = hijoIzuierdo;
        this.hijoDerecho = hijoDerecho;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoArbolBinario<T> getHijoIzuierdo() {
        return hijoIzuierdo;
    }

    public void setHijoIzuierdo(NodoArbolBinario<T> hijoIzuierdo) {
        this.hijoIzuierdo = hijoIzuierdo;
    }

    public NodoArbolBinario<T> getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbolBinario<T> hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        NodoArbolBinario<?> nodoArbol = (NodoArbolBinario<?>) object;
        return Objects.equals(dato, nodoArbol.dato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dato);
    }





    @Override
    public String toString() {
        return toString("", true);
    }

    private String toString(String prefix, boolean isTail) {
        StringBuilder builder = new StringBuilder();

        // Añade el nodo actual
        builder.append(prefix)
                .append(isTail ? "└── " : "├── ")
                .append(dato)
                .append("\n");

        // Si hay hijos, procesamos recursivamente
        if (hijoIzuierdo != null || hijoDerecho != null) {
            if (hijoDerecho != null) {
                builder.append(hijoDerecho.toString(prefix + (isTail ? "    " : "│   "), false));
            }
            if (hijoIzuierdo != null) {
                builder.append(hijoIzuierdo.toString(prefix + (isTail ? "    " : "│   "), true));
            }
        }

        return builder.toString();
    }

}
