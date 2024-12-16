package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * title要素<br>
 * https://www.w3.org/TR/SVG11/struct.html#DescriptionAndTitleElements<br>
 * https://www.w3.org/TR/SVG11/struct.html#InterfaceSVGTitleElement
 */
public class Title extends SVGLangSpace {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Title(Document document) {
        super(document, "title");
    }
}
