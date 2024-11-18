//ok
package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class RadialGradient extends Gradient {
    private SVGLength cx;
    private SVGLength cy;
    private SVGLength r;
    private SVGLength fx;
    private SVGLength fy;

    public RadialGradient(Document document) {
        super(document, "radialGradient");
        this.cx = new SVGLength();
        this.cy = new SVGLength();
        this.r = new SVGLength();
        this.fx = new SVGLength();
        this.fy = new SVGLength();
    }

    public void setCX(String cx) {
        this.cx.newValueSpecifiedUnit(cx);
        super.setAttribute("cx", this.cx.getValueAsString());
    }
    public void setCX(short unitType, float value) {
        this.cx.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("cx", this.cx.getValueAsString());
    }

    public void setCY(String cy) {
        this.cy.newValueSpecifiedUnit(cy);
        super.setAttribute("cy", this.cy.getValueAsString());
    }
    public void setCY(short unitType, float value) {
        this.cy.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("cy", this.cy.getValueAsString());
    }

    public void setR(String r) {
        this.r.newValueSpecifiedUnit(r);
        super.setAttribute("r", this.r.getValueAsString());
    }
    public void setR(short unitType, float value) {
        this.r.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("r", this.r.getValueAsString());
    }

    public void setFX(String fx) {
        this.fx.newValueSpecifiedUnit(fx);
        super.setAttribute("fx", this.fx.getValueAsString());
    }
    public void setFX(short unitType, float value) {
        this.fx.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("fx", this.fx.getValueAsString());
    }

    public void setFY(String fy) {
        this.fy.newValueSpecifiedUnit(fy);
        super.setAttribute("fy", this.fy.getValueAsString());
    }
    public void setXFY(short unitType, float value) {
        this.fy.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("fy", this.fy.getValueAsString());
    }
}
