import com.pintoneta.screenmatch.calculo.Calculadora;
import com.pintoneta.screenmatch.calculo.Filtro;
import com.pintoneta.screenmatch.modelos.Episodio;
import com.pintoneta.screenmatch.modelos.Pelicula;
import com.pintoneta.screenmatch.modelos.Serie;

public class Main {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        Calculadora calculadora = new Calculadora();
        Pelicula otraPelicula = new Pelicula();
        Filtro filtroRecomendacion = new Filtro();
        Episodio episodio = new Episodio();

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

        otraPelicula.setNombre("Minecraft");
        otraPelicula.setFechaLanzamiento(2025);
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

    }
}
