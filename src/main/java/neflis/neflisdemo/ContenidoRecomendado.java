package neflis.neflisdemo;

import neflis.ContenidoUnitario;
import neflis.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContenidoRecomendado {
    private List<ContenidoUnitario> contenidosDestacados= new ArrayList<>();
    private Usuario usuario;
    public ContenidoUnitario contenidoUnitario;

    /*public List<ContenidoUnitario> contenidoIncompleto(){
        return usuario.getContenido().stream().filter(c->c.fueVistoCompletaX(usuario)).collect(Collectors.toList());}
    }*/


}
