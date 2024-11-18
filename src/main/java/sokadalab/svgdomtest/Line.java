//ok
package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Line extends SVGElement {
    private SVGLength x1 = new SVGLength();
    private SVGLength y1 = new SVGLength();
    private SVGLength x2 = new SVGLength();
    private SVGLength y2 = new SVGLength();

    public Line(Document document) {
        super(document, "line");
    }

    public void setX1(String x1) {
        this.x1.newValueSpecifiedUnit(x1);
        super.setAttribute("x1", this.x1.getValueAsString());
    }
    public void setX1(short unitType, float value){
        this.x1.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("x1", this.x1.getValueAsString());
    }

    public void setY1(String y1) {
        this.y1.newValueSpecifiedUnit(y1);
        super.setAttribute("y1", this.y1.getValueAsString());
    }
    public void setY1(short unitType, float value){
        this.y1.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("y1", this.y1.getValueAsString());
    }

    public void setX2(String x2) {
        this.x2.newValueSpecifiedUnit(x2);
        super.setAttribute("x2", this.x2.getValueAsString());
    }
    public void setX2(short unitType, float value){
        this.x2.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("x2", this.x2.getValueAsString());
    }

    public void setY2(String y2) {
        this.y2.newValueSpecifiedUnit(y2);
        super.setAttribute("y2", this.y2.getValueAsString());
    }
    public void setY2(short unitType, float value){
        this.y2.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("y2", this.y2.getValueAsString());
    }
}
