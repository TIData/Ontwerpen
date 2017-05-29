package domein;

import java.util.Iterator;
import java.util.List;

public class Waitress {

    private List<Menu> menu;

    public Waitress(List<Menu> menu) {
        this.menu = menu;
    }

    public void printMenu() {
        menu.forEach(element -> {
            System.out.println(element.getTitle());
            printMenu(element.createIterator());
        });
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
