package fes.aragon.inicio;

import fes.aragon.clases.ListasLigadas;
import fes.aragon.clases.SmartPhone;

public class Main {
    public static void main(String[] args) {
        //creamos la lista ligada donde conteneremos SmarthPhones
        ListasLigadas<SmartPhone> celulares = new ListasLigadas<>();

        //agregamos nuevos smarthphones a la lista y les damos sus datos
        celulares.agregarAlInicio(new SmartPhone(1,"samsung" , 2015, 8 , 128 , "blanco"));
        celulares.agregarAlFinal(new SmartPhone(2,"Xiaomi" , 2020, 12 , 64 , "azul"));
        celulares.agregarAlFinal(new SmartPhone(3,"Redmi" , 2020, 4 , 256 , "negro"));
        celulares.agregarAlFinal(new SmartPhone(4,"iphone" , 2023, 8 , 512 , "rosa"));
        celulares.agregarAlFinal(new SmartPhone(5,"Motorola" , 2019, 4 , 64 , "blanco"));
        ListasLigadas<SmartPhone> respaldo = celulares;

        //imprimimos la lista con el metodo transversal
        System.out.println("Inventario Inicial: ");
        celulares.tranversal();

        //actualizamos el contenido elimando el dispositivo con la posicion 2
        celulares.eliminar(1);
        System.out.println("Inventario Actualizado: Se vendio el dispositivo 2");
        celulares.tranversal();

        //Actualizamos los datos de la posicion 2
        respaldo.actualizar(1,new SmartPhone(2, "asus" , 2018 , 16,64,"gris"));
        System.out.println("Inventario actualizado: Actualizamos los datos del dispostivo 2");
        respaldo.tranversal();

        //agregamos dispositivos al inicio de la lista y al final de la lista
        celulares.agregarAlInicio(new SmartPhone(1,"LG" , 2023, 16,64 , "verde"));
        celulares.agregarAlFinal(new SmartPhone(6,"Google",2020,4,128,"blanco"));
        System.out.println("Inventario Actualizado: Se agregaron dos dispositvos nuevos en el incio y final de la lista");
        celulares.tranversal();

        //eleminamos el primer dispostivo de la lista
        celulares.eliminarElPrimer();
        System.out.println("Inventario Actualizado : Se vendio el primer dispositivo de la lista");
        celulares.tranversal();




    }
}