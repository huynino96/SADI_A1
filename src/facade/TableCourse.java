package facade;

public class TableCourse implements Table {
    @Override
    public void header() {
        System.out.println("---- COURSE LIST ----");
    }

    @Override
    public void footer() {
        System.out.println();
    }
}
