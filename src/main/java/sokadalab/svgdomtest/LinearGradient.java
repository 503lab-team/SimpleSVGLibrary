// <linearGradient>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class LinearGradient extends Gradient {
    private SVGLength x1 = new SVGLength();
    private SVGLength y1 = new SVGLength();
    private SVGLength x2 = new SVGLength();
    private SVGLength y2 = new SVGLength();

    public LinearGradient(Document document) {
        super(document, "linearGradient");
    }

    public SVGLength getX1() {
        return this.x1;
    }

    public SVGLength getY1() {
        return this.y1;
    }

    public SVGLength getX2() {
        return this.x2;
    }

    public SVGLength getY2() {
        return this.y2;
    }

    public void setX1(String x1) {
        this.x1.newValueSpecifiedUnit(x1);
        super.setAttribute("x1", this.x1.getValueAsString());
    }
    public void setX1(short unitType, float value) {
        this.x1.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("x1", this.x1.getValueAsString());
    }
    public void setX1(float x1) {
        this.x1.newValueSpecifiedUnit(x1);
        super.setAttribute("x1", this.x1.getValueAsString());
    }
    public void setX1(int x1) {
        this.x1.newValueSpecifiedUnit(x1);
        super.setAttribute("x1", this.x1.getValueAsString());
    }
    public void setX1(SVGLength x1) {
        this.x1 = x1;
        super.setAttribute("x1", this.x1.getValueAsString());
    }

    public void setY1(String y1) {
        this.y1.newValueSpecifiedUnit(y1);
        super.setAttribute("y1", this.y1.getValueAsString());
    }
    public void setY1(short unitType, float value) {
        this.y1.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("y1", this.y1.getValueAsString());
    }
    public void setY1(float y1) {
        this.y1.newValueSpecifiedUnit(y1);
        super.setAttribute("y1", this.y1.getValueAsString());
    }
    public void setY1(int y1) {
        this.y1.newValueSpecifiedUnit(y1);
        super.setAttribute("y1", this.y1.getValueAsString());
    }
    public void setY1(SVGLength y1) {
        this.y1 = y1;
        super.setAttribute("y1", this.y1.getValueAsString());
    }

    public void setX2(String x2) {
        this.x2.newValueSpecifiedUnit(x2);
        super.setAttribute("x2", this.x2.getValueAsString());
    }
    public void setX2(short unitType, float value) {
        this.x2.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("x2", this.x2.getValueAsString());
    }
    public void setX2(float x2) {
        this.x2.newValueSpecifiedUnit(x2);
        super.setAttribute("x2", this.x2.getValueAsString());
    }
    public void setX2(int x2) {
        this.x2.newValueSpecifiedUnit(x2);
        super.setAttribute("x2", this.x2.getValueAsString());
    }
    public void setX2(SVGLength x2) {
        this.x2 = x2;
        super.setAttribute("x2", this.x2.getValueAsString());
    }

    public void setY2(String y2) {
        this.y2.newValueSpecifiedUnit(y2);
        super.setAttribute("y2", this.y2.getValueAsString());
    }
    public void setY2(short unitType, float value) {
        this.y2.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("y2", this.y2.getValueAsString());
    }
    public void setY2(float y2) {
        this.y2.newValueSpecifiedUnit(y2);
        super.setAttribute("y2", this.y2.getValueAsString());
    }
    public void setY2(int y2) {
        this.y2.newValueSpecifiedUnit(y2);
        super.setAttribute("y2", this.y2.getValueAsString());
    }
    public void setY2(SVGLength y2) {
        this.y2 = y2;
        super.setAttribute("y2", this.y2.getValueAsString());
    }
}
