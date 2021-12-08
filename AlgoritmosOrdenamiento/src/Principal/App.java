/**
 * @author OrlandoCana
 * @version 1.0
 */
package Principal;

import Clases.CAlgoritmo;
import Clases.COrdenamiento;

public class App {
    public static void main(String[] args) throws Exception {
        // Arreglo 1 y 2
        int[] arr1 = {1, 8 ,5 ,17 ,8 ,4 ,14};
        //int[] arr2 = {3, 322 ,15 ,19 ,28 ,6 ,14};
        // crear objetos de tipo CAlgoritmoInsercion
        COrdenamiento ordenamiento = new COrdenamiento(arr1);
        ordenamiento.Ordenar(CAlgoritmo.HEAP_SORT, true); 
        ordenamiento.MostrarArreglo();
    }
}
