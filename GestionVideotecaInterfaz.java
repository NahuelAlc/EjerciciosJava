public interface GestionVideotecaInterfaz{
    public void registrarPelicula(String genero, Pelicula pelicula);
    public void bajaPelicula(String genero, Pelicula pelicula);
    public void actualizarPuntuacion(String genero, String codigoPelicula, double nuevaPuntuacion);
    public Pelicula buscarPorCodigo(String genero, String codigoPelicula);
}