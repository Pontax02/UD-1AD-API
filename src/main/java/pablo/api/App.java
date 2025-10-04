package pablo.api;


import pablo.api.storage.CharacterStorage;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class App {
    public static void main(String[] args) throws IOException {

        System.out.println("hola Rick");

        CharacterStorage characters = new CharacterStorage();

        List<Character> characterList = characters.getAllCharacters();



        System.out.println(characterList.stream().toList());




    }
}
