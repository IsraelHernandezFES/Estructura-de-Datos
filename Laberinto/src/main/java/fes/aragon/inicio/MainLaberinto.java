package fes.aragon.inicio;

import com.sun.source.tree.NewArrayTree;
import fes.aragon.clases.Array2D;
import fes.aragon.clases.ReglasLaberinto;

import javax.swing.*;

public class MainLaberinto {
    public static void main(String[] args) {
        Array2D laberinto = new Array2D(10, 10);

        // utizimos un array , donde vamos a dibujar el laberinto
        char [][] dibujoLaberinto = {
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'},
                {'#', ' ', '#', ' ', '#', ' ', '#', '#', ' ', '#'},
                {'#', ' ', '#', ' ', ' ', ' ', '#', '#', ' ', ' '},
                {'#', ' ', '#', '#', '#', ' ', '#', '#', '#', '#'},
                {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#'},
                {'#', ' ', '#', '#', '#', '#', ' ', '#', '#', '#'},
                {'#', ' ', ' ', ' ', '#', ' ', ' ', '#', ' ', '#'},
                {'#', '#', '#', ' ', '#', '#', ' ', ' ', ' ', '#'},
                {'#', '#', '#', ' ', '#', '#', '#', '#', '#', '#'}
        };

        //posteriormente llenamos el Array2D con el dibujo
        for (int i = 0; i < laberinto.getRowSize(); i++) {
            for (int j = 0; j < laberinto.getColSize(); j++) {
                laberinto.setItem(i, j, dibujoLaberinto[i][j]);
            }
        }

        ReglasLaberinto game = new ReglasLaberinto(laberinto, 9, 3, 3, 9); //aqui ponemos las coordenadas de la entrada y de la salida

        // Mostrar el laberinto
        System.out.println("Laberinto Inicial:");
        game.mostrarLaberinto();

        // Resolver el laberinto paso a paso
        if (game.resolverLaberinto()) {
            System.out.println("¡Laberinto resuelto!");
        } else {
            System.out.println("No se pudo resolver el laberinto.");


    }

}
}
