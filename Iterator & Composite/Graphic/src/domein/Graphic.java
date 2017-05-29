package domein;

import java.util.Iterator;

public abstract class Graphic {

    public void add(Graphic graphic) {
        throw new UnsupportedOperationException();
    }

    public void remove(Graphic graphic) {
        throw new UnsupportedOperationException();
    }

    public abstract void draw();

    public abstract Iterator<Graphic> createIterator();
}
