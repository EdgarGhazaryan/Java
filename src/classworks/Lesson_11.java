package classworks;

import java.util.*;

public class Lesson_11 {
    public static void main(String[] args) {
        String text = "Hi Picsart Hi Java 2020 Java";

        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(text.split(" ")));

        System.out.println(String.join(" ", set));
    }
}
