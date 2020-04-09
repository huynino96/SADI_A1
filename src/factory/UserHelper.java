package factory;

import decorator.ValidateEmptyInput;
import decorator.ValidateSemester;
import decorator.Validator;
import Facade.TableMaker;
import model.Course;
import model.Student;
import model.StudentEnrollment;
import sample.Courses;
import sample.Students;

import java.util.Scanner;

public class UserHelper implements ProgramHelper {
    public Courses courses;
    public Students students;

    @Override
    public void useCourseSample(Courses courses) {
        this.courses = courses;
    }

    @Override
    public void useStudentSample(Students students) {
        this.students = students;
    }

    @Override
    public Scanner getUserInput(String askString) {
        System.out.println(askString);
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    @Override
    public StudentEnrollment getStudentEnrollment() {
        TableMaker table = new TableMaker();

        table.printTableStudentHeader();
        students.show();
        table.printTableStudentFooter();

        table.printTableCourseHeader();
        courses.show();
        table.printTableCourseFooter();

        Scanner studentScanner = getUserInput("What student do you want to select ?");
        int studentSelection = studentScanner.nextInt();
        Student student = students.find(studentSelection);

        Scanner courseScanner = getUserInput("What course do you want to enroll ?");
        int courseSelection = courseScanner.nextInt();
        Course course = courses.find(courseSelection);

        Scanner semesterScanner = getUserInput("What semester do you in ? (Ex: 2020A, 2019C)");
        String semester = semesterScanner.next();

        Validator validator = new ValidateSemester(new ValidateEmptyInput());
        Boolean isSemester = validator.validate(semester);

        if(!isSemester) throw new IllegalArgumentException("Invalid Semester, try again");

        return new StudentEnrollment(student, course, semester);
    }
}
