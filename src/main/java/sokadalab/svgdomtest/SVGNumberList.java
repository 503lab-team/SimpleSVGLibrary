package sokadalab.svgdomtest;

import java.util.List;
import java.util.ArrayList;

public class SVGNumberList extends ArrayList {
    public List<SVGNumber> list = new ArrayList<SVGNumber>();
    private long numberOfItems;

    @Override
    public void clear() {
        this.list.clear();
        this.numberOfItems = 0;
    }

    public void initialize(SVGNumber newItem) {
        clear();
        this.list.add(newItem);
        this.numberOfItems = 1;
    }

    public SVGNumber getItem(int index) {
        return this.list.get(index);
    }

    public void insertItemBefore(SVGNumber newItem, int index) {
        if (index < 0) {
            this.list.add(0, newItem);
        } else if (index < this.numberOfItems) {
            this.list.add(index, newItem);
        } else {
            this.list.add(newItem);
        }
        this.numberOfItems += 1;
    }

    public void replaceItem(SVGNumber newItem, int index) {
        removeItem(index);
        insertItemBefore(newItem, index);
    }

    public void removeItem(int index) {
        this.list.remove(index);
        this.numberOfItems -= 1;
    }

    public void appendItem(SVGNumber newItem) {
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    public void appendItem(float value) {
        SVGNumber newItem = new SVGNumber();
        newItem.value = value;
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    public void appendItem(String value) {
        SVGNumber newItem = new SVGNumber();
        newItem.value = Float.parseFloat(value);
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
}
