package neflis.neflisdemo.model;

import neflis.Pelicula;
import neflis.Serie;

import java.io.Serializable;
import java.util.List;

public class Contenido implements Serializable {
    private Integer id;
    private String title;
    private Integer year;
    private Integer duration;
    private String genre;
    private String directors;
    private String actors;
    private String plot;
    private String seasons;

    private List<Pelicula> peliculas;
    private List<Serie> series;

    public Contenido( List<Pelicula> peliculas, List<Serie> series)
    {
        this.peliculas=peliculas;
        this.series=series;
    }


}
