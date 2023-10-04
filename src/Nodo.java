public class Nodo {

    private Nodo siguiente;
    private int dato;

    public Nodo(int dato, Nodo siguiente) {

        this.siguiente = siguiente;
        this.dato = dato;
    }

    public void setSiguiente(Nodo next) {this.siguiente = next;}
    public void setDato(int date) {this.dato = date;}

    public int getDato() {return dato;}
    public Nodo getSiguiente() {return siguiente;}
}
