package com.pintoneta.screenmatch.principales;

import com.pintoneta.screenmatch.calculo.Calculadora;
import com.pintoneta.screenmatch.calculo.Filtro;
import com.pintoneta.screenmatch.modelos.Episodio;
import com.pintoneta.screenmatch.modelos.Pelicula;
import com.pintoneta.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("DB Broly", 2018);
        Calculadora calculadora = new Calculadora();
        Pelicula otraPelicula = new Pelicula("Minecraft", 2025);
        Filtro filtroRecomendacion = new Filtro();
        Episodio episodio = new Episodio();

        miPelicula.setDuracionEnMinutos(120);

        miPelicula.mostrarDatos();
        miPelicula.evaluarPelicula(7.5f);
        miPelicula.evaluarPelicula(9.5f);
        miPelicula.evaluarPelicula(8f);

        System.out.println(miPelicula.calcularMedia());
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());

        Serie dragonBallSuper = new Serie("Dragon Ball Super", 2015);
        dragonBallSuper.setTemporadas(1);
        dragonBallSuper.setMinutosPorEpisodio(24);
        dragonBallSuper.setEpisodiosPortemporada(150);

        dragonBallSuper.mostrarDatos();
        System.out.println(dragonBallSuper.getDuracionEnMinutos());

        otraPelicula.setDuracionEnMinutos(90);

        calculadora.incluirTitulo(miPelicula);
        calculadora.incluirTitulo(dragonBallSuper);
        calculadora.incluirTitulo(otraPelicula);

        System.out.println(calculadora.getTiempoTotal());
        System.out.println("************************");
        System.out.println(miPelicula.getClasificacion());
        filtroRecomendacion.filtrarClasificacion(miPelicula);

        episodio.setNumeroEpisodio(1);
        episodio.setNombre("Goku vs Jiren");
        episodio.setSerie(dragonBallSuper);

        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtrarClasificacion(episodio);


        var peliculaDeJuan = new Pelicula("Pintoneta", 2024);

        peliculaDeJuan.setDuracionEnMinutos(360);

        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(peliculaDeJuan);
        listaPeliculas.add(miPelicula);
        listaPeliculas.add(otraPelicula);

        System.out.println(listaPeliculas.size());
        System.out.println("La primera peli es: " + listaPeliculas.getFirst().getNombre());

        System.out.println(listaPeliculas);

        System.out.println("toString de Pelicula: " + listaPeliculas.getFirst().toString());
    }
}
