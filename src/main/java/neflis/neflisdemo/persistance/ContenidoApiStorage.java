package neflis.neflisdemo.persistance;

import com.fasterxml.jackson.core.type.TypeReference;
import neflis.neflisdemo.model.ContenidoApi;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ContenidoApiStorage {
    private ObjectMapper objectMapper;

    private static void getContents()
    {
        final String uri = "src/main/resources/contents.json";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }

    public List<ContenidoApi> contenidos(){
        try {
            return objectMapper.readValue(new File("src/main/resources/contents.json"), //ruta relativa - absoluta=C:\Users\ncent\Desktop\springboot-demo\src\main\resources\mascotas.json
                    new TypeReference<List<ContenidoApi>>(){});
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
