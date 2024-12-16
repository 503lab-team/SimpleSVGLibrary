package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * font-face-uri要素<br>
 * https://www.w3.org/TR/SVG11/fonts.html#FontFaceURIElement<br>
 * https://www.w3.org/TR/SVG11/fonts.html#InterfaceSVGFontFaceUriElement
 */
public class FontFaceUri extends SVGElement {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FontFaceUri(Document document) {
        super(document, "font-face-uri");
    }
}
