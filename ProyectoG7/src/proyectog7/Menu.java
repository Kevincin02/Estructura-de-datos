package proyectog7;

import javax.swing.JOptionPane;

public class Menu {

    private Reserva reserva;
    private String[] botones = {"Agregar", "Modificar", "Eliminar", "Mostrar", "Disponibilidad", "Salir"};

    public Menu() {
        this.reserva = new Reserva();
    }

    public void Menu() {
        int op;
        do {
            op = JOptionPane.showOptionDialog(null, "Selecciones una opcion: ", "Menú Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                    botones, botones[0]);
            switch (op) {
                case 0:
                    reserva.agregarReserva();
                    break;
                case 1:
                    reserva.modificarReserva();
                    break;
                case 2:
                    reserva.eliminarReserva();
                    break;
                case 3:
                    reserva.mostrarReservas();
                    break;
                case 4:
                    reserva.mostrarDisponibilidad();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
            }
        } while (op != 3);
    }
}
