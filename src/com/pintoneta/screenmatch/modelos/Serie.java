package com.pintoneta.screenmatch.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private int episodiosPortemporada;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPortemporada * minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPortemporada() {
        return episodiosPortemporada;
    }

    public void setEpisodiosPortemporada(int episodiosPortemporada) {
        this.episodiosPortemporada = episodiosPortemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
