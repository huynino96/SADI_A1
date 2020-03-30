package iterator;

import java.util.ArrayList;
import java.util.List;

public class MenuList implements Iterator {
    public List<String> menus = new ArrayList<>();
    int currentItem = 0;

    @Override
    public boolean hasNext() {
        if(currentItem >= menus.size()) {
            currentItem = 0;
            return false;
        }

        return true;
    }

    @Override
    public Object next() {
        return menus.get(currentItem++);
    }
}
