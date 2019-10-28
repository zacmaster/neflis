package neflis.neflisdemo.model;

import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;

public abstract class Contenido {
    private String id;
    private String title;
    private String year;

    @JsonSetter("Runtime")
    private String duration;

    private String genre;
    private String director;
//    private ArrayList<String> actors;
    private String actors;
    private String plot;

    public Contenido(String id, String title, String year, String duration, String genre, String director, String actors, String plot) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.plot = plot;
    }

    public Contenido(){}


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
}
