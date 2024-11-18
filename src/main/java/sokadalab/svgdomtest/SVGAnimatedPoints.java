package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class SVGAnimatedPoints extends SVGElement {
    SVGPointList points;

    SVGAnimatedPoints(Document document, String name) {
        super(document, name);
        this.points = new SVGPointList();
    }

    void setPoints(String points) {
        super.setAttribute("points", points);
    }
}
