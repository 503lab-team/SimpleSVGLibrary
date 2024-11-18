package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Vkern extends SVGElement {
    Vkern(Document document) {
        super(document, "hkern");
    }

    void setU1(String u1) {
        super.setAttribute("u1", u1);
    }

    void setG1(String g1) {
        super.setAttribute("g1", g1);
    }
    void setU2(String u2) {
        super.setAttribute("u2", u2);
    }
    void setG2(String g2) {
        super.setAttribute("g2", g2);
    }
    void setK(String k) {
        super.setAttribute("k", k);
    }
}
