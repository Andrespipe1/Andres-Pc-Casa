package Examen_Individual;

public class Hotel {
    private String nombre;
    private String direccion;
    private Double calificacion;

    // Constructor con parámetros
    public Hotel(String nombre, String direccion, Double calificacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.calificacion = calificacion;
    }

    // Constructor sin parámetros
    public Hotel() {
        this.nombre = null;
        this.direccion = null;
        this.calificacion = null;
    }

    // Métodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    // Método para modificar todos los atributos
    public void modificarHotel(String nombre, String direccion, Double calificacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.calificacion = calificacion;
    }

    // Método para imprimir los detalles del hotel
    public void imprimirHotel() {
        System.out.println("Nombre: " + nombre + ", Dirección: " + direccion + ", Calificación: " + calificacion);
    }
}
