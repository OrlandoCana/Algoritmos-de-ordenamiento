/**
 * @author OrlandoCana
 * @version 1.0
 */
package Principal;

import Clases.CAlgoritmoRadixSort;

public class App {
    public static void main(String[] args) throws Exception {
        // Arreglo 1 y 2
        int[] arr1 = {1, 2 ,5 ,17 ,8 ,4};
        int[] arr2 = {3, 322 ,15 ,19 ,28 ,6};
        // crear objetos de tipo CAlgoritmoInsercion
        CAlgoritmoRadixSort Obj1 = new CAlgoritmoRadixSort(arr1);
        CAlgoritmoRadixSort Obj2 = new CAlgoritmoRadixSort(arr2);
        // ordenar ascendente arr1 y mostrar
        Obj1.Ordenar();
        Obj1.MostrarArreglo();
        // ordenar descendente arr2 y mostrar
        Obj2.Ordenar(true);
        Obj2.MostrarArreglo();
    }
}
