package neflis.neflisdemo.service;

import neflis.neflisdemo.model.Film;
import neflis.neflisdemo.util.CustomObjectMapper;
import neflis.neflisdemo.util.Util;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;

@Service
public class FilmService{
    private ArrayList<Film> films;

    public FilmService(){}

    public ArrayList<Film> getFilms() {
        return films;
    }

    @PostConstruct
    private void loadFilms(){
        if(this.films == null){

            this.films = new ArrayList<>();

            String movie1URL = Util.URL_CONTENT + "braveheart";
            String movie2URL = Util.URL_CONTENT + "titanic";
            String movie3URL = Util.URL_CONTENT + "mask";

            films.add(getFilm(movie1URL));
            films.add(getFilm(movie2URL));
            films.add(getFilm(movie3URL));
        }
    }

    private Film getFilm(String url){
        String json = Util.getResponse(url).getBody().toString();
        CustomObjectMapper om =  new CustomObjectMapper();
        try {
            return  om.readValue(json, Film.class);
        } catch (IOException e) {
            //log + tirar la excepcion
            e.printStackTrace();
        }
        return null;
    }

}


