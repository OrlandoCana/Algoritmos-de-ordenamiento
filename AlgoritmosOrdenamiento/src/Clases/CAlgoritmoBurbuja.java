package Clases;
/**
 * @author OrlandoCana
 * @version 1.0
 */
public class CAlgoritmoBurbuja extends CAlgoritmoOrdenamiento{
    /**
     * @param arreglo contiene numeros enteros
     */
    public CAlgoritmoBurbuja(int[] arreglo) {
        super(arreglo);
    }
    
    @Override
    public void Ordenar() {
        // ordenar ascendente
        this.Ordenar(false);
    }
    /**
     * @param orden true: ordena descendente
     */
    @Override
    public void Ordenar(boolean orden) {
        int i = 0;
        boolean valid = false;
        while (i < this.tamanio && valid == false){
            i += 1;
            valid = true;
            for (int j = 0; j < this.tamanio - i; j++){
                if(orden == false){
                    if(this.Arreglo[j] > this.Arreglo[j+1]){
                        valid = false;
                        // Intercambiar elemento j con el elemento j+1
                        int aux = this.Arreglo[j];
                        this.Arreglo[j] = this.Arreglo[j+1];
                        this.Arreglo[j+1] = aux;
                    }
                }
                else{
                    if(this.Arreglo[j] < this.Arreglo[j+1]){
                        valid = false;
                        // Intercambiar elemento j con el elemento j+1
                        int aux = this.Arreglo[j];
                        this.Arreglo[j] = this.Arreglo[j+1];
                        this.Arreglo[j+1] = aux;
                    }
                }
            }
        }
    }    
}
