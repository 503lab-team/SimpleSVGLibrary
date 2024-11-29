// <path>要素の属性d

package sokadalab.svgdomtest;

import java.util.ArrayList;
import java.util.List;

public class SVGPathSegList extends ArrayList {
    List<SVGPathSeg> list = new ArrayList<SVGPathSeg>();
    private long numberOfItems;

    @Override
    public void clear() {
        this.list.clear();
        this.numberOfItems = 0;
    }

    public void initialize(SVGPathSeg newItem) {
        clear();
        this.list.add(newItem);
        this.numberOfItems = 1;
    }

    // 指定の位置の要素を返す
    public SVGPathSeg getItem(int index) {
        return this.list.get(index);
    }

    // 要素のすべてを返す
    public String getAllItem() {
        String result = "";
        SVGPathSeg pathSeg = new SVGPathSeg();
        for (int i = 0; i < this.list.size(); i++) {
            pathSeg = getItem(i);
            result = result + pathSeg.pathSegTypeAsLetter;
            for (int j = 0; j < pathSeg.size(); j++) {
                result = " " + result + pathSeg.data.get(i);
            }
            if (i + 1 < this.list.size()) {
                result = result + " ";
            }
        }
        return result;
    }

    // 指定の位置に挿入
    public void insertItemBefore(SVGPathSeg newItem, int index) {
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
    public void replaceItem(SVGPathSeg newItem, int index) {
        removeItem(index);
        insertItemBefore(newItem, index);
    }

    // 指定の位置の要素を削除
    public void removeItem(int index) {
        this.list.remove(index);
        this.numberOfItems -= 1;
    }

    // 末尾に追加
    public void appendItem(SVGPathSeg newItem) {
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
    public void appendItem(String pathSegTypeAsLetter) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.pathSegTypeAsLetter = pathSegTypeAsLetter;
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
}

