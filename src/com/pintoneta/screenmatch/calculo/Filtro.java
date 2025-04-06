package com.pintoneta.screenmatch.calculo;

public class Filtro {

    public void filtrarClasificacion(Clasificable clasificacion) {
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Bien evaluada");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Evaluacion regular");
        } else {
            System.out.println("Colocar en su lista de peliculas para ver");
        }
    }
}
