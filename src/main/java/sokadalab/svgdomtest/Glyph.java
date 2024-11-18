package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Glyph extends SVGElement {
    Glyph(Document document) {
        super(document, "glyph");
    }

    void setD(String d) {
        super.setAttribute("d", d);
    }

    void setHorizAdvX(String hax) {
        super.setAttribute("horiz-adv-x", hax);
    }

    void setVertOriginX(String vox) {
        super.setAttribute("vert-origin-x", vox);
    }

    void setVertOriginY(String voy) {
        super.setAttribute("vert-origin-y", voy);
    }

    void setVertAdvY(String vay) {
        super.setAttribute("vert-adv-y", vay);
    }

    void setUnicode(String unicode) {
        super.setAttribute("unicode", unicode);
    }

    void setGlyphName(String glyphName) {
        super.setAttribute("glyph-name", glyphName);
    }

    void setOrientation(String orientation) {
        super.setAttribute("orientation", orientation);
    }

    void setArabicForm(String arabicForm) {
        super.setAttribute("arabic-form", arabicForm);
    }

    void setLang(String lang) {
        super.setAttribute("lang", lang);
    }
}
