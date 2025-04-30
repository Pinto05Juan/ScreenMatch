package com.pintoneta.screenmatch.modelos;

import com.pintoneta.screenmatch.exception.ErrorConvercionDuracionException;

public class Titulo implements Comparable<Titulo>{
    private String nombre;
    private int fechaLanzamiento;
    private int duracionEnMinutos;
    private float sumaDeLasEvaluaciones = 0;
    private int totalDeLasEvaluaciones;

    public Titulo(String nombre, int fechaLanzamiento) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")) {
            throw new ErrorConvercionDuracionException("No pude convetir la duracion, porque contiene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ", ""));
    }

    public void mostrarDatos() {
        System.out.println("El nombre de la pelicula es: " + this.nombre);
        System.out.println("Su fecha de lanzamiento es: " + this.fechaLanzamiento);
        System.out.println("Su duracion en minutos es: " + getDuracionEnMinutos());
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

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", fechaDeLanzamiento=" + fechaLanzamiento+
                ", duracion="+duracionEnMinutos;
    }
}
