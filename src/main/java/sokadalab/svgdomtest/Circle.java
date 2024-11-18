//ok
package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Circle extends SVGElement {
    private SVGLength cx;
    private SVGLength cy;
    private SVGLength r;
    
    public Circle(Document document) {
        super(document, "circle");
        this.cx = new SVGLength();
        this.cy = new SVGLength();
        this.r = new SVGLength();
    }

    public void setCX(String cx) {
        this.cx.newValueSpecifiedUnit(cx);
        super.setAttribute("cx", this.cx.getValueAsString());
    }
    public void setCX(short unitType, float value){
        this.cx.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("cx", this.cx.getValueAsString());
    }
    public void setCX(float value) {
        this.cx.newValueSpecifiedUnit(value);
        super.setAttribute("cx", this.cx.getValueAsString());        
    }
    public void setCX(int value) {
        this.cx.newValueSpecifiedUnit(value);
        super.setAttribute("cx", this.cx.getValueAsString());        
    }

    public void setCY(String cy) {
        this.cy.newValueSpecifiedUnit(cy);
        super.setAttribute("cy", this.cy.getValueAsString());
    }
    public void setCY(short unitType, float value){
        this.cy.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("cy", this.cy.getValueAsString());
    }
    public void setCY(float value) {
        this.cy.newValueSpecifiedUnit(value);
        super.setAttribute("cy", this.cy.getValueAsString());        
    }
    public void setCY(int value) {
        this.cy.newValueSpecifiedUnit(value);
        super.setAttribute("cy", this.cy.getValueAsString());        
    }

    public void setR(String r) {
        this.r.newValueSpecifiedUnit(r);
        super.setAttribute("r", this.r.getValueAsString());
    }
    public void setR(short unitType, float value){
        this.r.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("r", this.r.getValueAsString());
    }
    public void setR(float value) {
        this.r.newValueSpecifiedUnit(value);
        super.setAttribute("r", this.r.getValueAsString());        
    }
    public void setR(int value) {
        this.r.newValueSpecifiedUnit(value);
        super.setAttribute("r", this.r.getValueAsString());        
    }
}