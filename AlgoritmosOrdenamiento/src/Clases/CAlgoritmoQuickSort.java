package Clases;
/**
 * @author OrlandoCana
 * @version 1.0
 */
public class CAlgoritmoQuickSort extends CAlgoritmoOrdenamiento {
    
    public CAlgoritmoQuickSort(int[] arreglo) {
        super(arreglo);
    }
    /**
     * @param orden true: ordena descendente
     */
    @Override
    public void Ordenar() {
        this.Ordenar(false);
    }

    @Override
    public void Ordenar(boolean orden) {
        quicksort(this.Arreglo, 0, tamanio - 1);
        if(orden){
            for(int k = 0; k < tamanio/2; k++){
                int aux = this.Arreglo[k];
                this.Arreglo[k] = this.Arreglo[tamanio - 1 - k];
                this.Arreglo[tamanio - 1 - k] = aux;
            }
        }
    }

    private void quicksort(int[] arr, int primero, int ultimo)
    {
        int i, j, central;
        double pivote;
        central = (primero + ultimo) / 2;
        pivote = arr[central];
        i = primero;
        j = ultimo;
        do
        {
            while (arr[i] < pivote) i++;
            while (arr[j] > pivote) j--;
            if (i <= j)
            {
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);

        if (primero < j)
        {
            quicksort(arr, primero, j);
        }
        if (i < ultimo)
        {
            quicksort(arr, i, ultimo);
        }
    }
}
