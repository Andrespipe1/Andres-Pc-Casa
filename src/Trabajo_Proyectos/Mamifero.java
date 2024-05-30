package Trabajo_Proyectos;

public class Mamifero extends Animal {
    private boolean tienePelo;

    public Mamifero(String nombre, int edad, boolean tienePelo) {
        super(nombre, edad);
        this.tienePelo = tienePelo;
    }

    public boolean isTienePelo() {
        return tienePelo;
    }

    public void setTienePelo(boolean tienePelo) {
        this.tienePelo = tienePelo;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El mamífero hace un sonido.");
    }

    @Override
    public void moverse() {
        System.out.println("El mamífero se está moviendo.");
    }
}
