package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MenuList menuList = new MenuList(5);
        menuList.addMenu(new Menu("lemon", "200"));
        menuList.addMenu(new Menu("strawberry", "300"));
        menuList.addMenu(new Menu("orange", "400"));
        menuList.addMenu(new Menu("apple", "500"));
        menuList.addMenu(new Menu("banana", "600"));
        Menu[] menus = menuList.menus;
        Iterator<Menu> it = menuList.iterator();
        while (it.hasNext()) {
            Menu menu = it.next();
            System.out.println("name:" + menu.getName() + " price:" + menu.getPrice());
        }
        for(Menu menu: menus){
            System.out.println("name:" + menu.getName() + " price:" + menu.getPrice());
        }
    }
}