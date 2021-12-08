package Clases;
/**
 * @author OrlandoCana
 * @version 1.0
 */
public class CAlgoritmoShellSort extends CAlgoritmoOrdenamiento{

    public CAlgoritmoShellSort(int[] arreglo) {
        super(arreglo);
    }

    @Override
    public void Ordenar() {
        this.Ordenar(false);
    }

    @Override
    public void Ordenar(boolean orden) {
        int n = tamanio;
        while (n / 2 > 0)
        {
            // distancia es n/2 
            for (int i = n / 2; i < tamanio; i += 1)
            {
                int Aux = this.Arreglo[i];
                int j = i;
                if(orden == false){
                    // si el elemento es mayor que el auxiliar cambiamos
                    while(j >= n / 2 && this.Arreglo[j - n / 2] > Aux)
                    {
                        this.Arreglo[j] = this.Arreglo[j - n / 2];
                        j -= n / 2;
                    }
                }
                else{
                    // si el elemento es menor que el auxiliar cambiamos
                    while(j >= n / 2 && this.Arreglo[j - n / 2] < Aux)
                    {
                        this.Arreglo[j] = this.Arreglo[j - n / 2];
                        j -= n / 2;
                    }
                }
                this.Arreglo[j] = Aux;
            }
            n /= 2;
        }
    }
    
    
}
