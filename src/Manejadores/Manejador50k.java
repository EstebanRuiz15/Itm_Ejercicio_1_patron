package Manejadores;

public class Manejador50k extends ManejadorBase {
    private static final int Denominacion = 50000;

    @Override
    public void manejarSolicitud(int cantidad) {
        int Cantbilletes = (int) cantidad / Denominacion;
        if (Cantbilletes > 0) {
            System.out.println("Dispensando " + Cantbilletes + " billetes de " + Denominacion + "\n");
        }
        cantidad -= Cantbilletes * Denominacion;
        if (cantidad > 0 && siguiente != null) {
            siguiente.manejarSolicitud(cantidad);
        }
    }
}
