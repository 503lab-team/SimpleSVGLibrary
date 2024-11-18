package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class TextContentElement extends SVGElement {
    public TextContentElement(Document document, String name) {
        super(document, name);
    }

    public void setXmlLang(String lang) {
        super.setAttribute("xml:lang", lang);
    }

    public void setXmlSpace(String space) {
        super.setAttribute("xml:space", space);
    }

    public void setFontSize(String fontsize) {
        super.setAttribute("font-size", fontsize);
    }
    public void setFontSize(float fontsize) {
        super.setAttribute("font-size", Float.toString(fontsize));
    }
    public void setFontSize(int fontsize) {
        super.setAttribute("font-size", Integer.toString(fontsize));
    }
}
