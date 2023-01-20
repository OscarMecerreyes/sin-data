package ufv.pokemon.pokemon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Controller {
    private Logger logger = LoggerFactory.getLogger(Controller.class);
    public ArrayList<Datos> infoPokemon = new ArrayList<>();

    @GetMapping("/Datos1")
    public ArrayList<Datos> getInfo() throws Exception {
        infoPokemon = new LectorJson().leeFicheroJson1();
        return infoPokemon;
    }
}
