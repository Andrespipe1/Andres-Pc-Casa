package Trabajo_Proyectos;

public class Main {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero("León", 5, true);
        Ave ave = new Ave("Águila", 3, 2.1);

        System.out.println("Detalles del Mamífero:");
        System.out.println("Nombre: " + mamifero.getNombre());
        System.out.println("Edad: " + mamifero.getEdad());
        System.out.println("Tiene Pelo: " + mamifero.isTienePelo());
        mamifero.hacerSonido();
        mamifero.moverse();

        System.out.println("\nDetalles del Ave:");
        System.out.println("Nombre: " + ave.getNombre());
        System.out.println("Edad: " + ave.getEdad());
        System.out.println("Envergadura de Alas: " + ave.getEnvergaduraAlas() + " metros");
        ave.hacerSonido();
        ave.moverse();
    }
}

