package com.console.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ReadInputFile {

    public ReadInputFile() throws IOException {
    }


    public static List<String> getPlayerNames(){

        AtomicInteger count = new AtomicInteger();

        List<String> playerNames = new ArrayList<>();
        String path = Objects.requireNonNull(ReadInputFile.class.getClassLoader().getResource("playerNames.txt")).getPath();

        try (Stream<String> stream = Files.lines(Paths.get(path))){
            stream.forEach(name ->{
                playerNames.add(name);
                System.out.println(count.getAndIncrement() + ". " + name);
            });

            System.out.println("Please select player by number");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return playerNames;
    }


}
