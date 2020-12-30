package classworks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lesson_15 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\User\\Desktop\\Java\\resources\\questions.txt");
        String[] lines = new String[0];
        try {
            lines = Files.readAllLines(path).toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HashMap<String, HashSet<String>> map = new HashMap<>();

        map.put("OOP", new HashSet<>());
        map.put("BASICS", new HashSet<>());
        map.put("EXCEPTIONS", new HashSet<>());

        for (String line : lines) {
            String[] sectionQuestion = line.split(":", 2);
            if (map.containsKey(sectionQuestion[0])) {
                map.get(sectionQuestion[0]).add(sectionQuestion[1]);
            } else {
                map.put(sectionQuestion[0], new HashSet<String>(Collections.singletonList(sectionQuestion[1])));
            }
        }

        String type = new Scanner(System.in).next();
        System.out.println(map.get(type));
    }
}
