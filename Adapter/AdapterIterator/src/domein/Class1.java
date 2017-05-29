package domein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Class1 {

    private List<String> items;

    public Class1() {
        String[] itemArray = {"item1", "item2", "item3", "item4"};
        items = new ArrayList<>(Arrays.asList(itemArray));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        Iterator<String> iterator = items.iterator();
        Enumeration<String> enumerator = new IteratorEnumerationAdapter(iterator);
        
        while (enumerator.hasMoreElements()) {
            builder.append(enumerator.nextElement()).append(" ");
        }
        
        return builder.toString();
    }
}
