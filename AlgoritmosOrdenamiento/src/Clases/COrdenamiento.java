package Clases;

public class COrdenamiento {
    private int[] Arreglo;
    private int tamanio;
    public COrdenamiento(int[] arreglo) {
        this.Arreglo = arreglo;
        this.tamanio = arreglo.length;
    }
    public void Ordenar(CAlgoritmo algoritmo){
        this.Ordenar(algoritmo,false);
    }
    /**
     * 
     * @param algoritmo ALgoritmo de ordenamiento
     * @param orden false: ascendente ,true: descendente
     */
    public void Ordenar(CAlgoritmo algoritmo, boolean orden){
        CAlgoritmoOrdenamiento ordenamiento;
        // Ordena de forma ascendente
        switch(algoritmo){
            case INSERTION_SORT:
                ordenamiento = new CAlgoritmoInsercion(this.Arreglo);
                ordenamiento.Ordenar(orden);
                break;
            case BUBBLE_SORT:
                ordenamiento = new CAlgoritmoBurbuja(this.Arreglo);
                ordenamiento.Ordenar(orden);
                break;
            case MERGE_SORT:
                ordenamiento = new CAlgoritmoMergeSort(this.Arreglo);
                ordenamiento.Ordenar(orden);  
                break;
            case COUNTY_SORT:
                ordenamiento = new CAlgoritmoCountySort(this.Arreglo);
                ordenamiento.Ordenar(orden);
                break;
            case RADIX_SORT:
                ordenamiento = new CAlgoritmoRadixSort(this.Arreglo);
                ordenamiento.Ordenar(orden);
                break;
            case HEAP_SORT:
                ordenamiento = new CAlgoritmoHeapSort(this.Arreglo);
                ordenamiento.Ordenar(orden);
                break;
            case SHELL_SORT:
                ordenamiento = new CAlgoritmoShellSort(this.Arreglo);
                ordenamiento.Ordenar(orden);
                break;
            case QUICK_SORT:
                ordenamiento = new CAlgoritmoQuickSort(this.Arreglo);
                ordenamiento.Ordenar(orden);
                break;
            default:
                break;
        }
    }
    public void MostrarArreglo() {
        for (int k = 0; k < this.tamanio; k++){
            System.out.print(this.Arreglo[k] + " ");
        }
        System.out.println();
    }
}
