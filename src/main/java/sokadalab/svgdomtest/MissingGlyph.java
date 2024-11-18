package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class MissingGlyph extends SVGElement {
    MissingGlyph(Document document) {
        super(document, "missing-glyph");
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
}
