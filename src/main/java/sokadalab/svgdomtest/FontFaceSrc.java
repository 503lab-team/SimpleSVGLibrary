package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * font-face-src要素<br>
 * https://www.w3.org/TR/SVG11/fonts.html#FontFaceSrcElement<br>
 * https://www.w3.org/TR/SVG11/fonts.html#InterfaceSVGFontFaceSrcElement
 */
public class FontFaceSrc extends SVGElement {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FontFaceSrc(Document document) {
        super(document, "font-face-src");
    }
}
