package neflis;

public class Capitulo extends ContenidoUnitario{
    protected Integer duracion;
   // protected String genero;
    protected String numeroCap;
    public Serie serie;

    private String id;
    private Integer number;
    private Integer duration;
    private String guest_actors;

    protected Capitulo(String numeroCap, String actores, Integer duracion) {
        this.actores=actores;
        this.duracion=duracion;
        this.numeroCap=numeroCap;}


    public void setSerie(Serie serie){this.serie=serie;}
    /*protected Capitulo(Temporada temporada){this.temporada=temporada;}*/
    public String genero;

    public Boolean fueVistoCompletaX(Usuario usuario){
        return usuario.getContenido().contains( usuario );}


    public void setGenero(String genero) {
        this.genero = genero;}

    public String genero() { return this.serie.genero();}

     /**tengo duracion de un capitulo**/
    public void setDuracion(Integer minutos) {
        duracion = duracion;
    }
    public Integer duracion() {
        return this.duracion;
    }
}




