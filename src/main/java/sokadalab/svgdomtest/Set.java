package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * set要素<br>
 * https://www.w3.org/TR/SVG11/animate.html#SetElement<br>
 * https://www.w3.org/TR/SVG11/animate.html#InterfaceSVGSetElement
 */
public class Set extends Animation {
    private String to;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Set(Document document) {
        super(document, "set");
    }

    /**
     * 属性toの取得
     * @return 属性to
     */
    public String getTo() {
        return this.to;
    }

    /**
     * 属性toのセット
     * @param to 属性toに与える値
     */
    public void setTo(String to) {
        this.to = to;
        super.setAttribute("to", this.to);
    }
}
