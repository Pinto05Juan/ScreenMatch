package com.pintoneta.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nombre;
    private int fechaLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private float sumaDeLasEvaluaciones = 0;
    private int totalDeLasEvaluaciones;

    public Titulo(String nombre, int fechaLanzamiento) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void mostrarDatos() {
        System.out.println("El nombre de la pelicula es: " + this.nombre);
        System.out.println("Su fecha de lanzamiento es: " + this.fechaLanzamiento);
        System.out.println("Su duracion en minutos es: " + getDuracionEnMinutos());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void evaluarPelicula(float nota) {
        this.sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    public float calcularMedia() {
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

    public int getTotalDeLasEvaluaciones () {
        return totalDeLasEvaluaciones;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
