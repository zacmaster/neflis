package neflis.neflisdemo.service;


import neflis.neflisdemo.model.Contenido;
import neflis.neflisdemo.model.Film;
import neflis.neflisdemo.model.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Service
public class ContenidoService {
    @Autowired
    private FilmService filmService;

    @Autowired
    private SerieService serieService;

    private ArrayList<Contenido> contenidos;


    public ContenidoService(){}



    @PostConstruct
    private void loadContent(){
        if(this.contenidos == null){
            this.contenidos = new ArrayList<>();

            ArrayList<Film> films = filmService.getFilms();
            contenidos.addAll(films);

            ArrayList<Serie> series = serieService.getSeries();
            contenidos.addAll(series);
        }
    }

    public ArrayList<Contenido> getContenidos() {
        return contenidos;
    }
}