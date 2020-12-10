package classworks.lesson_12;

import java.util.Objects;

public class Student {
    private String name;
    private int mark;
    private int year;

    public Student(String name, int mark, int year) {
        this.name = name;
        this.mark = mark;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.join(",", name, Integer.toString(mark), Integer.toString(year));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return mark == student.mark &&
                year == student.year &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark, year);
    }
}
