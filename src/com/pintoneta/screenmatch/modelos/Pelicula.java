package com.pintoneta.screenmatch.modelos;

import com.pintoneta.screenmatch.calculo.Clasificable;

public class Pelicula extends Titulo implements Clasificable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) calcularMedia() / 2;
    }
}
