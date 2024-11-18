package sokadalab.svgdomtest;

import java.util.List;
import java.util.ArrayList;

class SVGNumberList extends ArrayList {
    List<SVGNumber> list = new ArrayList<SVGNumber>();
    private long numberOfItems;

    @Override
    public void clear() {
        this.list.clear();
        this.numberOfItems = 0;
    }

    void initialize(SVGNumber newItem) {
        clear();
        this.list.add(newItem);
        this.numberOfItems = 1;
    }

    SVGNumber getItem(int index) {
        return this.list.get(index);
    }

    void insertItemBefore(SVGNumber newItem, int index) {
        if (index < 0) {
            this.list.add(0, newItem);
        } else if (index < this.numberOfItems) {
            this.list.add(index, newItem);
        } else {
            this.list.add(newItem);
        }
        this.numberOfItems += 1;
    }

    void replaceItem(SVGNumber newItem, int index) {
        removeItem(index);
        insertItemBefore(newItem, index);
    }

    void removeItem(int index) {
        this.list.remove(index);
        this.numberOfItems -= 1;
    }

    void appendItem(SVGNumber newItem) {
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    void appendItem(float value) {
        SVGNumber newItem = new SVGNumber();
        newItem.value = value;
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    void appendItem(String value) {
        SVGNumber newItem = new SVGNumber();
        newItem.value = Float.parseFloat(value);
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
}
