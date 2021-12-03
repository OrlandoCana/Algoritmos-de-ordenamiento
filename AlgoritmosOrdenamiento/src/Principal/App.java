package Principal;

import Clases.CAlgoritmoInsercion;

public class App {
    public static void main(String[] args) throws Exception {
        // Arreglo 1 y 2
        int[] arr1 = {1, 2 ,15 ,7 ,8};
        int[] arr2 = {3, 2 ,15 ,9 ,8};
        // crear objetos de tipo CAlgoritmoInsercion
        CAlgoritmoInsercion Obj1 = new CAlgoritmoInsercion(arr1);
        CAlgoritmoInsercion Obj2 = new CAlgoritmoInsercion(arr2);
        // ordenar ascendente arr1 y mostrar
        Obj1.Ordenar();
        Obj1.MostrarArreglo();
        // ordenar descendente arr2 y mostrar
        Obj2.Ordenar(true);
        Obj2.MostrarArreglo();
    }
}
