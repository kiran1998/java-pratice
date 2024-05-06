package collections;

import java.util.Objects;

public class Student implements Comparable<Student> {
    String name;
    int rollno;

    public Student(String student, int rollno) {
        this.name = student;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    /*DOUBT*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }

    /*DOUBT*/
    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
