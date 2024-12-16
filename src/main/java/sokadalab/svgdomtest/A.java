package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * a要素<br>
 * https://www.w3.org/TR/SVG11/linking.html#Links<br>
 * https://www.w3.org/TR/SVG11/linking.html#InterfaceSVGAElement
 */
public class A extends SVGLangSpace {
    private String target;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public A(Document document) {
        super(document, "a");
    }

    /**
     * 属性targetの取得
     * @return 属性target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * 属性targetのセット
     * @param target 属性targetに与える値
     */
    public void setTarget(String target) {
        this.target = target;
        super.setAttribute("target", this.target);
    }
}
