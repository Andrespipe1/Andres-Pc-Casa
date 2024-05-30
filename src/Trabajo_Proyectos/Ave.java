package Trabajo_Proyectos;

public class Ave extends Animal {
    private double envergaduraAlas;

    public Ave(String nombre, int edad, double envergaduraAlas) {
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }

    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(double envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El ave canta.");
    }

    @Override
    public void moverse() {
        System.out.println("El ave vuela.");
    }
}
