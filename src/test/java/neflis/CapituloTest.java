package neflis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CapituloTest {
    Capitulo capitulo1;
    Capitulo capitulo2;
    Capitulo capitulo3;
    Usuario usuarioA;
    List<Contenido> contenidoList;
    ContenidoUnitario contenidoUnitario;

    @BeforeEach
    void setup() {
        capitulo1 = new Capitulo(1, "actor1");
        capitulo2 = new Capitulo(2, "actor2");
        capitulo3 = mock(Capitulo.class);
        contenidoList = new ArrayList<>();
        contenidoList.add(capitulo2);
        contenidoList.add(capitulo3);
        usuarioA = new Usuario();
        usuarioA.setContenido(contenidoList);

    }

    @Test
    void testFueVistoCompleto(){
        usuarioA.getContenido();
        assertFalse(capitulo1.fueVistoCompletaX(usuarioA));
        assertTrue(capitulo2.fueVistoCompletaX(usuarioA));
       // assertTrue(capitulo3.fueVistoCompletaX(usuarioA));


        }


    }

