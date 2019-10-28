package neflis.neflisdemo.model;

import java.util.ArrayList;

public class Film extends Contenido{
    public Film(String id, String title, String year, String duration, String genre, String director, String actors, String plot) {
        super(id, title, year, duration, genre, director, actors, plot);
    }

    public Film() {
    }
}
