package sokadalab.svgdomtest;

import java.util.ArrayList;
import java.util.List;

/**
 * path要素の属性dを表す<br>
 * https://www.w3.org/TR/SVG11/paths.html#InterfaceSVGPathSegList
 */
public class SVGPathSegList extends ArrayList {
    private List<SVGPathSeg> list = new ArrayList<SVGPathSeg>();
    private long numberOfItems = 0;

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

    /**
     * 指定の位置のパスデータを取得
     * @param index 取得したいパスデータの位置
     * @return 指定の位置のパスデータ
     */
    public SVGPathSeg getItem(int index) {
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
     * @return フィールドlistがもつ全パスデータ
     */
    public String getAllItem() {
        String result = "";
        SVGPathSeg pathSeg = new SVGPathSeg();
        for (int i = 0; i < this.list.size(); i++) {
            pathSeg = getItem(i);
            result = result + pathSeg.getPathSegTypeAsLetter() + " ";
            for (int j = 0; j < pathSeg.getData().size(); j++) {
                result = result + String.valueOf(pathSeg.getData().get(j)) + " ";
            }
            result = result + " ";
        }
        return result;
    }

    /**
     * 指定の位置にパスデータを挿入
     * @param newItem 挿入するパスデータ
     * @param index 指定する位置
     */
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

    /**
     * 要素の置き換え
     * @param newItem 新しいパスデータ
     * @param index 置き換えの位置
     */
    public void replaceItem(SVGPathSeg newItem, int index) {
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
     * 末尾にパスデータを追加
     * @param newItem 追加するパスデータ
     */
    public void appendItem(SVGPathSeg newItem) {
        this.list.add(newItem);
        this.numberOfItems += 1;
    }

    /**
     * 末尾にパスのコマンド部分のみ追加
     * @param pathSegTypeAsLetter パスのコマンド部分
     */
    public void appendCommand(String pathSegTypeAsLetter) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.setType(pathSegTypeAsLetter);
        this.list.add(newItem);
        this.numberOfItems += 1;
    }
}

