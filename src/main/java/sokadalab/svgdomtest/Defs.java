package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * defs要素<br>
 * https://www.w3.org/TR/SVG11/struct.html#DefsElement<br>
 * https://www.w3.org/TR/SVG11/struct.html#InterfaceSVGDefsElement
 */
public class Defs extends SVGLangSpace {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Defs(Document document) {
        super(document, "defs");
    }
}
