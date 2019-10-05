package neflis.neflisdemo.service;

import neflis.neflisdemo.model.ContenidoApi;
import neflis.neflisdemo.persistance.ContenidoApiStorage;

import java.util.List;

public class ContenidoApiService {
    public List<ContenidoApi> contenidos;
    private ContenidoApiStorage contenidoStorage;
    public ContenidoApi agregarContenido(ContenidoApi nuevoContenido){  //metodo para añadir una nueva mascota con POST
        contenidos=contenidoStorage.contenidos();

        //agregar id correlativo
        long count = contenidos.stream().count();
        int i=contenidos.stream().skip(count - 1).findFirst().get().getId();
        nuevoContenido.setId(i+1);

        this.contenidos.add(nuevoContenido);
        this.contenidoStorage.agregarContenidoAArchivo(this.contenidos);
        return nuevoContenido;

    }


}
