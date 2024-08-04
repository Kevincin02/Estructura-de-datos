package proyectog7;

import javax.swing.JOptionPane;

public class Reserva {

    private NodoReserva inicio;
    private NodoReserva fin;
    private int contadorReserva;
    private Habitacion[][] habitaciones;

    public Reserva() {
        this.inicio = null;
        this.fin = null;
        this.contadorReserva = 1;
        this.habitaciones = new Habitacion[4][6];
        iniciarHabitaciones();
    }

    private void iniciarHabitaciones() {
        for (int piso = 0; piso < 4; piso++) {
            for (int hab = 0; hab < 6; hab++) {
                habitaciones[piso][hab] = new Habitacion(hab + 1);
                if (hab < 3) {
                    habitaciones[piso][hab].setOcupada(true);
                }
            }
        }
    }

    public boolean vacia() {
        return inicio == null;
    }

    public void agregarReserva() {
        DatosReserva dr = new DatosReserva();
        dr.setNumeroReserva(contadorReserva++);
//Datos del dueno
        dr.setNombreDueno(JOptionPane.showInputDialog("Ingrese el nombre del dueño: "));
        dr.setCorreo(JOptionPane.showInputDialog("Ingrese el correo del dueño: "));
        dr.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de telefono del dueno")));
//Datos de la Mascota
        dr.setNombreMascota(JOptionPane.showInputDialog("Ingrese el nombre de la mascota: "));
        dr.setRaza(JOptionPane.showInputDialog("Ingrese la raza de la mascota: "));
        dr.setEdad(Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad de la mascota")));
        dr.setDieta(JOptionPane.showInputDialog("Ingrese la dieta que requiere la mascota: "));
//Datos de la Reserva
        dr.setFechasIngreso(JOptionPane.showInputDialog("Ingrese la fecha de ingreso (dd/mm/yyyy):"));
        dr.setFechasSalida(JOptionPane.showInputDialog("Ingrese la fecha de salida (dd/mm/yyyy):"));
        dr.setHoraIngreso(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora de ingreso (hhmm):")));
        dr.setHoraSalida(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora de salida (hhmm):")));
        
        String[] actividades = {"Piscina", "Peluquería", "Manicura", "Carreras"};
        int actividad = JOptionPane.showOptionDialog(null, "Seleccione la actividad: ", "Actividades",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, actividades, actividades[0]);
        dr.setActividad(actividades[actividad]);
        
        int piso = actividad;
        StringBuilder disponibilidad = new StringBuilder();
        for (int hab = 0; hab < 6; hab++) {
            if (!habitaciones[piso][hab].isOcupada()) {
                disponibilidad.append("  Habitación ").append(hab + 1).append("\n");
            }
        }

        int habitacionSeleccionada = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una habitación disponible:\n" + disponibilidad.toString()));
        habitaciones[piso][habitacionSeleccionada - 1].setOcupada(true);

        NodoReserva nuevo = new NodoReserva(dr);
        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }

        JOptionPane.showMessageDialog(null, "La reserva se a realizado de forma exitosa!! ");
    }

    public void modificarReserva() {

    }

    public void eliminarReserva() {

    }

    public void mostrarReservas() {

    }

    public void mostrarDisponibilidad() {
        StringBuilder dis = new StringBuilder();
        String[] actividades = {"Piscina", "Peluqueria", "Manicura", "Carreras"};

        for (int piso = 0; piso < 4; piso++) {
            dis.append("piso").append(piso + 1).append("(").append(actividades[piso]).append("):\n");
            for (int hab = 0; hab < 6; hab++) {
                dis.append(" Habitacion ").append(hab + 1).append(": ").append(habitaciones[piso][hab].isOcupada() ? "Ocupada" : "Disponible")
                        .append("\n");
            }
            dis.append("\n");
        }
        JOptionPane.showMessageDialog(null, dis.toString(), "Disponibilidad de habitaciones", JOptionPane.INFORMATION_MESSAGE);
    }
}
