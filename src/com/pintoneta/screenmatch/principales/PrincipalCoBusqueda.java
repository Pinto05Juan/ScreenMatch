package com.pintoneta.screenmatch.principales;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pintoneta.screenmatch.exception.ErrorConvercionDuracionException;
import com.pintoneta.screenmatch.modelos.Titulo;
import com.pintoneta.screenmatch.modelos.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalCoBusqueda {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true) {
            System.out.println("Ingrese el nombre de una pelicula: ");
            String busqueda = scan.nextLine();

            if(busqueda.equalsIgnoreCase("salir")) {
                break;
            }

            final String API_KEY = "a92f8f4f";

            String url = "https://www.omdbapi.com/?t=" + busqueda.replace(" ", "+") + "&apikey=" + API_KEY;

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                //System.out.println(json);

                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                //System.out.println(miTituloOmdb);

                Titulo miTitulo = new Titulo(miTituloOmdb);
                //System.out.println(miTitulo);
                titulos.add(miTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Ocurrio un error: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e ) {
                System.out.println("Error en la URI, verique la direccion");
            } catch (ErrorConvercionDuracionException e) {
                System.out.println(e.getMessage());
            }
        }

        FileWriter writer = new FileWriter("titulos.json");
        writer.write(gson.toJson(titulos));
        writer.close();
        scan.close();
        System.out.println("Finalizo el programa");
    }
}
