package neflis.neflisdemo.service;

import neflis.Contenido;
import neflis.neflisdemo.model.ContenidoApi;
import neflis.neflisdemo.persistance.ContenidoStorage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContenidoService {
    public ContenidoStorage contenidoStorage;
    public List<ContenidoApi> contents;
    public ContenidoService(){}
    public ContenidoService(ContenidoStorage contenidoStorage){
        this.contenidoStorage=contenidoStorage;
    }


    public List<ContenidoApi> contents(){ return
       contents = contenidoStorage.contents();
    }

    public List<ContenidoApi> getcontents() {
        return contents;
    }

    public ContenidoApi agregarContents(ContenidoApi newcontents){
        /*long count = contents.stream().count();
        int i=contents.stream().skip(count - 1).findFirst().get().getId();
        newcontents.setId(contents.stream().hashCode());
        getcontents().add(newcontents);*/
        this.contenidoStorage.agregarContentss(contents);
        return newcontents;
    }
}
