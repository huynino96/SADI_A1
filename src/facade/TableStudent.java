package facade;

public class TableStudent implements Table {
    @Override
    public void header() {
        System.out.println("---- STUDENT LIST ----");
    }

    @Override
    public void footer() {
        System.out.println();
    }
}
