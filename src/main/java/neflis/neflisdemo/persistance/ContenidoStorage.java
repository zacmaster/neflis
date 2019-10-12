package neflis.neflisdemo.persistance;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import neflis.Contenido;
import neflis.neflisdemo.model.ContenidoApi;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
@Component
public class ContenidoStorage {
    private ObjectMapper objectMapper;
    public ContenidoStorage(ObjectMapper objectMapper){this.objectMapper=objectMapper;}

     public ContenidoApi contents(){
        try { return objectMapper.readValue(
             new URL("http://www.omdbapi.com/?i=tt3896198&apikey=4823c028") , // + URLEncoder.encode(selectedItem, "UTF-8")).openStream());
                new TypeReference<List<Contenido>>() {});

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);}}


      private ContenidoApi getContents()
    {
        final String uri = "http://www.omdbapi.com/?i=tt3896198&apikey=4823c028";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return contents();

    }
      /* public void agregarContentss (List <ContenidoApi> contents){
        try {
            objectMapper.writeValue(
                    new File("src/main/resources/contents.json"), contents);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);*/

        }