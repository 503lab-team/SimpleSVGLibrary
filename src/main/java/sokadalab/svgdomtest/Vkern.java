package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Vkern extends SVGElement {
    public Vkern(Document document) {
        super(document, "hkern");
    }

    public void setU1(String u1) {
        super.setAttribute("u1", u1);
    }

    public void setG1(String g1) {
        super.setAttribute("g1", g1);
    }
    public void setU2(String u2) {
        super.setAttribute("u2", u2);
    }
    public void setG2(String g2) {
        super.setAttribute("g2", g2);
    }
    public void setK(String k) {
        super.setAttribute("k", k);
    }
}
