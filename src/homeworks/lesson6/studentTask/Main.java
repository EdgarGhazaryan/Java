package homeworks.lesson6.studentTask;

import homeworks.lesson6.studentTask.model.Student;
import homeworks.lesson6.studentTask.service.StudentService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Hayk_Avdalyan\\Desktop\\students.txt");
        String[] lines = Files.readAllLines(path).toArray(new String[0]);

        Student[] students = new Student[lines.length];
        for (int i = 0; i < lines.length; ++i) {
            String[] flygm = lines[i].split(",");
            students[i] = new Student(flygm[0], flygm[1], Integer.parseInt(flygm[2]), flygm[3], Double.parseDouble(flygm[4]));
        }

        StudentService studentService = new StudentService();

        System.out.println("Task 1: Print full names of students");
        studentService.printFullNames(students);
        System.out.println("\nTask 2: Print all male students");
        studentService.printMales(students);
        System.out.println("\nTask 3: Print all female students who has mark greater then 50.4");
        studentService.printFemalesGreaterThan50_4(students);
        System.out.println("\nTask 4: Print student information having the minimal mark");
        studentService.printWithMinimalMark(students);
        System.out.println("\nTask 5: Print biggest male student information");
        studentService.printBiggestMale(students);
        System.out.println("\nTask 6: Print students sorted by mark");
        studentService.printByMark(students);
        System.out.println("\nTask 7: Print female students sorted by year");
        studentService.printFemalesByYear(students);
    }
}
