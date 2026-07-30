package brayan.collections.Exercise01.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private int age;
    private final String name;
    private final Long credentialId;
    private String course;

    public Student(int age, String name, Long credentialId, String course) {
        this.age = age;
        this.name = name;
        this.credentialId = credentialId;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", credentialId=" + credentialId +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(credentialId, student.credentialId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, credentialId);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Long getCredentialId() {
        return credentialId;
    }

    public String getCourse() {
        return course;
    }
}
