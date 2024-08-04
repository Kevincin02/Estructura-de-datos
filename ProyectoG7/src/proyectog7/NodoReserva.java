package proyectog7;

public class NodoReserva {

    private DatosReserva dato;
    private NodoReserva siguiente;
    private NodoReserva anterior;

    public NodoReserva(DatosReserva dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public DatosReserva getDato() {
        return dato;
    }

    public void setDato(DatosReserva dato) {
        this.dato = dato;
    }

    public NodoReserva getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoReserva siguiente) {
        this.siguiente = siguiente;
    }

    public NodoReserva getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoReserva anterior) {
        this.anterior = anterior;
    }

}
