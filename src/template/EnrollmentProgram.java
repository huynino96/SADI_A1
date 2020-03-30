package template;

import depencyinjection.EnrollmentStorage;
import factory.ProgramHelper;
import model.StudentEnrollment;

import java.util.Scanner;

public class EnrollmentProgram extends Program {
    private ProgramHelper userHelper;
    private EnrollmentStorage enrollmentStorage;

    public EnrollmentProgram(EnrollmentStorage enrollmentStorage, ProgramHelper userHelper) {
        this.enrollmentStorage = enrollmentStorage;
        this.userHelper = userHelper;
    }

    @Override
    public void create() {
        StudentEnrollment studentEnrollment = userHelper.getStudentEnrollment();
        enrollmentStorage.create(studentEnrollment);
    }

    @Override
    public void read() {
        System.out.println("---- ENROLMENT DETAILS ----");
        enrollmentStorage.read();
        System.out.println();
    }

    @Override
    public void update() {
        // Choose the item to update
        Scanner enrollmentScanner = userHelper.getUserInput("What enrollment do you want to update ?");
        int enrollmentSelection = enrollmentScanner.nextInt();

        // Ask user again to get data and to update old value
        StudentEnrollment studentEnrollment = userHelper.getStudentEnrollment();
        enrollmentStorage.update(enrollmentSelection, studentEnrollment);
    }

    @Override
    public void delete() {
        Scanner enrollmentScanner = userHelper.getUserInput("What enrollment do you want to update ?");
        int enrollmentSelection = enrollmentScanner.nextInt();
        enrollmentStorage.delete(enrollmentSelection);
    }
}
