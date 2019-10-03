package neflis;

import java.util.List;


public class Temporada implements Contenido {
    private List<Capitulo> capitulo;
    Integer numTemp;
    private Integer duracion;
    public String genero;

   /* private String id;
    private Integer number;
    private Integer duration;
    private List<Capitulo> episodes;

    public Temporada(String id, Integer number, Integer duration, List<Capitulo> episodes) {
        this.id = id;
        this.number=number;
        this.duration=duration;
        this.episodes=episodes;
    }*/

    public Temporada(Integer numTemp, List<Capitulo>capitulo){
        this.capitulo=capitulo;
        this.numTemp=numTemp;
    }
    public Serie serie;
    public void setSerie(Serie serie){this.serie=serie;}
    public Boolean fueVistoCompletaX(Usuario usuario) {
        return this.capitulo.stream().
                allMatch( capitulo -> capitulo.fueVistoCompletaX( usuario ) );
    }
    public Temporada(Serie serie){this.serie=serie;}
    public void setGenero(String genero){this.genero=genero;}

    public String genero() {
        return this.serie.genero();}


    /**obtengo duracion de cada capitulo sumado**/
    public Integer duracion(){
        return capitulo.stream().map( c -> c.duracion() ).reduce( 0, Integer::sum );

    }
    /**Obtengo ultimo cap de la serie**/
    public Capitulo ultimoCapituloSerie() {
        return capitulo.get(capitulo.size()-1); }

}

