package Manejadores;

class Manejador100k extends ManejadorBase {
    private static final int Denominacion = 100000;

    @Override
    public void manejarSolicitud(int cantidad) {
        int Cantbilletes = cantidad / Denominacion;
        if (Cantbilletes > 0) {
            System.out.println("Dispensando " + Cantbilletes + " billetes de " + Denominacion + "\n");
        }
        cantidad -= Cantbilletes * Denominacion;
        if (cantidad > 0 && siguiente != null) {
            siguiente.manejarSolicitud(cantidad);
        }
    }

}