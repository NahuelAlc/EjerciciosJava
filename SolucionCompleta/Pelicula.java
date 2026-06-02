
public class Pelicula{
    private String codigoPelicula;
    private String titulo;
    private String director;
    private int anioEstreno;
    private double puntuacion;

    //Getters & setters
    public String getTitulo(){
        return titulo;
    }
    public String getCodigoPelicula(){
        return codigoPelicula;
    }
    public double getPuntuacion(){
        return puntuacion;
    }
    public void setPuntuacion(double puntuacion){
        this.puntuacion = puntuacion;  
    }

    void Pelicula(String codigoPelicula, String titulo, String director, int anioEstreno, double puntuacion) { //fix main -> pelicula
        this.codigoPelicula = codigoPelicula;
        this.titulo = titulo;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.puntuacion = puntuacion;
    }
}