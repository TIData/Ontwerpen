package domein;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIteratorAdapter<E> implements Iterator<E> {

    private Enumeration<E> enumeration;

    public EnumerationIteratorAdapter(Enumeration<E> treenode) {
        this.enumeration = treenode;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }
}
