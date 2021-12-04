/**
 * @author OrlandoCana
 * @version 1.0
 */
package Principal;

import Clases.CAlgoritmoMergeSort;

public class App {
    public static void main(String[] args) throws Exception {
        // Arreglo 1 y 2
        int[] arr1 = {1, 2 ,15 ,7 ,8 ,14};
        int[] arr2 = {3, 2 ,15 ,9 ,8 ,6};
        // crear objetos de tipo CAlgoritmoInsercion
        CAlgoritmoMergeSort Obj1 = new CAlgoritmoMergeSort(arr1);
        CAlgoritmoMergeSort Obj2 = new CAlgoritmoMergeSort(arr2);
        // ordenar ascendente arr1 y mostrar
        Obj1.Ordenar();
        Obj1.MostrarArreglo();
        // ordenar descendente arr2 y mostrar
        Obj2.Ordenar(true);
        Obj2.MostrarArreglo();
    }
}
