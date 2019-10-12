package neflis.neflisdemo.service;


import neflis.neflisdemo.model.ContenidoApi;
import neflis.neflisdemo.persistance.ContenidoStorage;
import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContenidoService {
    public ContenidoStorage contenidoStorage;
    public ContenidoApi contents;

    public ContenidoService() {
    }

    public ContenidoService(ContenidoStorage contenidoStorage) {
        this.contenidoStorage = contenidoStorage;
    }

    private List<ContenidoApi> contentsList;

    public List<ContenidoApi> getContentsList() {
        if (contentsList == null) {
            contentsList = new ArrayList<>();
        }
        return contentsList;
    }
    public void setContentsList(List<ContenidoApi> contentsList) {
        this.contentsList = contentsList;
    }

    public ContenidoApi contents() {
        return
                contents = contenidoStorage.contents();
    }

    public ContenidoApi getcontents() {
        return contents;
    }

    public ContenidoApi agregarContents(ContenidoApi newcontents) {
        /*long count = contents.stream().count();
        int i=contents.stream().skip(count - 1).findFirst().get().getId();
        newcontents.setId(contents.stream().hashCode());
        getcontents().add(newcontents);*/
        //this.contenidoStorage.agregarContentss(contents);
        return newcontents;
    }

}
