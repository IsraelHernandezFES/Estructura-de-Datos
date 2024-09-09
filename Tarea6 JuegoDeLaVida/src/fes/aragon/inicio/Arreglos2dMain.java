package fes.aragon.inicio;

import fes.aragon.clases.Array2D;
import fes.aragon.clases.JuegoDeLaVida;

public class Arreglos2dMain {
    public static void main(String[] args) throws InterruptedException {

        JuegoDeLaVida juego = new JuegoDeLaVida(10,10);
        juego.inicializarRandom();
        juego.actualizacionRejilla();

        //ciclo
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Generacion " + (i+1));
            juego.imprimirRejilla();
            juego.actualizacionRejilla();
            Thread.sleep(1000); //pausas cada n milisegndos
        }

    }
}