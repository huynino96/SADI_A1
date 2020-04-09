package iterator;

import java.util.ArrayList;
import java.util.List;

public class MenuGenerator {
    public static void toShow() {
        List<String> menus = new ArrayList<>();
        menus.add("To use this system, choose options below");
        menus.add("1) Create");
        menus.add("2) Read");
        menus.add("3) Update");
        menus.add("4) Delete");
        menus.add("0) Exit");

        MenuList menuList = new MenuList();
        menuList.menus = menus;

        while(menuList.hasNext()) {
            System.out.println(menuList.next());
        }
    }
}
