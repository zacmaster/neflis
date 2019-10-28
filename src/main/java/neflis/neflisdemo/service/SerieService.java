package neflis.neflisdemo.service;

import neflis.neflisdemo.model.Season;
import neflis.neflisdemo.model.Serie;
import neflis.neflisdemo.util.CustomObjectMapper;
import neflis.neflisdemo.util.Util;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;

@Service
public class SerieService {
    private ArrayList<Serie> series;

    public SerieService(){}

    @PostConstruct
    private void loadSeries(){
        if(this.series == null){
            this.series = new ArrayList<>();

            String serie1 = Util.URL_CONTENT + "breaking+bad";
            String serie2 = Util.URL_CONTENT + "you";
            String serie3 = Util.URL_CONTENT + "prison+break";

            configureSerie(serie1);
            configureSerie(serie2);
            configureSerie(serie3);
        }

    }


    public ArrayList<Serie> getSeries() {
        return series;
    }

    private Serie getSerie(String url){
        String json = Util.getResponse(url).getBody().toString();
        CustomObjectMapper om = new CustomObjectMapper();
        try {
            return  om.readValue(json, Serie.class);
        } catch (IOException e) {
            //log + tirar la excepcion
            e.printStackTrace();
        }
        return null;
    }

    private void configureSerie(String urlSerie) {
        Serie serie = getSerie(urlSerie);
        ArrayList<Season> seasons = new ArrayList<>();
        int counter = 1;
        while (counter <= serie.getNumberOfSeasons()) {
            seasons.add(getSeason(urlSerie + "&season=" + counter));
            counter++;
        }
        serie.setSeasons(seasons);
        this.series.add(serie);

    }

    private Season getSeason(String url){
        String json = Util.getResponse(url).getBody().toString();
        CustomObjectMapper om = new CustomObjectMapper();
        try {
            return  om.readValue(json, Season.class);
        } catch (IOException e) {
            //log + tirar la excepcion
            e.printStackTrace();
        }
        return null;
    }

}
