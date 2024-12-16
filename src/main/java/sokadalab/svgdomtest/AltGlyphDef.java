package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * altGlyphDef要素<br>
 * https://www.w3.org/TR/SVG11/text.html#AlternateGlyphDefinitions<br>
 * https://www.w3.org/TR/SVG11/text.html#InterfaceSVGAltGlyphDefElement
 */
public class AltGlyphDef extends SVGElement {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public AltGlyphDef(Document document) {
        super(document, "altGlyphDef");
    }
}
