package fes.aragon.clases;

import java.util.Arrays;

public class MergeSort  {

    public static void mergeSort(int[] data) {
        //Comprueba si la longitud del arreglo es mayor a 1
        if (data.length > 1){

            int mitad = data.length / 2;

            //dividimos el arreglo en dos mitades
            int [] izquierda = Arrays.copyOfRange(data, 0, mitad);
            int [] derecha = Arrays.copyOfRange(data, mitad, data.length);

            System.out.println(Arrays.toString(izquierda) + "--------" + Arrays.toString(derecha));
            //lamada recursiva para dividir hasta llegar a longitud = 1
            mergeSort(izquierda);
            mergeSort(derecha);

            //empezamos a fucionar las mitades
            int i = 0 , d= 0 , k = 0;
            while (i < izquierda.length && d < derecha.length){
                if (izquierda[i] < derecha [d]){
                    data [k++] = izquierda[i++];
                } else {
                    data [k++] = derecha [d++];
                }
            }

            //agregar los elementos restastes izquierdos , si los hay
            while (i < izquierda.length) {
                data[k++] = izquierda[i++];
            }

            // Agregar los elementos restantes de la mitad derecha, si los hay
            while (d < derecha.length) {
                data[k++] = derecha[d++];
            }

        }
        //imprimer el arreglo despues de cada retorno de recursioon
        System.out.println("Regreso Recursivo:" + Arrays.toString(data));

    }

}
