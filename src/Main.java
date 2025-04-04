public class Main {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        Pelicula otraPelicula = new Pelicula();

        miPelicula.nombre = "DB Broly";
        miPelicula.fechaLanzamiento = 2018;
        miPelicula.duracionEnMinutos = 120;

        miPelicula.mostrarDatos();

        otraPelicula.nombre = "Saw";
        otraPelicula.fechaLanzamiento = 2021;
        //otraPelicula.mostrarDatos();
    }
}
