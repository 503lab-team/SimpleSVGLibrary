package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class TextContentElement extends SVGElement {
    TextContentElement(Document document, String name) {
        super(document, name);
    }

    void setXmlLang(String lang) {
        super.setAttribute("xml:lang", lang);
    }

    void setXmlSpace(String space) {
        super.setAttribute("xml:space", space);
    }

    void setFontSize(String fontsize) {
        super.setAttribute("font-size", fontsize);
    }
    void setFontSize(float fontsize) {
        super.setAttribute("font-size", Float.toString(fontsize));
    }
    void setFontSize(int fontsize) {
        super.setAttribute("font-size", Integer.toString(fontsize));
    }
}
