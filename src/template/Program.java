package template;

import iterator.MenuGenerator;

import java.util.Scanner;

public abstract class Program {
    public abstract void create();
    public abstract void read();
    public abstract void update();
    public abstract void delete();

    public final void start() {
        MenuGenerator.toShow();
        System.out.println("Choose option to use: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch(option) {
            case 1:
                create();
                break;
            case 2:
                read();
                break;
            case 3:
                read();
                update();
                break;
            case 4:
                read();
                delete();
                break;
        }
    }
}
