/**
 * @author OrlandoCana
 * @version 1.0
 */
package Principal;

import Clases.CAlgoritmoCountySort;

public class App {
    public static void main(String[] args) throws Exception {
        // Arreglo 1 y 2
        int[] arr1 = {1, 2 ,5 ,7 ,8 ,4};
        int[] arr2 = {3, 2 ,5 ,9 ,8 ,6};
        // crear objetos de tipo CAlgoritmoInsercion
        CAlgoritmoCountySort Obj1 = new CAlgoritmoCountySort(arr1);
        CAlgoritmoCountySort Obj2 = new CAlgoritmoCountySort(arr2);
        // ordenar ascendente arr1 y mostrar
        Obj1.Ordenar();
        Obj1.MostrarArreglo();
        // ordenar descendente arr2 y mostrar
        Obj2.Ordenar(true);
        Obj2.MostrarArreglo();
    }
}
