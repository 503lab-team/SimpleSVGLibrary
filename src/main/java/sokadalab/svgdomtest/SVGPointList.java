package sokadalab.svgdomtest;

import java.util.List;
import java.util.ArrayList;

/**
 * SVGPointのリスト<br>
 * https://www.w3.org/TR/SVG11/coords.html#InterfaceSVGPointList
 */
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

    /**
     * 指定の位置の要素を取得
     * @param index 取得したい要素の位置
     * @return 指定の位置の要素
     */
    public SVGPoint getItem(int index) {
        return this.list.get(index);
    }

    /**
     * 要素数を取得
     * @return フィールドnumberOfItems
     */
    public long getNumberOfItems() {
        return this.numberOfItems;
    }

    /**
     * すべての要素を文字列として取得
     * @return すべての要素
     */
    public String getAllItem() {
        String result = "";
        SVGPoint point = new SVGPoint();
        for (int i = 0; i < this.list.size(); i++) {
            point = getItem(i);
            result = result + String.valueOf(point.x) + " " + String.valueOf(point.y) + " ";
        }
        return result;
    }

    /**
     * 指定の位置に要素を挿入
     * @param newItem 新しい要素
     * @param index 挿入する位置
     */
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

    /**
     * 要素の置き換え
     * @param newItem 新しい要素
     * @param index 置き換えの位置
     */
    public void replaceItem(SVGPoint newItem, int index) {
        removeItem(index);
        insertItemBefore(newItem, index);
    }

    /**
     * 指定の位置の要素を削除
     * @param index 削除する要素の位置
     */
    public void removeItem(int index) {
        this.list.remove(index);
        this.numberOfItems -= 1;
    }

    /**
     * 末尾に追加
     * @param newItem 新しい要素
     */
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
