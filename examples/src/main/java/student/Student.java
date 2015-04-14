package student;

import java.util.ArrayList;

/**
 * Created by eugene on 11.04.15.
 */
public class Student {
    private String name;

    private int age;
    private String subject;

    public Student(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public Student() {
    }

    public Student(String age, String s, Subject subject) {
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!name.equals(student.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject=" + subject +
                '}';
    }
}
