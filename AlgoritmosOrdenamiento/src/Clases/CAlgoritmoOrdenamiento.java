package Clases;

public class CAlgoritmoOrdenamiento implements IAlgoritmoOrdenamiento{
    protected int[] Arreglo;
    protected int tamanio;
    public CAlgoritmoOrdenamiento(int[] arreglo) {
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Ordenar(boolean orden) {
        // TODO Auto-generated method stub
        
    }
}
