import javax.swing.JOptionPane;

import Manejadores.Dispensarbilletes;

public class App {
    public static void main(String[] args) {
        int cantidad;
        do {
            String can = JOptionPane.showInputDialog("Por favor digite la cantidad a retirar");
            cantidad = Integer.parseInt(can);
            if (cantidad % 5000 != 0) {
                JOptionPane.showMessageDialog(null, "El valor no es multiplo de 5000 "
                        + "\nPor favor ingrese un valor valido");

            }
        } while (cantidad % 5000 != 0);

        Dispensarbilletes dispensar = new Dispensarbilletes();
        dispensar.retirar(cantidad);
    }
}
