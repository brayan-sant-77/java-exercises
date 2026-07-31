package brayan.collections.list.Exercise01.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StudentManager{
    private static List<Student> studentList = new ArrayList<>();

    public static boolean addStudent(Student student) {
        Objects.requireNonNull(student, "Empty Field");
        for (Student student1 : studentList) {
            if (student1.equals(student)) {
                throw new RuntimeException("Duplicate Students");
            }
        }
        studentList.add(student);
        return true;
    }

    public static boolean removeStudent(Student student) {
        Objects.requireNonNull(student, "Empty Field");
        if (!studentList.contains(student)) {
            return false;
        }
        studentList.remove(student);
        return true;
    }

    public static void searchStudent(Student searchStudent) {
        for (Student student : studentList) {
            if (student.equals(searchStudent)) {
                System.out.println(student);
                return;
            }
                System.out.println("Student not found");

        }
    }

    public static void showStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public static void orderStudents() {
        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.println(student);
        }

    }

    public static void totalStudents() {
        System.out.println("Total Students: " + studentList.size());
    }

}
