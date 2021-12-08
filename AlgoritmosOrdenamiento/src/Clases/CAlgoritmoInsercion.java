package Clases;
/**
 * @author OrlandoCana
 * @version 1.0
 */
public class CAlgoritmoInsercion extends CAlgoritmoOrdenamiento{
    
    /**
     * 
     * @param arreglo
     */
    public CAlgoritmoInsercion(int[] arreglo) {
        super(arreglo);
    }

    @Override
    public void Ordenar() {
        this.Ordenar(false);
    }
    /**
     * @param orden true: ordena descendente
     */
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
}
