package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feFuncG要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feFuncGElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEFuncGElement
 */
public class FeFuncG extends FeComponentTransferFunction {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeFuncG(Document document) {
        super(document, "feFuncG");
    }
}
