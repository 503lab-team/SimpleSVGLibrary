package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class ClipPath extends SVGElement {
    ClipPath(Document document) {
        super(document, "clipPath");
    }

    void setClipPathUnits(String clipPathUnits) {
        super.setAttribute("clipPathUnits", clipPathUnits);
    }
}
