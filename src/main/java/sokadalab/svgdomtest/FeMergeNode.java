package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feMergeNode要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feMergeNodeElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEMergeNodeElement
 */
public class FeMergeNode extends SVGElement {
    private String in;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeMergeNode(Document document) {
        super(document, "feMergeNode");
    }

    /**
     * 属性inの取得
     * @return 属性in
     */
    public String getIn() {
        return this.in;
    }

    /**
     * 属性inのセット
     * @param in 属性inに与える値
     */
    public void setIn(String in) {
        this.in = in;
        super.setAttribute("in", this.in);
    }
}
