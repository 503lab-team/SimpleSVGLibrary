package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Cursor extends SVGElement {
    private SVGLength x;
    private SVGLength y;

    public Cursor(Document document) {
        super(document, "cursor");
    }

    public void setX(String x) {
        super.setAttribute("x", x);
    }
    public void setX(short unitType, float value){
        this.x.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("x", this.x.getValueAsString());
    }

    public void setY(String y) {
        super.setAttribute("y", y);
    }
    public void setY(short unitType, float value){
        this.y.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("y", this.y.getValueAsString());
    }    

    public void setHref(String href) {
        super.setAttribute("href", href);
    }
}
