package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * script要素<br>
 * https://www.w3.org/TR/SVG11/script.html#ScriptElement<br>
 * https://www.w3.org/TR/SVG11/script.html#InterfaceSVGScriptElement
 */
public class Script extends SVGElement {
    private String type;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Script(Document document) {
        super(document, "script");
    }

    /**
     * 属性typeの取得
     * @return 属性type
     */
    public String getType() {
        return this.type;
    }

    /**
     * 属性typeのセット
     * @param type 属性typeに与える値
     */
    public void setType(String type) {
        this.type = type;
        super.setAttribute("type", this.type);
    }
}
