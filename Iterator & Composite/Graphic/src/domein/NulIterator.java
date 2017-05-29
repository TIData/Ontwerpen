package domein;

import java.util.Iterator;

public class NulIterator implements Iterator<Graphic> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Graphic next() {
        return null;
    }
}
