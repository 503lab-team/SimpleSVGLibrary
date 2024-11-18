//ok
package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Ellipse extends SVGElement {
    private SVGLength cx;
    private SVGLength cy;
    private SVGLength rx;
    private SVGLength ry;

    Ellipse(Document document) {
        super(document, "ellipse");
        this.cx = new SVGLength();
        this.cy = new SVGLength();
        this.rx = new SVGLength();
        this.ry = new SVGLength();
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

    void setRX(String rx) {
        this.rx.newValueSpecifiedUnit(rx);
        super.setAttribute("rx", this.rx.getValueAsString());
    }
    void setRX(short unitType, float value){
        this.rx.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("rx", this.rx.getValueAsString());
    }
    void setRX(float value) {
        this.rx.newValueSpecifiedUnit(value);
        super.setAttribute("rx", this.rx.getValueAsString());        
    }
    void setRX(int value) {
        this.rx.newValueSpecifiedUnit(value);
        super.setAttribute("rx", this.rx.getValueAsString());        
    }

    void setRY(String ry) {
        this.ry.newValueSpecifiedUnit(ry);
        super.setAttribute("ry", this.ry.getValueAsString());
    }
    void setRY(short unitType, float value){
        this.ry.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("ry", this.ry.getValueAsString());
    }
    void setRY(float value) {
        this.ry.newValueSpecifiedUnit(value);
        super.setAttribute("ry", this.ry.getValueAsString());        
    }
    void setRY(int value) {
        this.ry.newValueSpecifiedUnit(value);
        super.setAttribute("ry", this.ry.getValueAsString());        
    }
}
