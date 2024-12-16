package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * altGlyphItem要素<br>
 * https://www.w3.org/TR/SVG11/text.html#AlternateGlyphDefinitions<br>
 * https://www.w3.org/TR/SVG11/text.html#InterfaceSVGAltGlyphItemElement
 */
public class AltGlyphItem extends SVGElement {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public AltGlyphItem(Document document) {
        super(document, "altGlyphItem");
    }
}
