package facade;

public class TableMaker {
    private TableCourse tableCourse;
    private TableStudent tableStudent;

    public TableMaker() {
        this.tableCourse = new TableCourse();
        this.tableStudent = new TableStudent();
    }

    public void printTableCourseHeader() {
        tableCourse.header();
    }

    public void printTableCourseFooter() {
        tableCourse.footer();
    }

    public void printTableStudentHeader() {
        tableStudent.header();
    }

    public void printTableStudentFooter() {
        tableStudent.footer();
    }
}
