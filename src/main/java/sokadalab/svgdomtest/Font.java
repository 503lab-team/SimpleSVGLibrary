package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Font extends SVGElement {
    Font(Document document) {
        super(document, "font");
    }

    void setHorizOriginX(String hox) {
        super.setAttribute("horiz-origin-x", hox);
    }

    void setHorizOriginY(String hoy) {
        super.setAttribute("horiz-origin-y", hoy);
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
