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
        int page = 0;
        URL link = new URL("https://rickandmortyapi.com/api/character?page=" + page);


        while (page < 42) {
            try {
                ++page;
                Response response = objectMapper.readValue(link, Response.class);


                return response.getResults();

            }
            catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
        return List.of();
    }


}
