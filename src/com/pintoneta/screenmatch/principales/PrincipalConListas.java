package com.pintoneta.screenmatch.principales;

import com.pintoneta.screenmatch.modelos.Pelicula;
import com.pintoneta.screenmatch.modelos.Serie;
import com.pintoneta.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {

    public static void main(String[] args) {

        Pelicula favorita = new Pelicula("El señor de los anillos", 2001);
        favorita.evaluarPelicula(10);

        Pelicula otra = new Pelicula("John Wick", 2014);
        otra.evaluarPelicula(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorita);
        lista.add(otra);
        lista.add(serie);

        for(Titulo item : lista) {
            System.out.println("Nombre: " + item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println("Clasificacion: " + pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistias = new ArrayList<>();

        listaDeArtistias.add("Penelope Cruz");
        listaDeArtistias.add("Antonio Banderas");
        listaDeArtistias.add("Ricardo Darin");

        Collections.sort(listaDeArtistias);
        System.out.println(listaDeArtistias);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println("lista ordenada por fecha: " + lista);
    }
}
