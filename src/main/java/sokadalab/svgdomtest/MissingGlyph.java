package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class MissingGlyph extends SVGElement {
    public MissingGlyph(Document document) {
        super(document, "missing-glyph");
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
}
