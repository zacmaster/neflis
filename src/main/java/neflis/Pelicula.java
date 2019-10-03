package neflis;

public class Pelicula extends ContenidoUnitario{

    public String genero;
    public Integer duracion;
    public Boolean actorActuo;

    /*private Integer id;
    private String title;
    private Integer year;
    private Integer duration;
    private String genre;
    private String directors;
    private String actors;
    private String plot;

    public Pelicula(Integer id, String title, Integer year, Integer duration, String genre, String directors, String actors, String plot) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.directors = directors;
        this.actors = actors;
        this.plot = plot;
    }*/


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

