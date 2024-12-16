package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feComponentTransfer要素
 * https://www.w3.org/TR/SVG11/filters.html#feComponentTransferElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEComponentTransferElement
 */
public class FeComponentTransfer extends FeStandardAttributes {
    private String in;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeComponentTransfer(Document document) {
        super(document, "feComponentTransfer");
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
