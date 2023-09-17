package iterator;

import java.util.Iterator;

public class MenuList implements Iterable<Menu>{
    public Menu[] menus;
    public int last = 0;
    public MenuList(int max_size) {
        this.menus = new Menu[max_size];
    }
    public void addMenu(Menu menu){
        this.menus[last] = menu;
        last++;
    }
    public Menu getMenuAt(int index){
        return menus[index];
    }
    @Override
    public Iterator<Menu> iterator() {
        return new MenuListIterator(this);
    }
}
