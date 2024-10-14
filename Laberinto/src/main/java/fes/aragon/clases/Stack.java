package fes.aragon.clases;

import java.util.EmptyStackException;
import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> data;

    // Constructor
    public Stack() {
        data = new ArrayList<>();
    }

    // Verifica si la pila está vacía
    public boolean isEmpty() {
        return data.size() == 0;
    }

    // Retorna el tamaño de la pila
    public int length() {
        return data.size();
    }

    // Elimina y retorna el último elemento (cima) de la pila
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data.remove(data.size() - 1);
    }

    // Retorna el elemento en la cima de la pila sin eliminarlo
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data.get(data.size() - 1);
    }

    // Agrega un elemento a la pila
    public void push(T value) {
        data.add(value);
    }

    // Imprime los elementos de la pila de forma invertida (de la cima hacia abajo)
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("-----\n");
        for (int i = data.size() - 1; i >= 0; i--) {
            info.append(data.get(i)).append("\n|---|\n");
        }
        return info.toString();
    }

}
