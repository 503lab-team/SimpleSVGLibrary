package sokadalab.svgdomtest;

import java.util.List;
import java.util.ArrayList;

class SVGLengthList extends ArrayList {
    List<SVGLength> list = new ArrayList<SVGLength>();
    private long numberOfItems;

    @Override
    public void clear() {
        this.list.clear();
        this.numberOfItems = 0;
    }

    void initialize(SVGLength newItem) {
        clear();
        this.list.add(newItem);
        this.numberOfItems = 1;
    }

    SVGLength getItem(int index) {
        return this.list.get(index);
    }

    void insertItemBefore(SVGLength newItem, int index) {
        if (index < 0) {
            this.list.add(0, newItem);
        } else if (index < this.numberOfItems) {
            this.list.add(index, newItem);
        } else {
            this.list.add(newItem);
        }
        this.numberOfItems += 1;
    }

    void replaceItem(SVGLength newItem, int index) {
        removeItem(index);
        insertItemBefore(newItem, index);
    }

    void removeItem(int index) {
        this.list.remove(index);
        this.numberOfItems -= 1;
    }

    void appendItem(SVGLength newItem) {
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    void appendItem(float value) {
        SVGLength newItem = new SVGLength();
        newItem.newValueSpecifiedUnit(value);
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    void appendItem(String valueAsString) {
        SVGLength newItem = new SVGLength();
        newItem.newValueSpecifiedUnit(valueAsString);
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
}
