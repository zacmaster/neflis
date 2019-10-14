package neflis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class UsuarioTest {
    Usuario usuarioA;
    List<Contenido> ContenidoVisto;
    Pelicula pelicula1;
    Pelicula pelicula2;
    Serie serie1;
    Serie serie2;



    @BeforeEach
    void setUp(){
        usuarioA=new Usuario();
        pelicula1= mock(Pelicula.class);
        pelicula2=mock(Pelicula.class);
        serie1= mock(Serie.class);
        List<Contenido>contenidoVisto= new ArrayList<>();
        contenidoVisto.add(pelicula1);
        contenidoVisto.add(pelicula2);
        contenidoVisto.add(serie1);
        usuarioA.setContenido(contenidoVisto);

    }
    @Test
    public void testVioContenidoCompleto(){
        usuarioA.getContenido();
        assertTrue(usuarioA.vioContenidoCompleto(pelicula1));
        assertTrue(usuarioA.vioContenidoCompleto(serie1));
        assertFalse(usuarioA.vioContenidoCompleto(serie2));

    }
}
