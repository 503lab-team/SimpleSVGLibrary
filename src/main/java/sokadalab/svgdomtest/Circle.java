//ok
package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Circle extends SVGElement {
    private SVGLength cx;
    private SVGLength cy;
    private SVGLength r;
    
    Circle(Document document) {
        super(document, "circle");
        this.cx = new SVGLength();
        this.cy = new SVGLength();
        this.r = new SVGLength();
    }

    void setCX(String cx) {
        this.cx.newValueSpecifiedUnit(cx);
        super.setAttribute("cx", this.cx.getValueAsString());
    }
    void setCX(short unitType, float value){
        this.cx.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("cx", this.cx.getValueAsString());
    }
    void setCX(float value) {
        this.cx.newValueSpecifiedUnit(value);
        super.setAttribute("cx", this.cx.getValueAsString());        
    }
    void setCX(int value) {
        this.cx.newValueSpecifiedUnit(value);
        super.setAttribute("cx", this.cx.getValueAsString());        
    }

    void setCY(String cy) {
        this.cy.newValueSpecifiedUnit(cy);
        super.setAttribute("cy", this.cy.getValueAsString());
    }
    void setCY(short unitType, float value){
        this.cy.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("cy", this.cy.getValueAsString());
    }
    void setCY(float value) {
        this.cy.newValueSpecifiedUnit(value);
        super.setAttribute("cy", this.cy.getValueAsString());        
    }
    void setCY(int value) {
        this.cy.newValueSpecifiedUnit(value);
        super.setAttribute("cy", this.cy.getValueAsString());        
    }

    void setR(String r) {
        this.r.newValueSpecifiedUnit(r);
        super.setAttribute("r", this.r.getValueAsString());
    }
    void setR(short unitType, float value){
        this.r.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("r", this.r.getValueAsString());
    }
    void setR(float value) {
        this.r.newValueSpecifiedUnit(value);
        super.setAttribute("r", this.r.getValueAsString());        
    }
    void setR(int value) {
        this.r.newValueSpecifiedUnit(value);
        super.setAttribute("r", this.r.getValueAsString());        
    }
}