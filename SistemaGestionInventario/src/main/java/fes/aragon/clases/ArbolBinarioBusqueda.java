package fes.aragon.clases;


import java.util.ArrayList;
import java.util.List;


public class ArbolBinarioBusqueda<T extends Comparable<T>> {

    private NodoArbolBinario<T> raiz;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }

    public void insertar(T valor) {
        raiz = insertarRecursivo(raiz, valor);
    }


    private NodoArbolBinario<T> insertarRecursivo(NodoArbolBinario<T> nodo, T valor) {
        if (nodo == null) {
            // Si el nodo es null, se crea un nuevo nodo con el valor.
            return new NodoArbolBinario<>(valor);
        }

        // Comparar el valor con el dato actual del nodo.
        if (valor.compareTo(nodo.getData()) == 0) {
            return nodo; // No se permiten duplicados, retornar el nodo sin cambios.
        }
        if (valor.compareTo(nodo.getData()) < 0) {
            // Insertar en el subárbol izquierdo si el valor es menor.
            nodo.setHijoIzquierdo(insertarRecursivo(nodo.getHijoIzquierdo(), valor));
        } else {
            // Insertar en el subárbol derecho si el valor es mayor.
            nodo.setHijoDerecho(insertarRecursivo(nodo.getHijoDerecho(), valor));
        }
        return nodo;
    }

    public T buscar(T valor) {
        return buscarRecursivo(raiz, valor);
    }


    private T buscarRecursivo(NodoArbolBinario<T> nodo, T valor) {
        if (nodo == null) {
            return null; // Si el nodo es null, el valor no está en el árbol.
        }
        if (valor.compareTo(nodo.getData()) == 0) {
            return nodo.getData(); // Valor encontrado.
        }
        // Buscar en el subárbol izquierdo o derecho según el valor.
        return valor.compareTo(nodo.getData()) < 0
                ? buscarRecursivo(nodo.getHijoIzquierdo(), valor)
                : buscarRecursivo(nodo.getHijoDerecho(), valor);
    }


    public List<T> recorrerEnOrden() {
        List<T> resultado = new ArrayList<>();
        recorrerEnOrdenRecursivo(raiz, resultado);
        return resultado;
    }


    private void recorrerEnOrdenRecursivo(NodoArbolBinario<T> nodo, List<T> resultado) {
        if (nodo != null) {
            recorrerEnOrdenRecursivo(nodo.getHijoIzquierdo(), resultado);
            resultado.add(nodo.getData());
            recorrerEnOrdenRecursivo(nodo.getHijoDerecho(), resultado);
        }
    }

    public boolean eliminar(T valor) {
        raiz = eliminarRecursivo(raiz, valor);
        return (raiz != null);
    }


    private NodoArbolBinario<T> eliminarRecursivo(NodoArbolBinario<T> nodo, T valor) {
        if (nodo == null) {
            return null; // Si el nodo es null, el valor no está en el árbol.
        }

        // Buscar el nodo a eliminar.
        if (valor.compareTo(nodo.getData()) < 0) {
            nodo.setHijoIzquierdo(eliminarRecursivo(nodo.getHijoIzquierdo(), valor));
        } else if (valor.compareTo(nodo.getData()) > 0) {
            nodo.setHijoDerecho(eliminarRecursivo(nodo.getHijoDerecho(), valor));
        } else {
            // Nodo encontrado.
            if (nodo.getHijoIzquierdo() == null) {
                return nodo.getHijoDerecho(); // Si no tiene hijo izquierdo.
            } else if (nodo.getHijoDerecho() == null) {
                return nodo.getHijoIzquierdo(); // Si no tiene hijo derecho.
            }

            // Nodo con dos hijos: encontrar el mínimo en el subárbol derecho.
            T minValue = encontrarMinimo(nodo.getHijoDerecho());
            nodo.setData(minValue);
            nodo.setHijoDerecho(eliminarRecursivo(nodo.getHijoDerecho(), minValue));
        }
        return nodo;
    }


    private T encontrarMinimo(NodoArbolBinario<T> nodo) {
        T minValue = nodo.getData();
        while (nodo.getHijoIzquierdo() != null) {
            nodo = nodo.getHijoIzquierdo();
            minValue = nodo.getData();
        }
        return minValue;
    }
}