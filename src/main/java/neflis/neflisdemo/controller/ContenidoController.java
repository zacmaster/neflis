package neflis.neflisdemo.controller;

import neflis.Contenido;
import neflis.neflisdemo.model.ContenidoApi;
import neflis.neflisdemo.service.ContenidoService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ContenidoController {
    private ContenidoService contenidoService;
    public ContenidoController(ContenidoService contenidoService){
        this.contenidoService=contenidoService;
    }

    @GetMapping("/contents")
    public List<ContenidoApi> contents(){
        return
                contenidoService.contents();
    }
    @PostMapping("/contents")
    public ContenidoApi addContent(@RequestBody ContenidoApi contents){
        return
                contenidoService.agregarContents(contents);}

    @RequestMapping(value = "/contents", produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
    public String getAllContentsJSON(Model model)
    {
      //  model.addAttribute("contents", getContentsCollection());
        return "jsonTemplate";
    }
}
