package neflis.neflisdemo.service;


import neflis.neflisdemo.model.Contenido;
import neflis.neflisdemo.model.ContenidoApi;
import neflis.neflisdemo.persistance.ContenidoStorage;
import neflis.neflisdemo.util.CustomObjectMapper;
import neflis.neflisdemo.util.Util;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContenidoService {
    public ContenidoStorage contenidoStorage;
    private List<ContenidoApi> contentsList;
    private List<Contenido> contenidos;

    public ContenidoService(ContenidoStorage contenidoStorage) {
        this.contenidoStorage = contenidoStorage;

    }


    public ContenidoService(){
        if(this.contenidos == null){
            this.contenidos = cargarContenidosIniciales();
        }
    }



    private ArrayList<Contenido> cargarContenidosIniciales(){

        ArrayList<Contenido> movies = new ArrayList<>();

        String movie1URL = Util.URL_API + "?t=braveheart&apikey=" +  Util.API_KEY;
        String movie2URL = Util.URL_API + "?t=titanic&apikey=" +  Util.API_KEY;
        String movie3URL = Util.URL_API + "?t=mask&apikey=" +  Util.API_KEY;

        Contenido c = getMovie(movie1URL);
        movies.add(c);
//        movies.add(getMovie(movie2URL));
//        movies.add(getMovie(movie3URL));


        return movies;


    }


    private Contenido getMovie(String movie){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(movie)
                .get()
                .build();

        Call call = client.newCall(request);
        Response response = null;
        try {
            response = call.execute();
            String json = response.body().string();

            CustomObjectMapper om =  new CustomObjectMapper();
            Contenido c = om.readValue(json,Contenido.class);
            return c;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public List<ContenidoApi> getContentsList() {
        contentsList = contenidoStorage.contents();
     return contentsList;
        /*if (contentsList == null) {
            contentsList = new ArrayList<>();
        }
        return contentsList;
    }*/
    }





    public void setContentsList(List<ContenidoApi> contentsList) {
        this.contentsList = contentsList;
    }

    /*public ContenidoApi contents() {
        return contents = contenidoStorage.contents();

    public ContenidoApi getcontents() {
        return contents;
    }

    public ContenidoApi agregarContents(ContenidoApi newcontents) {
        long count = contentsList.stream().count();
        int i=contentsList.stream().skip(count - 1).findFirst().get().getId();
        newcontents.setId(i+1);
        getContentsList().add(newcontents);
        this.contenidoStorage.agregarContentss(contentsList);
        return newcontents;
    }
*/
}