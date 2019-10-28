package neflis.neflisdemo.util;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Util {
    public static final String API_KEY = "7bf9263c";
    public static final String URL_API = "http://www.omdbapi.com/";
    public static final String URL_CONTENT = URL_API + "?apikey=" + API_KEY  + "&t=";



    public static ResponseEntity<String> getResponse(String url){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response;
    }


}
