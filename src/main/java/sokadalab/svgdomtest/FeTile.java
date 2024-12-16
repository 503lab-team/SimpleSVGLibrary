package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feTile要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feTileElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFETileElement
 */
public class FeTile extends FeStandardAttributes {
    private String in;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeTile(Document document) {
        super(document, "feTile");
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
