// <clipPath>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class ClipPath extends SVGElement {
    private String clipPathUnits;

    public ClipPath(Document document) {
        super(document, "clipPath");
    }

    public String getClipPathUnits() {
        return this.clipPathUnits;
    }

    public void setClipPathUnits(String clipPathUnits) {
        this.clipPathUnits = clipPathUnits;
        super.setAttribute("clipPathUnits", getClipPathUnits());
    }
}
