package builder;

import model.Student;
public class StudentBuilder {
    Student student = new Student();

    public StudentBuilder id(String id) {
        student.id = id;
        return this;
    }

    public StudentBuilder name(String name) {
        student.name = name;
        return this;
    }

    public StudentBuilder age(int age) {
        student.age = age;
        return this;
    }

    public Student build() {
        return student;
    }
}
