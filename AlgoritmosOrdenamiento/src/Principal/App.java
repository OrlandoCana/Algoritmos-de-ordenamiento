/**
 * @author OrlandoCana
 * @version 1.0
 */
package Principal;

import Clases.CAlgoritmoShellSort;

public class App {
    public static void main(String[] args) throws Exception {
        // Arreglo 1 y 2
        int[] arr1 = {1, 2 ,15 ,7 ,8 ,14};
        int[] arr2 = {3, 2 ,15 ,9 ,8 ,6};
        // crear objetos de tipo CAlgoritmoInsercion
        CAlgoritmoShellSort Obj1 = new CAlgoritmoShellSort(arr1);
        CAlgoritmoShellSort Obj2 = new CAlgoritmoShellSort(arr2);
        // ordenar ascendente arr1 y mostrar
        Obj1.Ordenar();
        Obj1.MostrarArreglo();
        // ordenar descendente arr2 y mostrar
        Obj2.Ordenar(true);
        Obj2.MostrarArreglo();
    }
}
