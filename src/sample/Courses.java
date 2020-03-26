package sample;

import model.Course;

import java.util.ArrayList;
import java.util.List;

public class Courses {
    public static List<Course> courses = new ArrayList<>();

    public void add(Course course) {
        courses.add(course);
    }

    public Course find(int id) {
        return courses.get(id);
    }

    public void show() {
        int position = 0;
        for(Course course: courses) {
            String[] template = {
                    "ID: " + course.id,
                    "Name: " + course.name,
                    "Credit: " + course.numberOfCredits
            };

            String content = String.valueOf(position) + ") " + String.join(", ", template);
            System.out.println(content);

            position = position + 1;
        }
    }
}
