// <polyline>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Polyline extends SVGAnimatedPoints {
    public Polyline(Document document) {
        super(document, "polyline");
        super.setFill("none");
        super.setStrokeWidth("1");
        super.setStroke("black");
    }
}
