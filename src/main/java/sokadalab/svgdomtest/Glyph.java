package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Glyph extends SVGElement {
    public Glyph(Document document) {
        super(document, "glyph");
    }

    public void setD(String d) {
        super.setAttribute("d", d);
    }

    public void setHorizAdvX(String hax) {
        super.setAttribute("horiz-adv-x", hax);
    }

    public void setVertOriginX(String vox) {
        super.setAttribute("vert-origin-x", vox);
    }

    public void setVertOriginY(String voy) {
        super.setAttribute("vert-origin-y", voy);
    }

    public void setVertAdvY(String vay) {
        super.setAttribute("vert-adv-y", vay);
    }

    public void setUnicode(String unicode) {
        super.setAttribute("unicode", unicode);
    }

    public void setGlyphName(String glyphName) {
        super.setAttribute("glyph-name", glyphName);
    }

    public void setOrientation(String orientation) {
        super.setAttribute("orientation", orientation);
    }

    public void setArabicForm(String arabicForm) {
        super.setAttribute("arabic-form", arabicForm);
    }

    public void setLang(String lang) {
        super.setAttribute("lang", lang);
    }
}
