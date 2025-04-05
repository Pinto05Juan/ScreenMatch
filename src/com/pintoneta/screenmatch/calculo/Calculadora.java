package com.pintoneta.screenmatch.calculo;

import com.pintoneta.screenmatch.modelos.Pelicula;

public class Calculadora {
    private int tiempoTotal;

    public void incluirTitulo(Pelicula pelicula) {
        tiempoTotal += pelicula.getDuracionEnMinutos();
    }
}
