package homeworks.lesson6.studentTask.service;

import homeworks.lesson6.studentTask.model.Student;

public class StudentService {
    public void printFullNames(Student[] students) {
        for(Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }

    public void printMales(Student[] students) {
        for(Student student : students) {
            if(student.isMale()) {
                System.out.println(student);
            }
        }
    }

    public void printFemalesGreaterThan50_4(Student[] students) {
        for(Student student : students) {
            if(!student.isMale() && student.getMark() > 50.4) {
                System.out.println(student);
            }
        }
    }

    public void printWithMinimalMark(Student[] students) {
        Student min = students[0];
        for(int i = 1; i < students.length; ++i) {
            if(students[i].getMark() < min.getMark()) {
                min = students[i];
            }
        }
        System.out.println(min);
    }

    public void printBiggestMale(Student[] students) {
        Student biggestMale = null;
        int smallestYear = 3000;
        for(int i = 0; i < students.length; ++i) {
            if(students[i].isMale() && students[i].getYear() < smallestYear) {
                biggestMale = students[i];
                smallestYear = students[i].getYear();
            }
        }
        if(biggestMale != null) {
            System.out.println(biggestMale);
        } else {
            System.out.println("There isn`t male student");
        }
    }

    public void printByMark(Student[] students) {
        boolean flag = true;
        int i = 0;
        while(flag) {
            flag = false;
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getMark() > students[j].getMark()) {
                    Student tmp = students[i];
                    students[i] = students[j];
                    students[j] = tmp;
                    flag = true;
                }
            }
            ++i;
        }

        for(Student student : students) {
            System.out.println(student);
        }
    }

    public void printFemalesByYear(Student[] students) {
        boolean flag = true;
        int i = 0;
        while(flag) {
            flag = false;
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getYear() > students[j].getYear()) {
                    Student tmp = students[i];
                    students[i] = students[j];
                    students[j] = tmp;
                    flag = true;
                }
            }
            ++i;
        }

        flag = false;
        for(Student student : students) {
            if(!student.isMale()) {
                System.out.println(student);
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("There isn`t female student");
        }
    }
}
