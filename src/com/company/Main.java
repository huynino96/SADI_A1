package com.company;

import builder.CourseBuilder;
import builder.StudentBuilder;
import depencyinjection.EnrollmentStorage;
import factory.ProgramHelper;
import factory.ProgramHelperFactory;
import lambda.ProgramMessage;
import sample.Courses;
import sample.Students;
import singleton.EnrollmentStorageSingleton;
import template.EnrollmentProgram;

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

        // Program Helper
        ProgramHelper userHelper = ProgramHelperFactory.getHelper("UserHelper");
        userHelper.useStudentSample(students);
        userHelper.useCourseSample(courses);

        // Enrollment program
        EnrollmentStorage enrollmentStorageSingleton = EnrollmentStorageSingleton.getInstance();
        EnrollmentProgram enrollmentProgram = new EnrollmentProgram(enrollmentStorageSingleton, userHelper);

        // Program message
        ProgramMessage repeatMessage = (message) -> System.out.println(message);
        ProgramMessage invalidMessage = (message) -> System.out.println("Invalid: " + message);


    }
}
