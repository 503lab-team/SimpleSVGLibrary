package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feFuncA要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feFuncAElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEFuncAElement
 */
public class FeFuncA extends FeComponentTransferFunction {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeFuncA(Document document) {
        super(document, "feFuncA");
    }
}
