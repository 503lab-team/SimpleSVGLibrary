package sokadalab.svgdomtest;

import java.util.List;
import java.util.ArrayList;

public class SVGNumberList extends ArrayList {
    public List<Float> list = new ArrayList<Float>();
    private long numberOfItems;

    @Override
    public void clear() {
        this.list.clear();
        this.numberOfItems = 0;
    }

    public void initialize(float newItem) {
        clear();
        this.list.add(newItem);
        this.numberOfItems = 1;
    }

    // 指定の位置の要素を返す
    public float getItem(int index) {
        return this.list.get(index);
    }

    // 要素のすべてを返す
    public String getAllItem() {
        String result = "";
        for (int i = 0; i < this.list.size(); i++) {
            result = result + String.valueOf(getItem(i)) + " ";
        }
        return result;
    }

    // 指定の位置に挿入
    public void insertItemBefore(float newItem, int index) {
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
    public void replaceItem(float newItem, int index) {
        removeItem(index);
        insertItemBefore(newItem, index);
    }

    // 指定の位置の要素を削除
    public void removeItem(int index) {
        this.list.remove(index);
        this.numberOfItems -= 1;
    }

    // 末尾に追加
    public void appendItem(float newItem) {
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    public void appendItem(String value) {
        this.list.add(Float.parseFloat(value));
        this.numberOfItems += 1;
    }
}
