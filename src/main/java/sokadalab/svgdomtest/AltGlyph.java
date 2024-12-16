package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * altGlyph要素<br>
 * https://www.w3.org/TR/SVG11/text.html#AltGlyphElement<br>
 * https://www.w3.org/TR/SVG11/text.html#InterfaceSVGAltGlyphElement
 */
public class AltGlyph extends TextPositioningElement {
    private String glyphRef;
    private String format;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public AltGlyph(Document document) {
        super(document, "altGlyph");
    }

    /**
     * 属性glyphRefを取得
     * @return 属性glyphRef
     */
    public String getGlyphRef() {
        return this.glyphRef;
    }

    /**
     * 属性formatを取得
     * @return 属性format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * 属性glyphRefをセット
     * @param glyphRef 属性glyphRefに与える値
     */
    public void setGlyphRef(String glyphRef) {
        this.glyphRef = glyphRef;
        super.setAttribute("glyphRef", glyphRef);
    }

    /**
     * 属性formatをセット
     * @param format 属性formatに与える値
     */
    public void setFormat(String format) {
        this.format = format;
        super.setAttribute("format", format);
    }
}
