package domein;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu {

    private Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("Veggie Burger", "Veggie burger with salad", true, 3.99);
        addItem("Soup of the day", "Soup with bread", false, 3.69);
        addItem("Burrito", "Burrito", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian,
            double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
