package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Font extends SVGElement {
    public Font(Document document) {
        super(document, "font");
    }

    public void setHorizOriginX(String hox) {
        super.setAttribute("horiz-origin-x", hox);
    }

    public void setHorizOriginY(String hoy) {
        super.setAttribute("horiz-origin-y", hoy);
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
}
