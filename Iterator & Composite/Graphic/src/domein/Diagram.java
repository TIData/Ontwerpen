package domein;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Diagram extends Graphic {

    private List<Graphic> graphics = new ArrayList<>();

    @Override
    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }

    @Override
    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    @Override
    public void draw() {
        graphics.parallelStream().forEach(element -> element.draw());
    }

    @Override
    public Iterator<Graphic> createIterator() {
        return graphics.iterator();
    }
}
