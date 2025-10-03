package pablo.api.storage;

import com.fasterxml.jackson.databind.ObjectMapper;
import pablo.api.Character;
import pablo.api.Response;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CharacterStorage {

    public List<Character> getAllCharacters() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        int page = 1;
        URL link = new URL("https://rickandmortyapi.com/api/character?page=" + page);

        List<Character> characters = new ArrayList<>();
        while (page < 42) {
            try {
                characters.add(objectMapper.readValue(link, Character.class));
                page++;
            }
            catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
        return characters;
    }


}
