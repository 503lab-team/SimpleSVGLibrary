package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * tspan要素<br>
 * https://www.w3.org/TR/SVG11/text.html#TSpanElement<br>
 * https://www.w3.org/TR/SVG11/text.html#InterfaceSVGTSpanElement
 */
public class Tspan extends TextPositioningElement {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Tspan(Document document) {
        super(document, "tspan");
    }
}
