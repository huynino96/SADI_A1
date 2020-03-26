package sample;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class Students {
    public static List<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
    }

    public Student find(int id) {
        return students.get(id);
    }

    public void show() {
        int position = 0;
        for (Student student: students) {
            String[] template = {
                    "ID: " + student.id,
                    "Name: " + student.name,
                    "Age: " + student.age
            };

            String content = String.valueOf(position) + ") " + String.join(", ", template);
            System.out.println(content);

            position = position + 1;
        }
    }
}
