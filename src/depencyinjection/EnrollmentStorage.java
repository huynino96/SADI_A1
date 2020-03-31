package depencyinjection;

import model.StudentEnrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentStorage {
    public static List<StudentEnrollment> studentEnrollments = new ArrayList<>();


    public void create(StudentEnrollment studentEnrollment) {
        studentEnrollments.add(studentEnrollment);
    }

    public void read() {
        int position = 0;
        String listString = "";
        for (StudentEnrollment studentEnrollment : studentEnrollments) {
            listString += position + " |STUDENT: " + studentEnrollment.getStudent().name + "\n";
            listString += "  |COURSE: " + studentEnrollment.getCourse().name + "\n";
            listString += "  |SEMESTER: " + studentEnrollment.getSemester() + "\n";
            listString += "\n";
            position += 1;
        }
        System.out.println(listString);
    }

    public void update(int id, StudentEnrollment studentEnrollment) {
        studentEnrollments.set(id, studentEnrollment);
    }

    public void delete(int id) {
        studentEnrollments.remove(id);
    }
}
