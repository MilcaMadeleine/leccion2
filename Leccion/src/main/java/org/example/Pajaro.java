package org.example;

public class Pajaro extends Animal implements Volador {
    private String nombre;

    public Pajaro(String nombre) {
        this.nombre = nombre;
    }

    public String cantar(String tipo) {
        return nombre + " está cantando : " + tipo;
    }

    @Override
    public void comer() {
        System.out.println(nombre + " esta comiendo insectos.");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando sobre las montañas.");
    }

}