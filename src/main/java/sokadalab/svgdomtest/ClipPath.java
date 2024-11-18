package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class ClipPath extends SVGElement {
    public ClipPath(Document document) {
        super(document, "clipPath");
    }

    public void setClipPathUnits(String clipPathUnits) {
        super.setAttribute("clipPathUnits", clipPathUnits);
    }
}
