package sokadalab.svgdomtest;

import java.util.List;
import java.util.ArrayList;

class SVGPointList extends ArrayList {
    List<SVGPoint> list = new ArrayList<SVGPoint>();
    private long numberOfItems;

    @Override
    public void clear() {
        this.list.clear();
        this.numberOfItems = 0;
    }

    void initialize(SVGPoint newItem) {
        clear();
        this.list.add(newItem);
        this.numberOfItems = 1;
    }

    SVGPoint getItem(int index) {
        return this.list.get(index);
    }

    void insertItemBefore(SVGPoint newItem, int index) {
        if (index < 0) {
            this.list.add(0, newItem);
        } else if (index < this.numberOfItems) {
            this.list.add(index, newItem);
        } else {
            this.list.add(newItem);
        }
        this.numberOfItems += 1;
    }

    void replaceItem(SVGPoint newItem, int index) {
        removeItem(index);
        insertItemBefore(newItem, index);
    }

    void removeItem(int index) {
        this.list.remove(index);
        this.numberOfItems -= 1;
    }

    void appendItem(SVGPoint newItem) {
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    void appendItem(float x, float y) {
        SVGPoint newItem = new SVGPoint();
        newItem.x = x;
        newItem.y = y;
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    void appendItem(String x, String y) {
        SVGPoint newItem = new SVGPoint();
        newItem.x = Float.parseFloat(x);
        newItem.y = Float.parseFloat(y);
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
}
