package iterator;

import java.util.Iterator;
public class MenuListIterator implements Iterator<Menu>{
    public MenuList menuList;
    public int index = 0;
    public MenuListIterator(MenuList menuList) {
        this.menuList = menuList;
    }
    @Override
    public boolean hasNext() {
        return index < menuList.last;
    }
    @Override
    public Menu next() {
        if(!hasNext()){
            throw new IndexOutOfBoundsException();
        } else {
            Menu menu = menuList.getMenuAt(index);
            index++;
            return menu;
        }
    }
}
