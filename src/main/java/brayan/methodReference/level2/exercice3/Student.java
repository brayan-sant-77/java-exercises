package brayan.methodReference.level2.exercice3;

public class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public static boolean isApproved(Student student) {
        return !(student.getGrade() <= 6.9);
    }
}
