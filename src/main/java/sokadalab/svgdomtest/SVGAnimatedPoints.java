package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class SVGAnimatedPoints extends SVGElement {
    public SVGPointList points;

    public SVGAnimatedPoints(Document document, String name) {
        super(document, name);
        this.points = new SVGPointList();
    }

    public void setPoints(String points) {
        super.setAttribute("points", points);
    }
}
