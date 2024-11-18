package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Cursor extends SVGElement {
    private SVGLength x;
    private SVGLength y;

    Cursor(Document document) {
        super(document, "cursor");
    }

    void setX(String x) {
        super.setAttribute("x", x);
    }
    void setX(short unitType, float value){
        this.x.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("x", this.x.getValueAsString());
    }

    void setY(String y) {
        super.setAttribute("y", y);
    }
    void setY(short unitType, float value){
        this.y.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("y", this.y.getValueAsString());
    }    

    void setHref(String href) {
        super.setAttribute("href", href);
    }
}
