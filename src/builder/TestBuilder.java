package builder;


import org.junit.Assert;
import org.junit.Test;
import sample.Courses;
import sample.Students;

public class TestBuilder {
    @Test
    public void testCourseBuilder(){
        Courses course = new Courses();
        course.add(new CourseBuilder().id("COSC2440").name("Software Architecture Design and Implementation").numberOfCredits(12).build());
        Assert.assertEquals("ID: COSC2440, Name: Software Architecture Design and Implementation, Credit: 12", course);
    }

    @Test
    public void testStudentBuilder(){
        Students students = new Students();
        students.add(new StudentBuilder().id("s3756868").name("Ho Tuan Huy").age(23).build());
        Assert.assertEquals("ID: s3756868, Name: Ho Tuan Huy, Age: 23", students);
    }

}
