package Clases;

public class CAlgoritmoHeapSort implements IAlgoritmoOrdenamiento{
    private int[] Arreglo;
    private int tamanio;
    /**
     * 
     * @param arreglo
     */
    public CAlgoritmoHeapSort(int[] arreglo) {
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
    /**
     * @param orden true: ordena descendente
     */
    @Override
    public void Ordenar(boolean orden) {
        int posPadre,posHijoIzq,posHijoDer;
        int Aux;
        int n = tamanio-1;
        if (n == 0)
        {
            return ;
        }
        do
        {
            // Hallamos la posicion del ultimo padre
            posPadre = (n - 1) / 2;
            for (int k = posPadre; k >= 0; k--)
            {
                // hallamos la posicion de sus hijos
                posHijoIzq = 2 * k + 1;
                posHijoDer = 2 * k + 2;
                int IndInter = -1;
                // caso que tenga 2 hijos
                if (posHijoIzq < n + 1 && posHijoDer < n + 1)
                {
                    if(orden == false){
                        if (this.Arreglo[posHijoDer] > this.Arreglo[posHijoIzq])
                        {
                            IndInter = posHijoDer;
                        }
                        else
                        {
                            IndInter = posHijoIzq;
                        }
                    }
                    else{
                        if (this.Arreglo[posHijoDer] < this.Arreglo[posHijoIzq])
                        {
                            IndInter = posHijoDer;
                        }
                        else
                        {
                            IndInter = posHijoIzq;
                        }
                    }
                }
                // caso un solo hijo : solo tiene el hijo izquierdo
                else
                {
                    if (posHijoIzq < n + 1)
                    {
                        IndInter = posHijoIzq;
                    }

                }
                // intercambiamos mayor de los hijos por el padre , en caso sea mayor que el padre
                if (IndInter != -1)
                {
                    if(orden == false){
                        if (this.Arreglo[k] < this.Arreglo[IndInter])
                        {
                            Aux = this.Arreglo[k];
                            this.Arreglo[k] = this.Arreglo[IndInter];
                            this.Arreglo[IndInter] = Aux;
                        }
                    }
                    else{
                        if (this.Arreglo[k] > this.Arreglo[IndInter])
                        {
                            Aux = this.Arreglo[k];
                            this.Arreglo[k] = this.Arreglo[IndInter];
                            this.Arreglo[IndInter] = Aux;
                        }
                    }
                }

            }
            // cambiamos el mayor por el ultimo elemento del arreglo
            Aux = this.Arreglo[0];
            this.Arreglo[0] = this.Arreglo[n];
            this.Arreglo[n] = Aux;
            // descartamos el ultimo elemento
            n--;
        } while (n > 0);
    }

    @Override
    public void MostrarArreglo() {
        for (int k = 0; k < this.tamanio; k++){
            System.out.print(this.Arreglo[k] + " ");
        }
        System.out.println();
    }
    
}
