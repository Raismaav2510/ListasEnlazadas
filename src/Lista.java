public class Lista {
    private Nodo inicio;
    private Nodo fin;
    private int cuenta = 0;

    public Lista() {
        inicio = null;
        fin = null;
    }

    public int getcuentaNodos() {
        return cuenta;
    }

    public void insertarInicio(int dato) {
        Nodo actual;
        if (inicio == null) {
            actual = new Nodo (dato, null);
            inicio = actual;
            fin = actual;
            cuenta++;
        } else {
            actual = new Nodo (dato, inicio);
            inicio = actual;
            cuenta++;
        }
    }

    public void insertarFinal(int dato) {
        Nodo actual;
        if (inicio == null) {
            actual = new Nodo (dato, null);
            inicio = actual;
            fin = actual;
            cuenta++;
        } else {
            actual = new Nodo (dato, null);
            fin.setSiguiente(actual);
            fin = actual;
            cuenta++;
        }
    }

    public void insertarCentro(int dato) {
        int comparador = 0;
        int lugar = cuenta / 2;
        Nodo actual;
        Nodo siguiente;
        Nodo anterior;
        siguiente = inicio;
        anterior = inicio;
        siguiente = siguiente.getSiguiente();

        if(lugar == 1) {
            actual = new Nodo (dato, siguiente);
            anterior.setSiguiente(actual);
            actual.setSiguiente(siguiente);
            cuenta++;
        } else {
            anterior = anterior.getSiguiente();
            siguiente = siguiente.getSiguiente();
            while (comparador <= lugar - 1) {
                comparador++;
                if(comparador == lugar - 1) {
                    actual = new Nodo (dato, siguiente);
                    anterior.setSiguiente(actual);
                    actual.setSiguiente(siguiente);
                    cuenta++;
                }
                else {
                    siguiente = siguiente.getSiguiente();
                    anterior = anterior.getSiguiente();
                }
            }
        }
    }

    public void eliminarInicio() {
        if (inicio == null) {System.out.println("La lista no contiene nodos");}
        else {
            inicio = inicio.getSiguiente();
            cuenta--;
        }
    }

    public void eliminarFinal() {
        if (inicio == null){
            System.out.println("La lista no contiene nodos");
        }
        else {
            if(cuenta == 1) {
                inicio = inicio.getSiguiente();
                cuenta--;
            }
            else {
                int comparador = 0;
                Nodo temporal = inicio;
                while (comparador <= cuenta - 1) {
                    comparador++;
                    if(comparador == cuenta - 1) {
                        temporal.setSiguiente(null);
                        cuenta--;
                    }
                    else{
                        temporal = temporal.getSiguiente();
                    }
                }
            }
        }
    }

    public void mostrar() {
        if (inicio == null) {
            System.out.println("La lista no contiene nodos");
        } else {
            Nodo temporal = inicio;
            while (temporal != null) {
                System.out.println(temporal.getDato());
                temporal = temporal.getSiguiente();
            }
        }
    }

    public boolean buscar(int valor) {
        if (inicio == null) {
            System.out.println("La lista no contiene nodos");
            return false;
        } else {
            Nodo temporal = inicio;
            while (temporal!=null) {
                if (valor == temporal.getDato()){
                    return true;
                }

                temporal = temporal.getSiguiente();
            }
            if (temporal == null) {
                return false;
            }
        }
        return false;
    }
}
