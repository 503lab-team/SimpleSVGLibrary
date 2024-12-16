package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * font-face-format要素<br>
 * https://www.w3.org/TR/SVG11/fonts.html#FontFaceFormatElement<br>
 * https://www.w3.org/TR/SVG11/fonts.html#InterfaceSVGFontFaceFormatElement
 */
public class FontFaceFormat extends SVGElement {
    private String string;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FontFaceFormat(Document document) {
        super(document, "font-face-format");
    }

    /**
     * 属性stringの取得
     * @return 属性string
     */
    public String getString() {
        return this.string;
    }

    /**
     * 属性stringのセット
     * @param string 属性stringに与える値
     */
    public void setString(String string) {
        this.string = string;
        super.setAttribute("string", this.string);
    }
}