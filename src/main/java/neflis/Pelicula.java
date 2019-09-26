package neflis;

public class Pelicula extends ContenidoUnitario{

    public String genero;
    public Integer duracion;
    public Boolean actorActuo;

    protected Pelicula(Integer duracion, String actores, String genero){
        this.duracion=duracion;
        this.actores=actores;
        this.genero=genero;
    }
    public Boolean fueVistoCompletaX(Usuario usuario){
        return usuario.getContenido().contains( usuario );}

    public void setGenero(String genero) {
        this.genero = genero;}
    public String genero() {
        return genero;}

    public Integer duracion() {
        return duracion;
    }
    //protected Boolean generoMasVisto() {
     //   return generoMasVisto();
    public String getActor(){return actores;}}
    //public Boolean actorActuo(Contenido contenidoVisto){

