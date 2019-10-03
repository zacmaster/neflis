package neflis;

import java.util.List;

public class Serie implements Contenido {
    String nombreSerie;
    private List<Temporada> temporadas;
    public String genero;
    public Integer duracion;

    /*private Integer id;
    private String title;
    private Integer year;
    private Integer duration;
    private String genre;
    private String directors;
    private String actors;
    private String plot;
    private List<Temporada> seasons;

    public Serie (Integer id, String title, Integer year, Integer duration, String genre, String directors, String actors, String plot, List<Temporada> seasons) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.directors = directors;
        this.actors = actors;
        this.plot = plot;
        this.seasons=seasons;
    }*/

    public Serie(String nombreSerie, List<Temporada> temporadas, String genero) {
        this.nombreSerie = nombreSerie;
        this.temporadas = temporadas;
        this.genero=genero;
    }
    public Boolean fueVistoCompletaX(Usuario usuario) {
        return this.temporadas.stream().
                allMatch( temporadas -> temporadas.fueVistoCompletaX( usuario ) );
    }
    public Integer duracion() {
        return temporadas.stream().map( t -> t.duracion() )
                .reduce( 0, Integer::sum );
    }
    /** 3 ejercicio**/
    public Capitulo ultimoCapituloSerie() {
        return temporadas.get( temporadas.size() - 1 ).ultimoCapituloSerie();
    }
    /** 4 ejercicio**/
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String genero() {
        return genero;
    }
    //public Boolean actorActuo(){}

}


