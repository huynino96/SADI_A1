package com.company;

import builder.CourseBuilder;
import builder.StudentBuilder;
import sample.Courses;
import sample.Students;

public class Main {

    public static void main(String[] args) {
        programEnrollment(); //Call out the method
    }
    private static void programEnrollment(){
        String repeat;
        //Sample
        Students students = new Students();
        students.add(new StudentBuilder().id("s3756868").name("Ho Tuan Huy").age(23).build());

        Courses courses = new Courses();
        courses.add(new CourseBuilder().id("COSC2440").name("Software Architecture Design and Implementation").numberOfCredits(12).build());
        courses.add(new CourseBuilder().id("COSC2638").name("Cloud Computing").numberOfCredits(12).build());
        courses.add(new CourseBuilder().id("ISYS2101").name("Software Engineering Project Management").numberOfCredits(12).build());


    }
}
