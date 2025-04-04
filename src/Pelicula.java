public class Pelicula {
    String nombre;
    int fechaLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;


    public void mostrarDatos() {
        System.out.println("El nombre de la pelicula es: " + this.nombre);
        System.out.println("Su fecha de lanzamiento es: " + this.fechaLanzamiento);
    }
}
