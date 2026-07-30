package brayan.collections.Exercise01.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentManager {
    private static List<Student> studentList = new ArrayList<>();


    public static boolean addStudent(Student student) {
        Objects.requireNonNull(student, "Empty field");

        studentList.add(student);
        return true;
    }

    public static void showStudents() {
        for (Student student : studentList) {
            System.out.println(student);

        }

    }

}
