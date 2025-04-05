import com.pintoneta.screenmatch.modelos.Pelicula;
import com.pintoneta.screenmatch.modelos.Serie;

public class Main {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();

        miPelicula.setNombre("DB Broly");
        miPelicula.setFechaLanzamiento(2018);
        miPelicula.setDuracionEnMinutos(120);


        miPelicula.mostrarDatos();
        miPelicula.evaluarPelicula(7.5f);
        miPelicula.evaluarPelicula(9.5f);
        miPelicula.evaluarPelicula(8f);

        System.out.println(miPelicula.calcularMedia());
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());

        Serie dragonBallSuper = new Serie();
        dragonBallSuper.setNombre("Dragon Ball Super");
        dragonBallSuper.setFechaLanzamiento(2015);
        dragonBallSuper.setTemporadas(1);
        dragonBallSuper.setMinutosPorEpisodio(24);
        dragonBallSuper.setEpisodiosPortemporada(150);

        dragonBallSuper.mostrarDatos();
        System.out.println(dragonBallSuper.getDuracionEnMinutos());
    }
}
