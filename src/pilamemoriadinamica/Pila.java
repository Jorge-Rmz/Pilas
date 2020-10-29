
package pilamemoriadinamica;


public class Pila {
    private NodoPila cima;
    int tama;
    
    public Pila(){
        cima = null;
        tama = 0;
    }
    
    //Método para saber cuando la pila esta vacia
    public boolean estaVacia(){
        return cima == null;
    }
    
    //Método para insertar un elemento en la pila (Empujar)
    public void empujar(int elem){
        NodoPila nuevo = new NodoPila(elem);
        nuevo.siguiente = cima;
        cima = nuevo;
        tama++;
    }
    
    //Método para eliminar un elemento en la pila (pop)
    public int sacar(){
        int aux = cima.dato;
        cima = cima.siguiente;
        tama--;
        return aux;
    }
    
    //Métood para saber quien eseta en la cima de la pila
    public int cima(){
        return cima.dato;
    }
    
    //Metodo para saber el tamaño de la pila
    public int tamanoPila(){
        return tama;
    }
    
    //Metodo para limpiar la pila.
    public void LimpiarPila(){
        while(!estaVacia()){
            sacar();
        }
    }
    
}
