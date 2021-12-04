package Clases;
/**
 * @author OrlandoCana
 * @version 1.0
 */
public class CAlgoritmoMergeSort implements IAlgoritmoOrdenamiento {
    private int[] Arreglo;
    private int tamanio;
    public CAlgoritmoMergeSort(int[] arreglo) {
        this.Arreglo = arreglo;
        this.tamanio = arreglo.length;
    }
    public int[] getArreglo() {
        return Arreglo;
    }
    
    public int getTamanio() {
        return tamanio;
    }
    
    @Override
    public void MostrarArreglo() {
        for (int k = 0; k < this.tamanio; k++){
            System.out.print(this.Arreglo[k] + " ");
        }
        System.out.println();
        
    }
    @Override
    public void Ordenar() {
        Ordenar(false);
    }
    /**
     * 
     * @param arr : arreglo original
     * @param arrIzquierda : la mitad del arreglo parte izquierda
     * @param arrDerecha : la mitad del arreglo parte derecha
     * @param tamIzquierda : tamaño del arreglo de la izquierda
     * @param tamnDerecha : tamaño del arreglo de la derecha
     * @param Orden : define el orden ascendente o descendente
     */
    private static void merge_intercambiar(int[] arr,int[] arrIzquierda,int[] arrDerecha,int tamIzquierda,int tamnDerecha,boolean Orden){
        int j = 0, i = 0, k = 0;
        while(i < tamIzquierda && j < tamnDerecha){
            if(Orden == false){
                if (arrIzquierda[i] <= arrDerecha[j]) {
                    arr[k++] = arrIzquierda[i++];
                }
                else {
                    arr[k++] = arrDerecha[j++];
                }
            }
            else{
                if (arrIzquierda[i] >= arrDerecha[j]) {
                    arr[k++] = arrIzquierda[i++];
                }
                else {
                    arr[k++] = arrDerecha[j++];
                }
            }
        } 
        while (i < tamIzquierda) {
            arr[k++] = arrIzquierda[i++];
        }
        while (j < tamnDerecha) {
            arr[k++] = arrDerecha[j++];
        }
    }
    private static void mergeSort(int[] arr,int tam,boolean Orden){
        //caso base
        if (tam < 2) {
            return;
        }
        //se crea los arreglos y reparte en la mitad los elemnto del arreglo a
        int mid = tam / 2;
        int[] l = new int[mid];
        int[] r = new int[tam - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < tam; i++) {
            r[i - mid] = arr[i];
        }
        //llamada recursiva
        mergeSort(l, mid, Orden);
        mergeSort(r, tam - mid, Orden);
        //llamada al metodo de intercambio de elementos 
        merge_intercambiar(arr, l, r, mid, tam - mid,Orden);
    }
    @Override
    public void Ordenar(boolean orden) {
        int[] A = this.Arreglo;
        mergeSort(A, this.tamanio, orden);
        this.Arreglo = A;
    }
    
    
}
