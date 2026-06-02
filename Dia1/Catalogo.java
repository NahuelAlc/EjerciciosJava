import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;


public class Catalogo{

    static Map<String, ArrayList<Pelicula>> peliculas = new HashMap<String, ArrayList<Pelicula>>();

    // [genero, [pelicula1, pelicula2, pelicula3]]

    public void alta(String genero, Pelicula pelicula){
        ArrayList<Pelicula> arrayPeliculas = peliculas.get(genero);
        arrayPeliculas.add(pelicula);
    }

    public void bajas(String genero, Pelicula pelicula){
        peliculas.get(genero).remove(pelicula);
    }
    
}