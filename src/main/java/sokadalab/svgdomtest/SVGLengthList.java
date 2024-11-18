package sokadalab.svgdomtest;

import java.util.List;
import java.util.ArrayList;

public class SVGLengthList extends ArrayList {
    private List<SVGLength> list = new ArrayList<SVGLength>();
    private long numberOfItems;

    @Override
    public void clear() {
        this.list.clear();
        this.numberOfItems = 0;
    }

    public void initialize(SVGLength newItem) {
        clear();
        this.list.add(newItem);
        this.numberOfItems = 1;
    }

    public SVGLength getItem(int index) {
        return this.list.get(index);
    }

    public void insertItemBefore(SVGLength newItem, int index) {
        if (index < 0) {
            this.list.add(0, newItem);
        } else if (index < this.numberOfItems) {
            this.list.add(index, newItem);
        } else {
            this.list.add(newItem);
        }
        this.numberOfItems += 1;
    }

    public void replaceItem(SVGLength newItem, int index) {
        removeItem(index);
        insertItemBefore(newItem, index);
    }

    public void removeItem(int index) {
        this.list.remove(index);
        this.numberOfItems -= 1;
    }

    public void appendItem(SVGLength newItem) {
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    public void appendItem(float value) {
        SVGLength newItem = new SVGLength();
        newItem.newValueSpecifiedUnit(value);
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    public void appendItem(String valueAsString) {
        SVGLength newItem = new SVGLength();
        newItem.newValueSpecifiedUnit(valueAsString);
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
}
