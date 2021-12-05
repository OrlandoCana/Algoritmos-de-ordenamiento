package Clases;
/**
 * @author OrlandoCana
 * @version 1.0
 */
public class CAlgoritmoCountySort implements IAlgoritmoOrdenamiento{
    private int[] Arreglo;
    private int tamanio;
    /**
     * @param arreglo contiene numeros enteros
     */
    public CAlgoritmoCountySort(int[] arreglo) {
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
    public void Ordenar() {
        this.Ordenar(false);
    }

    @Override
    public void Ordenar(boolean orden) {
        County_Sort(this.Arreglo, 1, orden);
    }
    @Override
    public void MostrarArreglo() {
        for (int k = 0; k < this.tamanio; k++){
            System.out.print(this.Arreglo[k] + " ");
        }
        System.out.println();
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
        if(orden == false){
            for (i = 0; i < Array.length; i++)
                Array[i] = Salida[i];
        }
        else{
            for (i = 0; i < Array.length; i++)
                Array[i] = Salida[Array.length - 1 - i];
        }
    }
}
