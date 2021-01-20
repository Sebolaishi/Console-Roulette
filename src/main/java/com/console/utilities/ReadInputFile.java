package com.console.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadInputFile {

    public ReadInputFile() throws IOException {
    }


    public static void getPlayerNames(){
        String path = "/Users/lodwinmoloto/Workplace/playerNames.txt";

        try (Stream<String> stream = Files.lines(Paths.get(path))){
            stream.forEach(System.out::println);

            System.out.println("Press Enter to proceed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
