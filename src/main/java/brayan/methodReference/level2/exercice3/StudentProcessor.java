package brayan.methodReference.level2.exercice3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentProcessor {
    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Bruno", "Carlos", "Mariana");
        List<Double> grades = List.of(8.5, 5.0, 9.0, 6.5);

        BiFunction<String, Double, Student> biFunction = Student::new;

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            String s = names.get(i);
            Double v = grades.get(i);
            students.add(biFunction.apply(s, v));
        }

        Predicate<Student> studentPredicate = Student::isApproved;
        Function<Student, String> outputName = Student::getName;
        for (Student student : students) {
            if (studentPredicate.test(student)) {
                System.out.println(outputName.apply(student));
            }
        }
    }
}
