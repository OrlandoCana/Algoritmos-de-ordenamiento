package Clases;
/**
 * @author OrlandoCana
 * @version 1.0
 */
public class CAlgoritmoInsercion implements IAlgoritmoOrdenamiento{
    private int[] Arreglo;
    private int tamanio;
    /**
     * 
     * @param arreglo
     */
    public CAlgoritmoInsercion(int[] arreglo) {
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
        for (int k = 0; k < this.tamanio; k++){
            int elemento = this.Arreglo[k];
            int j = k - 1;
            if (orden == false){
                while (j >=0 && this.Arreglo[j] > elemento){
                    this.Arreglo[j+1] = this.Arreglo[j];
                    j -= 1;
                }
            }
            else{
                while (j >=0 && this.Arreglo[j] < elemento){
                    this.Arreglo[j+1] = this.Arreglo[j];
                    j -= 1;
                }
            }
            this.Arreglo[j+1] = elemento;
        }
    }
    @Override
    public void MostrarArreglo() {
        for (int k = 0; k < this.tamanio; k++){
            System.out.print(this.Arreglo[k] + " ");
        }
        System.out.println();
    }
    
}
