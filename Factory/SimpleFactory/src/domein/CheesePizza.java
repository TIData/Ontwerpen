package domein;

public class CheesePizza extends Pizza {

    @Override
    public void box() {
        System.out.println("Place pizza in official cheese box");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 40 minutes at 350");
    }
}
