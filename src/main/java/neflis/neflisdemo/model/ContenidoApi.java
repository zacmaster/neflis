package neflis.neflisdemo.model;

import neflis.Pelicula;
import neflis.Serie;


import java.io.Serializable;
import java.util.List;

public class ContenidoApi implements Serializable {
        private Integer id;
        private String Title;
        private String Year;
        private String Runtime;
        private String Genre;
        private String Director;
        private String Actors;
        private String Plot;
        private String Season;

        private List<Pelicula> peliculas;
        private List<Serie> series;

        public ContenidoApi(){};

        public ContenidoApi(Integer id, String Title, String Year, String Runtime, String Genre, String Director, String Actors, String Plot) {
            this.id = id;
            this.Title = Title;
            this.Year = Year;
            this.Runtime = Runtime;
            this.Genre = Genre;
            this.Director = Director;
            this.Actors = Actors;
            this.Plot = Plot;
        }
        /*public ContenidoApi(Integer id, String title, Integer year, Integer duration, String genre, String directors,
                         String actors, String plot, String season) {
            this.id = id;
            this.title = title;
            this.year = year;
            this.duration = duration;
            this.genre = genre;
            this.directors = directors;
            this.actors = actors;
            this.plot = plot;
            this.season=season;
        }*/

        public Integer getId() {
            return id.hashCode();
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String  getYear() {
            return Year;
        }

        public void setYear(String Year) {
            this.Year = Year;
        }

        public String getRuntime() {
            return Runtime;
        }

        public void setRuntime(String Runtime) {
            this.Runtime = Runtime;
        }

        public String getGenre() {
            return Genre;
        }

        public void setGenre(String genre) {
            this.Genre = Genre;
        }

        public String getDirectors() {
            return Director;
        }

        public void setDirectors(String Director) {
            this.Director = Director;
        }

        public String getActors() {
            return Actors;
        }

        public void setActors(String Actors) {
            this.Actors = Actors;
        }

        public String getPlot() {
            return Plot;
        }

        public void setPlot(String plot) {
            this.Plot = Plot;
        }

        /*public String getSeason() {
            return season;
        }

        public void setSeason(String season) {
            this.season = season;
        }*/
}
