//ok
package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Ellipse extends SVGElement {
    private SVGLength cx;
    private SVGLength cy;
    private SVGLength rx;
    private SVGLength ry;

    public Ellipse(Document document) {
        super(document, "ellipse");
        this.cx = new SVGLength();
        this.cy = new SVGLength();
        this.rx = new SVGLength();
        this.ry = new SVGLength();
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

    public void setRX(String rx) {
        this.rx.newValueSpecifiedUnit(rx);
        super.setAttribute("rx", this.rx.getValueAsString());
    }
    public void setRX(short unitType, float value){
        this.rx.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("rx", this.rx.getValueAsString());
    }
    public void setRX(float value) {
        this.rx.newValueSpecifiedUnit(value);
        super.setAttribute("rx", this.rx.getValueAsString());        
    }
    public void setRX(int value) {
        this.rx.newValueSpecifiedUnit(value);
        super.setAttribute("rx", this.rx.getValueAsString());        
    }

    public void setRY(String ry) {
        this.ry.newValueSpecifiedUnit(ry);
        super.setAttribute("ry", this.ry.getValueAsString());
    }
    public void setRY(short unitType, float value){
        this.ry.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("ry", this.ry.getValueAsString());
    }
    public void setRY(float value) {
        this.ry.newValueSpecifiedUnit(value);
        super.setAttribute("ry", this.ry.getValueAsString());        
    }
    public void setRY(int value) {
        this.ry.newValueSpecifiedUnit(value);
        super.setAttribute("ry", this.ry.getValueAsString());        
    }
}
