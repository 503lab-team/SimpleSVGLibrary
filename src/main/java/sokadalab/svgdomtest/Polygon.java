// <polygon>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Polygon extends SVGAnimatedPoints {
    public Polygon(Document document) {
        super(document, "polygon");
    }    
}
