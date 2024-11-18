package sokadalab.svgdomtest;

import java.util.List;
import java.util.ArrayList;

public class SVGStringList extends ArrayList {
    public List<String> list = new ArrayList<String>();
    private long numberOfItems;

    @Override
    public void clear() {
        this.list.clear();
        this.numberOfItems = 0;
    }

    public void initialize(String newItem) {
        clear();
        this.list.add(newItem);
        this.numberOfItems = 1;
    }

    public String getItem(int index) {
        return this.list.get(index);
    }

    public void insertItemBefore(String newItem, int index) {
        if (index < 0) {
            this.list.add(0, newItem);
        } else if (index < this.numberOfItems) {
            this.list.add(index, newItem);
        } else {
            this.list.add(newItem);
        }
        this.numberOfItems += 1;
    }

    public void replaceItem(String newItem, int index) {
        removeItem(index);
        insertItemBefore(newItem, index);
    }

    public void removeItem(int index) {
        this.list.remove(index);
        this.numberOfItems -= 1;
    }

    public void appendItem(String newItem) {
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
}
