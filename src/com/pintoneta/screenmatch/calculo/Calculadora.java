package com.pintoneta.screenmatch.calculo;

import com.pintoneta.screenmatch.modelos.Titulo;

public class Calculadora {
    private int tiempoTotal;

    public void incluirTitulo(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
