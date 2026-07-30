package brayan.collections.Exercise01.application;

import brayan.collections.Exercise01.domain.Student;
import brayan.collections.Exercise01.domain.StudentManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //final List<StudentManager> students = new ArrayList<>();
        String name;
        int age;
        long credential;
        String course;


        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            // exibir o menu
            System.out.println("=============================");
            System.out.println("       STUDENT MANAGER ");
            System.out.println("=============================");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Show Students");
            System.out.println("5. Sort Students");
            System.out.println("6. Total Students");
            System.out.println("0. Exit");
            System.out.println("----------------");
            System.out.print("Choose: ");

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        System.out.println();
                        System.out.println("=== ADD STUDENT ===");
                        System.out.print("Name: ");
                         name = scanner.nextLine();
                        System.out.print("Age: ");
                         age = scanner.nextInt();
                        if (age < 17) {
                            System.out.println("Invalid age");
                            return;
                        }
                        System.out.print("Credential: ");
                         credential = scanner.nextLong();
                        scanner.nextLine();
                        System.out.print("Course: ");
                         course = scanner.nextLine();

                        Student student = new Student(age, name, credential, course);
                        StudentManager.addStudent(student);
                        break;

                    case 2:
                        System.out.println();
                        System.out.println("=== REMOVE STUDENT ===");
                        System.out.print("Name: ");
                         name = scanner.nextLine();
                        System.out.print("Age: ");
                         age = scanner.nextInt();
                        if (age < 17) {
                            System.out.println("Invalid age");
                            return;
                        }
                        System.out.print("Credential: ");
                         credential = scanner.nextLong();
                        scanner.nextLine();
                        System.out.print("Course: ");
                         course = scanner.nextLine();

                        Student studentRemove = new Student(age, name, credential, course);
                        StudentManager.removeStudent(studentRemove);
                        break;


                    case 3:
                        System.out.println();
                        System.out.println("=== SEARCH STUDENT ===");
                        System.out.print("Name: ");
                        name = scanner.nextLine();
                        System.out.print("Age: ");
                        age = scanner.nextInt();
                        if (age < 17) {
                            System.out.println("Invalid age");
                            return;
                        }
                        System.out.print("Credential: ");
                        credential = scanner.nextLong();
                        scanner.nextLine();
                        System.out.print("Course: ");
                        course = scanner.nextLine();

                        Student searchStudent = new Student(age, name, credential, course);
                        StudentManager.searchStudent(searchStudent);
                        break;

                    case 4:
                        System.out.println();
                        System.out.println("=== SHOW STUDENTS ===");
                        StudentManager.showStudents();
                        break;

                    case 5:
                        System.out.println();
                        System.out.println("=== ORDER STUDENTS ===");
                        StudentManager.orderStudents();
                        break;

                    case 6:
                        System.out.println();
                        System.out.println("=== TOTAL STUDENTS ===");
                        StudentManager.totalStudents();
                        break;

                    case 0:
                        System.out.println("Goodbye!");
                        return;

                    default:
                        break;
                }
            } else {
                System.out.println("Invalid input, enter a number!");
                scanner.next(); // limpa o buffer de entrada incorreta
                option = 0;
            }

        } while (option != 0);
    }
}
