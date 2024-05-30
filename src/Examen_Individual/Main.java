package Examen_Individual;

public class Main {
    public static void main(String[] args) {
        // Crear 5 instancias de la clase Hotel con valores iniciales
        Hotel hotel1 = new Hotel("Hotel A", "Calle 1", 4.5);
        Hotel hotel2 = new Hotel("Hotel B", "Calle 2", 4.0);
        Hotel hotel3 = new Hotel("Hotel C", "Calle 3", 3.5);
        Hotel hotel4 = new Hotel("Hotel D", "Calle 4", 5.0);
        Hotel hotel5 = new Hotel("Hotel E", "Calle 5", 4.2);

        // Crear dos objetos con valores nulos y posteriormente setear sus valores
        Hotel hotel6 = new Hotel();
        Hotel hotel7 = new Hotel();

        hotel6.setNombre("Hotel F");
        hotel6.setDireccion("Calle 6");
        hotel6.setCalificacion(3.8);

        hotel7.setNombre("Hotel G");
        hotel7.setDireccion("Calle 7");
        hotel7.setCalificacion(4.1);

        // Almacenar todos los hoteles en un array
        Hotel[] hoteles = {hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7};

        // Modificar los objetos previamente creados
        hotel6.modificarHotel("Hotel F Modificado", "Calle 6 Modificada", 3.9);
        hotel7.modificarHotel("Hotel G Modificado", "Calle 7 Modificada", 4.2);

        // Imprimir todos los objetos
        imprimirTodosLosHoteles(hoteles);

        // Modificar todos los atributos de al menos tres objetos con el valor de null
        modificarTresHotelesConNulos(hoteles);

        // Imprimir los objetos nuevamente para mostrar los cambios
        System.out.println("\nDespués de modificar tres hoteles con valores nulos:");
        imprimirTodosLosHoteles(hoteles);
    }

    // Método para imprimir todos los hoteles
    public static void imprimirTodosLosHoteles(Hotel[] hoteles) {
        for (Hotel hotel : hoteles) {
            hotel.imprimirHotel();
        }
    }

    // Método para modificar todos los atributos de tres hoteles con valores nulos
    public static void modificarTresHotelesConNulos(Hotel[] hoteles) {
        for (int i = 0; i < 3 && i < hoteles.length; i++) {
            hoteles[i].modificarHotel(null, null, null);
        }
    }
}
