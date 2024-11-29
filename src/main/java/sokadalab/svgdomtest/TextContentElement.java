package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class TextContentElement extends SVGElement {
    private String xmlLang;
    private String xmlSpace;
    private String fontFamily;
    private float fontSize;

    public TextContentElement(Document document, String name) {
        super(document, name);
    }

    public String getXmlLang() {
        return this.xmlLang;
    }

    public String getXmlSpace() {
        return this.xmlSpace;
    }

    public String getFontFamily() {
        return this.fontFamily;
    }

    public float getFontSize() {
        return this.fontSize;
    }

    public void setXmlLang(String lang) {
        this.xmlLang = lang;
        super.setAttribute("xml:lang", this.xmlLang);
    }

    public void setXmlSpace(String space) {
        this.xmlSpace = space;
        super.setAttribute("xml:space", this.xmlSpace);
    }

    public void setFontFamily(String family) {
        this.fontFamily = family;
        super.setAttribute("font-family", this.fontFamily);
    }

    public void setFontSize(String size) {
        this.fontSize = Float.parseFloat(size);
        super.setAttribute("font-size", String.valueOf(this.fontSize));
    }
    public void setFontSize(float size) {
        this.fontSize = size;
        super.setAttribute("font-size", String.valueOf(this.fontSize));
    }
    public void setFontSize(int size) {
        this.fontSize = size;
        super.setAttribute("font-size", String.valueOf(this.fontSize));
    }
}
