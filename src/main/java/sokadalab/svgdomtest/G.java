package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * g要素<br>
 * https://www.w3.org/TR/SVG11/struct.html#Groups<br>
 * https://www.w3.org/TR/SVG11/struct.html#InterfaceSVGGElement
 */
public class G extends SVGLangSpace {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public G(Document document) {
        super(document, "g");
    }
}