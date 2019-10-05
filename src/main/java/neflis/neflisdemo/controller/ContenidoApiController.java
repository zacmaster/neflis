package neflis.neflisdemo.controller;

import neflis.neflisdemo.model.ContenidoApi;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContenidoApiController {
    private ContenidoApi contenido;
    @RequestMapping(value = "/contents", produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
    public String getAllEmployeesJSON(ContenidoApi contenido)
    {
        contenido.addAttribute("contents", getContentsCollection());
        return "jsonTemplate";
    }
}
