package com.example.miappmaterialdesign;

public class Mascota {

    private int imagen;
    private String nombre;
    private int puntaje;

    public Mascota(int imagen, String nombre) {
        this.imagen = imagen;
        this.nombre = nombre;
    }

    public Mascota(int imagen, String nombre, int puntaje) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getImagen() { return imagen; }
    public void setIamgen(int imagen) { this.imagen = imagen; }
    public int getPuntaje() { return puntaje; }
    public void setPuntaje(int puntaje) { this.puntaje = puntaje; }
}
