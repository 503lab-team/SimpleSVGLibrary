package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * font-face-name要素<br>
 * https://www.w3.org/TR/SVG11/fonts.html#FontFaceNameElement<br>
 * https://www.w3.org/TR/SVG11/fonts.html#InterfaceSVGFontFaceNameElement
 */
public class FontFaceName extends SVGElement {
    private String name;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FontFaceName(Document document) {
        super(document, "font-face-name");
    }

    /**
     * 属性nameの取得
     * @return 属性name
     */
    public String getName() {
        return this.name;
    }

    /**
     * 属性nameのセット
     * @param name 属性nameに与える値
     */
    public void setName(String name) {
        this.name = name;
        super.setAttribute("name", this.name);
    }
}
