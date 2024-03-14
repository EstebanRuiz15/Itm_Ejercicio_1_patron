package Manejadores;

public class Dispensarbilletes {
    private ManejadorBase manejador;

    public Dispensarbilletes() {
        chainofresponsability();
    }

    private void chainofresponsability() {
        ManejadorBase manejador100000 = new Manejador100k();
        ManejadorBase manejador50000 = new Manejador50k();
        ManejadorBase manejador20000 = new Manejador20k();
        ManejadorBase manejador10000 = new Manejador10k();
        ManejadorBase manejador5000 = new Manejador5k();

        manejador100000.setSiguiente(manejador50000);
        manejador50000.setSiguiente(manejador20000);
        manejador20000.setSiguiente(manejador10000);
        manejador10000.setSiguiente(manejador5000);

        manejador = manejador100000;

    }

    public void retirar(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("la cantidad a retirar debe ser mayor a 0");
            return;
        }
        manejador.manejarSolicitud(cantidad);
    }
}
