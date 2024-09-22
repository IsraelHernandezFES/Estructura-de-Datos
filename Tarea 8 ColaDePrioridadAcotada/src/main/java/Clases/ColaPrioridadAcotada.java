package Clases;

import java.sql.PreparedStatement;
import java.util.Arrays;

public class ColaPrioridadAcotada <E>{
    private ColaADT<E>[] colas;
    private int maxPrioridad;

    public ColaPrioridadAcotada(int maxPrioridad) {
        this.maxPrioridad = maxPrioridad;
        colas= new ColaADT[maxPrioridad + 1];
        for (int i = 0; i <= maxPrioridad; i++) {
            colas[i] = new ColaADT<E>();
        }
    }

    public boolean estaVacia(){
        boolean res = false;
        if (this.colas.length == 0){
            res = true;
        }
        return  res;
    }

    public int longitud(){
        return this.colas.length;
    }

    public void encolar (int prioridad , E elem){
        if (prioridad >= 1  && prioridad <= this.maxPrioridad){
            this.colas[prioridad].encolar(elem);
        }
    }

    public E desencolar(){
        for (int i = 0; i <= maxPrioridad; i++) {
            if (!colas[i].estaVacia()){
                return colas[i].desEncolar();
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxPrioridad + 1; i++) {
            sb.append("Nivel ").append(i).append(": ");
            if (colas[i].estaVacia()) {
                sb.append("vacío");
            } else {
                sb.append("[");
                sb.append(colas[i]).append(" ,");
                sb.setLength(sb.length() - 2);
                sb.append("]");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
