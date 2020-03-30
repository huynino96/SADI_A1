package factory;

import model.StudentEnrollment;
import sample.Courses;
import sample.Students;

import java.util.Scanner;

public interface ProgramHelper {
    void useCourseSample(Courses courses);
    void useStudentSample(Students students);
    Scanner getUserInput(String askString);
    StudentEnrollment getStudentEnrollment();
}