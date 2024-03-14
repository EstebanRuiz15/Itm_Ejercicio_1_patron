package Manejadores;

abstract class ManejadorBase implements IManejador {
    protected IManejador siguiente;

    public void setSiguiente(IManejador siguiente) {
        this.siguiente = siguiente;
    }

}
