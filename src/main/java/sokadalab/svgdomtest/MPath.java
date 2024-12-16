package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * mpath要素<br>
 * https://www.w3.org/TR/SVG11/animate.html#MPathElement<br>
 * https://www.w3.org/TR/SVG11/animate.html#InterfaceSVGMPathElement
 */
public class MPath extends SVGElement {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public MPath(Document document) {
        super(document, "mpath");
    }
}
