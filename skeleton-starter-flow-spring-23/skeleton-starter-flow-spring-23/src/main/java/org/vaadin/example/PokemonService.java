package org.vaadin.example;

import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;
@Service
public class PokemonService implements Serializable {

        public String leePokemon(String tipoPeticion) {
            return "Hello " + tipoPeticion;
        }

    public String leePokemonPorNombre(String nombre) throws URISyntaxException, IOException,
            InterruptedException {
        API api = new API();
        return api.getPokemonPorNombre(nombre);
    }
    public String leePokemonPorTipo(String tipo) throws URISyntaxException, IOException,
            InterruptedException {
        API api = new API();
        return api.getPokemonPorTipo(tipo);
    }
    public ArrayList<Datos> leePokemons() throws URISyntaxException, IOException,
            InterruptedException {
        API api = new API();
        String resultsAPI = api.getPokemons();
        Gson gson = new Gson();
        ArrayList<Datos> lista = gson.fromJson(resultsAPI,new
                TypeToken<ArrayList<Datos>>(){}.getType());
        return lista;
    }
}

