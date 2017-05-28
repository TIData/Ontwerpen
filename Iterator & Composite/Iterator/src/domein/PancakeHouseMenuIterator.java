package domein;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

    private List<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        Object object = items.get(position);
        position++;
        return object;
    }
}
