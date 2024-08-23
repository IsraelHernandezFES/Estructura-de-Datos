package fes.aragon.clases;

import com.sun.source.doctree.SeeTree;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoADT <T> {

    private Set<T> elementos;

    public ConjuntoADT() {
        elementos = new HashSet<>(); //para evitar dupiclados
    }

    public int longitud (){
        return elementos.size();
    }

    public boolean contiene( T elemento){
        if(elementos.contains(elemento)){
            System.out.println("el elemento existe");
        } else {
            System.out.println("elemento inexistente");
        }
        return false;
    }

    public void agregar( T elemento){
        elementos.add(elemento);
    }

    public void eliminar( T elemento){
        elementos.remove(elemento);
    }

    public boolean equals(ConjuntoADT<T> otroConjunto){  //regresa true si ambos conjuntos tienen los mismos elementos
        if (this.longitud() != otroConjunto.longitud()){
            return false;
        }

        for (T elemento : this.elementos){
            if (!otroConjunto.contiene(elemento));{
                return false;
            }
        }
        return true; //si no se cumple cualquiera de las dos condiciones entonces coinciden los conjuntos
    }

    public boolean esSubConjunto(ConjuntoADT<T> otroConjunto){  //regresa True si ambos conjuntos tienen los mismos elementos
        if (this.contiene((T) otroConjunto)){
            return true;
        }
        return false;
    }

    public ConjuntoADT<T> union(ConjuntoADT<T> otroConjunto){ //regresa un nuevo conjunto con la union
        ConjuntoADT<T> nuevoConjunto = new ConjuntoADT<>();
        nuevoConjunto.elementos.addAll(this.elementos);
        nuevoConjunto.elementos.addAll(otroConjunto.elementos);
        return nuevoConjunto;
    }

    public ConjuntoADT<T> interseccion(ConjuntoADT<T> otroConjunto){ //regresa un nuevo conjunto con la interseccion
        ConjuntoADT<T> nuevoConjunto = new ConjuntoADT<>();
        for (T elemento : this.elementos){
            if (otroConjunto.contiene(elemento)){
                nuevoConjunto.agregar(elemento);
            }
        }
        return nuevoConjunto;
    }

    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otroConjunto){ // elementos de un elemento pero que no tiene el otro
        ConjuntoADT<T> nuevoConjunto = new ConjuntoADT<>();
        for (T elemento : this.elementos){
            if (!otroConjunto.contiene(elemento)){
                nuevoConjunto.agregar(elemento);
            }
        }
        return nuevoConjunto;
    }

    @Override
    public String toString() {
        return
                "alumnos=" + elementos ;
    }
}
