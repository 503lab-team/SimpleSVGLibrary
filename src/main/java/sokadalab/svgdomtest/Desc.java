package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * desc要素<br>
 * https://www.w3.org/TR/SVG11/struct.html#DescriptionAndTitleElements<br>
 * https://www.w3.org/TR/SVG11/struct.html#InterfaceSVGDescElement
 */
public class Desc extends SVGLangSpace {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Desc(Document document) {
        super(document, "desc");
    }
}
