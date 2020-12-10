package classworks.lesson_12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class StudentService {

    public static List<Student> readStudents() {
        Path path = Paths.get("C:\\Users\\User\\Desktop\\Java\\resources\\students.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Student> students = new ArrayList<>();
        for(String s : lines) {
            String[] current = s.split("-");
            students.add(new Student(current[0], Integer.parseInt(current[1]), Integer.parseInt(current[2])));
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = readStudents();
        Path path = Paths.get("C:\\Users\\User\\Desktop\\Java\\resources\\students.txt");

        Set<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getYear() - o2.getYear();
            }
        });
        set.addAll(students);
        StringBuilder data = new StringBuilder("max age: ");
        for(Student s : set) {
            data.append(s.toString());
            break;
        }
        data.append("\n");
        try {
            Files.write(path, data.toString().getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


        set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getMark() - o2.getMark();
            }
        });
        set.addAll(students);
        data = new StringBuilder("min mark: ");
        for(Student s : set) {
            data.append(s.toString());
            break;
        }
        data.append("\n");
        try {
            Files.write(path, data.toString().getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        set.addAll(students);
        data = new StringBuilder("Sorted by names: ");
        for(Student s : set) {
            data.append(s.toString());
            data.append(" ");
        }
        data.append("\n");
        try {
            Files.write(path, data.toString().getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getMark() - o2.getMark();
            }
        });
        set.addAll(students);
        data = new StringBuilder("Sorted by marks: ");
        for(Student s : set) {
            data.append(s.toString());
            data.append(" ");
        }
        try {
            Files.write(path, data.toString().getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
