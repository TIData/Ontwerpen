package domein;

import java.util.ArrayList;
import java.util.List;

public class MySandwichBuilder extends SandwichBuilder {

    @Override
    public void prepareBread() {
        Sandwich sandwich = getSandwich();
        sandwich.setBreadType(BreadType.Wheat);
    }

    @Override
    public void applyMeatAndCheese() {
        Sandwich sandwich = getSandwich();
        sandwich.setCheeseType(CheeseType.American);
        sandwich.setMeatType(MeatType.Turkey);
    }

    @Override
    public void applyVegetables() {
        Sandwich sandwich = getSandwich();
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Tomato");
        vegetables.add("Lettuce");
        sandwich.setVegetables(vegetables);
    }

    @Override
    public void addCondiments() {
        Sandwich sandwich = getSandwich();
        sandwich.setHasMayo(false);
        sandwich.setIsToasted(true);
        sandwich.setHasMustard(true);
    }
}
