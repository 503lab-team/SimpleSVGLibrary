package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * tref要素<br>
 * https://www.w3.org/TR/SVG11/text.html#TRefElement<br>
 * https://www.w3.org/TR/SVG11/text.html#InterfaceSVGTRefElement
 */
public class Tref extends TextPositioningElement {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Tref(Document document) {
        super(document, "tref");
    }
}
