package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feFuncB要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feFuncBElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEFuncBElement
 */
public class FeFuncB extends FeComponentTransferFunction {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeFuncB(Document document) {
        super(document, "feFuncB");
    }
}
