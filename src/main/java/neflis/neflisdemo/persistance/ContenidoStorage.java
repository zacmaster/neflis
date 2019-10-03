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

    public List<ContenidoApi> contents(){
        try { return objectMapper.readValue(
             new URL("http://www.omdbapi.com/?i=tt3896198&apikey=4823c028") , // + URLEncoder.encode(selectedItem, "UTF-8")).openStream());
                new TypeReference<List<Contenido>>() {});
                //Map<String, String> map = new Gson().fromJson(new InputStreamReader(input, "UTF-8"), new TypeToken<Map<String, String>>(){}.getType());

            /*String title = map.get("Title");
            String year = map.get("Year");
            String duration = map.get("duration");
            String genre = map.get("Genre");
            String directors = map.get("directors");
            String actors = map.get("Actors");
            String plot = map.get("Plot");

            testForm tf = new testForm(title, year, duration, genre, directors, actors, plot);
            tf.setVisible(true);*/

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);

                /*JsonIOException | JsonSyntaxException | IOException e){
            System.out.println(e);*/
        }
    }
    private static void getContents()
    {
        final String uri = "http://localhost:8080/springrestexample/contents.json";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }
    public void agregarContentss (List <ContenidoApi> contents){
        try {
            objectMapper.writeValue(
                    new File("src/main/resources/contents.json"), contents);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
