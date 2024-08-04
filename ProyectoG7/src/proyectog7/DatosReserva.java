package proyectog7;

public class DatosReserva {

    //Datos del cliente/dueño de la mascota
    private String nombreDueno;
    private String correo;
    private int telefono;

    //Datos de la mascota
    private String nombreMascota;
    private String raza;
    private int edad;
    private String dieta;

    //Datos de la reserva
    private int numeroReserva;
    private String fechasIngreso;
    private String fechasSalida;
    private int horaIngreso;
    private int horaSalida;
    private String actividad; // piscina, peluqueria, manicura, carreras

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public String getFechasIngreso() {
        return fechasIngreso;
    }

    public void setFechasIngreso(String fechasIngreso) {
        this.fechasIngreso = fechasIngreso;
    }

    public String getFechasSalida() {
        return fechasSalida;
    }

    public void setFechasSalida(String fechasSalida) {
        this.fechasSalida = fechasSalida;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    
}
