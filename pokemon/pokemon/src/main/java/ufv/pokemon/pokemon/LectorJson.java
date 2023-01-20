package ufv.pokemon.pokemon;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LectorJson {
    public ArrayList<Datos> leeFicheroJson1() throws Exception {
        String jsonString;
        try {
//lee el fichero que le pasemos y lo carga en un reader
            Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/pokemonConId.json"));
// convierte el array JSON a un arraylist de users
            ArrayList<Datos> listaPokemon =
                    new Gson().fromJson(reader, new TypeToken<ArrayList<Datos>>() {}.getType());
            reader.close();// close reader
            return listaPokemon;
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ArrayList<>(); //si no ha leido nada, devuelve un array vacio
        }
        }
    }

