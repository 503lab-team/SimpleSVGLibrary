package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * symbol要素<br>
 * https://www.w3.org/TR/SVG11/struct.html#SymbolElement<br>
 * https://www.w3.org/TR/SVG11/struct.html#InterfaceSVGSymbolElement
 */
public class Symbol extends SVGLangSpace {
    private SVGLengthList viewBox = new SVGLengthList();

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Symbol(Document document) {
        super(document, "symbol");
    }

    /**
     * 属性viewBoxの取得
     * @return 属性viewBox
     */
    public SVGLengthList getViewBox() {
        return this.viewBox;
    }

    /**
     * 属性viewBoxのセット
     * @param viewBox 属性viewBoxに与える値
     */
    public void setViewBox(SVGLengthList viewBox) {
        this.viewBox = viewBox;
        super.setAttribute("viewBox", this.viewBox.getAllItem());
    }
    public void setViewBox(String viewBox) {
        String[] list = viewBox.split(" ");     // 空白文字で区切ると想定
        for (int i = 0; i < list.length; i++) {
            this.viewBox.appendItem(list[i]);
        }
        super.setAttribute("viewBox", this.viewBox.getAllItem());
    }
}
