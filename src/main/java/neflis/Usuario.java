package neflis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
    public List<Contenido> contenidoVisto=new ArrayList<>(  );
    public List<String> generosqueVio;
    //public Contenido contenido;
    //public Contenido contenidoVisto;


    /**Aca se le dice al usuario que contenido vio completo**/

    public Boolean vioContenidoCompleto(Contenido contenido) {
        return this.contenidoVisto.contains( contenido );
    }

    public void setContenido(List<Contenido> contenidoVisto) {
        this.contenidoVisto = contenidoVisto;
    }

    public List<Contenido> getContenido() {
        return contenidoVisto;
    }
    /** generos que ve el usuario**/
    public List<String> generosqueVio(){
        return contenidoVisto.stream().map( contenidoVisto -> contenidoVisto.genero())
                .distinct().collect( Collectors.toList());}

    public Integer minVistosxGenero(String genero){return
                contenidoVisto.stream().filter( contenido->contenido.genero()
                        .equals( genero ) ).mapToInt( contenido->contenido.duracion())
                        .sum();}

    }

