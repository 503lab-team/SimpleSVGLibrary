package sokadalab.svgdomtest;

import java.util.List;
import java.util.ArrayList;

/**
 * SVGLengthのリスト<br>
 * https://www.w3.org/TR/SVG11/types.html#InterfaceSVGLengthList
 */
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

    /**
     * 指定の位置の要素を取得
     * @param index 取得したい要素の位置
     * @return 指定の位置の要素
     */
    public SVGLength getItem(int index) {
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
        SVGLength length = new SVGLength();
        for (int i = 0; i < this.list.size(); i++) {
            length = getItem(i);
            result = result + length.getValueAsString() + " ";
        }
        return result;
    }

    /**
     * 指定の位置に要素を挿入
     * @param newItem 新しい要素
     * @param index 追加する位置
     */
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

    /**
     * 要素の置き換え
     * @param newItem 新しい要素
     * @param index 置き換えの位置
     */
    public void replaceItem(SVGLength newItem, int index) {
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
     * 末尾に要素を追加
     * @param newItem 追加する要素
     */
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
