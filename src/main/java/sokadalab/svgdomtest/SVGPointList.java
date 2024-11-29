package sokadalab.svgdomtest;

import java.util.List;
import java.util.ArrayList;

public class SVGPointList extends ArrayList {
    public List<SVGPoint> list = new ArrayList<SVGPoint>();
    private long numberOfItems;

    @Override
    public void clear() {
        this.list.clear();
        this.numberOfItems = 0;
    }

    public void initialize(SVGPoint newItem) {
        clear();
        this.list.add(newItem);
        this.numberOfItems = 1;
    }

    // 指定の位置の要素を返す
    public SVGPoint getItem(int index) {
        return this.list.get(index);
    }

    // 要素のすべてを返す
    public String getAllItem() {
        String result = "";
        SVGPoint point = new SVGPoint();
        for (int i = 0; i < this.list.size(); i++) {
            point = getItem(i);
            result = result + String.valueOf(point.x) + " " + String.valueOf(point.y) + " ";
        }
        return result;
    }

    // 指定の位置に挿入
    public void insertItemBefore(SVGPoint newItem, int index) {
        if (index < 0) {
            this.list.add(0, newItem);
        } else if (index < this.numberOfItems) {
            this.list.add(index, newItem);
        } else {
            this.list.add(newItem);
        }
        this.numberOfItems += 1;
    }

    // 要素の置き換え
    public void replaceItem(SVGPoint newItem, int index) {
        removeItem(index);
        insertItemBefore(newItem, index);
    }

    // 指定の位置の要素を削除
    public void removeItem(int index) {
        this.list.remove(index);
        this.numberOfItems -= 1;
    }

    // 末尾に追加
    public void appendItem(SVGPoint newItem) {
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    public void appendItem(float x, float y) {
        SVGPoint newItem = new SVGPoint();
        newItem.x = x;
        newItem.y = y;
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    public void appendItem(String x, String y) {
        SVGPoint newItem = new SVGPoint();
        newItem.x = Float.parseFloat(x);
        newItem.y = Float.parseFloat(y);
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
}
