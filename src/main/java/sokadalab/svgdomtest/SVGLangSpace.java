package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * 属性xml:langと属性xml:spaceを持つ<br>
 * テキストノードを持つクラスの基本になる<br>
 * Title、TextContentElement、Symbol、Defs、、Desc、Image、G、Switch、Style、Use、A、Metadataの基本となるクラス<br>
 * https://www.w3.org/TR/SVG11/struct.html#LangSpaceAttrs<br>
 * https://www.w3.org/TR/SVG11/types.html#InterfaceSVGLangSpace
 */
public class SVGLangSpace extends SVGElement {
    private String xmlLang;
    private String xmlSpace;

    /**
     * コンストラクタ
     * @param document ドキュメント
     * @param name 要素名
     */
    public SVGLangSpace(Document document, String name) {
        super(document, name);
    }

    /**
     * 属性xml:langの取得
     * @return 属性xml:lang
     */
    public String getXmlLang() {
        return this.xmlLang;
    }

    /**
     * 属性xml:spaceの取得
     * @return 属性xml:space
     */
    public String getXmlSpace() {
        return this.xmlSpace;
    }

    /**
     * 属性xml:langのセット
     * @param lang 属性xml:langに与える値
     */
    public void setXmlLang(String lang) {
        this.xmlLang = lang;
        super.setAttribute("xml:lang", this.xmlLang);
    }

    /**
     * 属性xml:spaceのセット
     * @param space 属性xml:spaceに与える値
     */
    public void setXmlSpace(String space) {
        this.xmlSpace = space;
        super.setAttribute("xml:space", this.xmlSpace);
    }
}
