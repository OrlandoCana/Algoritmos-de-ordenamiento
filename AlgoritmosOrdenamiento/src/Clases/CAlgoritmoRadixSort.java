package Clases;

public class CAlgoritmoRadixSort extends CAlgoritmoOrdenamiento {
    
    /**
     * @param arreglo contiene numeros enteros
     */
    public CAlgoritmoRadixSort(int[] arreglo) {
        super(arreglo);
    }
    
    @Override
    public void Ordenar() {
        this.Ordenar(false);
    }

    @Override
    public void Ordenar(boolean orden) {
        int m = Mayor(this.Arreglo);
        for (int exp = 1; m / exp > 0; exp *= 10)
            County_Sort(this.Arreglo, exp, orden);
        if(orden){
            for(int k = 0; k < tamanio/2; k++){
                int aux = this.Arreglo[k];
                this.Arreglo[k] = this.Arreglo[tamanio - 1 - k];
                this.Arreglo[tamanio - 1 - k] = aux;
            }
        }
    }
    
    private static void County_Sort(int[] Array, int exp, boolean orden)
    {
        int[] Salida = new int[Array.length]; 
        int i;
        int[] ArrayCont = new int[10];
        for (i = 0; i < 10; i++)
            ArrayCont[i] = 0;
        for (i = 0; i < Array.length; i++)
            ArrayCont[(Array[i] / exp) % 10]++;
        for (i = 1; i < 10; i++)
            ArrayCont[i] += ArrayCont[i - 1];

        for (i = Array.length - 1; i >= 0; i--)
        {
            Salida[ArrayCont[(Array[i] / exp) % 10] - 1] = Array[i];
            ArrayCont[(Array[i] / exp) % 10]--;
        }
        for (i = 0; i < Array.length; i++)
            Array[i] = Salida[i];
    }
    private static int Mayor(int[] Array)
    {
        int Mayor= Array[0];
        for (int i = 1; i < Array.length; i++)
            if (Array[i] > Mayor)
                Mayor = Array[i];
        return Mayor;
    }
}
