package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feFuncR要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feFuncRElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEFuncRElement
 */
public class FeFuncR extends FeComponentTransferFunction {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeFuncR(Document document) {
        super(document, "feFuncR");
    }
}
