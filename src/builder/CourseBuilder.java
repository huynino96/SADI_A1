package builder;

import model.Course;

public class CourseBuilder {
    Course course = new Course();

    public CourseBuilder id(String id) {
        course.id = id;
        return this;
    }

    public CourseBuilder name(String name) {
        course.name = name;
        return this;
    }

    public CourseBuilder numberOfCredits(int credits) {
        course.numberOfCredits = credits;
        return this;
    }

    public Course build() {
        return course;
    }
}
