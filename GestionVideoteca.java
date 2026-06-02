import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class GestionVideoteca implements GestionVideotecaInterfaz{

    Map<String, ArrayList<Pelicula>> peliculas = new HashMap<>(); // [genero, [pelicula1, pelicula2, pelicula3]]

    @Override
    public void registrarPelicula(String genero, Pelicula pelicula){
        if(!peliculas.containsKey(genero)){
            peliculas.put(genero, new ArrayList<>());
        }
        peliculas.get(genero).add(pelicula);
    }
    @Override
    public void bajaPelicula(String genero, Pelicula pelicula){
        if(!peliculas.containsKey(genero)){
            throw new RuntimeException("Ese genero no existe");
        }
        peliculas.get(genero).remove(pelicula);
    }
    @Override
    public void actualizarPuntuacion(String genero, String codigoPelicula, double nuevaPuntuacion){
        if(peliculas.containsKey(genero)){
            ArrayList<Pelicula> actualizarPelicula = peliculas.get(genero);
            for(Pelicula peli : actualizarPelicula){
                if(codigoPelicula.equals(peli.getCodigoPelicula())){
                    peli.setPuntuacion(nuevaPuntuacion);
                    break;
                }
            }
            throw new RuntimeException("No existe ese código.");
        }
        else throw new RuntimeException("No existe ese género.");
    }
    @Override
    public Pelicula buscarPorCodigo(String genero, String codigoPelicula){
        if(peliculas.containsKey(genero)){
            ArrayList<Pelicula> obtenerPeliculas = peliculas.get(genero);
            for(Pelicula peli : obtenerPeliculas){
                if (peli.getCodigoPelicula().equals(codigoPelicula)){
                    return peli;
                }
            }
            return null;
        }
        else throw new RuntimeException("No existe ese género.");
    }
}