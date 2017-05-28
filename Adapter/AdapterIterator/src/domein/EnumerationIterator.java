package domein;

import java.util.Enumeration;
import java.util.Iterator;
import javax.swing.tree.DefaultMutableTreeNode;

//TODO werk uit
public class EnumerationIterator<E> implements Iterator<E> {

    private Enumeration<E> enumeration;

    public EnumerationIterator(Enumeration<E> treenode) {
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
