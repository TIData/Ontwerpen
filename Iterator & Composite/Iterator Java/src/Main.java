
import domein.CafeMenu;
import domein.DinerMenu;
import domein.Menu;
import domein.PancakeHouseMenu;
import domein.Waitress;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        List<Menu> menu = new ArrayList<>();

        menu.add(dinerMenu);
        menu.add(pancakeHouseMenu);
        menu.add(cafeMenu);

        Waitress waitress = new Waitress(menu);

        waitress.printMenu();
    }
}
