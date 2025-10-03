package pablo.api.storage;

import com.fasterxml.jackson.databind.ObjectMapper;
import pablo.api.Response;


import java.io.IOException;
import java.net.URL;
import java.util.List;

public class CharacterStorage {

    public List<Character> getCharacters() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        URL link = new URL("https://rickandmortyapi.com/api/character");
        Response listacharacters = objectMapper.readValue(link, Response.class);

        return listacharacters.getResults();
    }


}
