package homeworks.lesson6.studentTask.model;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String gender;
    private double mark;

    public Student(String firstName, String lastName, int year, String gender, double mark) {
        setFirstName(firstName);
        setLastName(lastName);

        if(year > 1900 && year <= 2020) {
            this.year = year;
        } else {
            System.out.println("Invalid birth year");
        }

        setGender(gender);
        setMark(mark);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        } else {
            System.out.println("Invalid first name");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        } else {
            System.out.println("Invalid last name");
        }
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender != null && !gender.isEmpty()) {
            this.gender = gender;
        } else {
            System.out.println("Invalid gender");
        }
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if(mark >= 0 && mark <= 100) {
            this.mark = mark;
        } else {
            System.out.println("Invalid mark");
        }
    }

    public boolean isMale() {
        return gender.equals("m");
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", gender='" + gender + '\'' +
                ", mark=" + mark +
                '}';
    }
}
