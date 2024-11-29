// <circle>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Circle extends SVGElement {
    private SVGLength cx = new SVGLength();
    private SVGLength cy = new SVGLength();
    private SVGLength r = new SVGLength();
    
    public Circle(Document document) {
        super(document, "circle");
    }

    public SVGLength getCX() {
        return this.cx;
    }

    public SVGLength getCY() {
        return this.cy;
    }

    public SVGLength getR() {
        return this.r;
    }

    public void setCX(String cx) {
        this.cx.newValueSpecifiedUnit(cx);
        super.setAttribute("cx", this.cx.getValueAsString());
    }
    public void setCX(short unitType, float value){
        this.cx.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("cx", this.cx.getValueAsString());
    }
    public void setCX(float cx) {
        this.cx.newValueSpecifiedUnit(cx);
        super.setAttribute("cx", this.cx.getValueAsString());        
    }
    public void setCX(int cx) {
        this.cx.newValueSpecifiedUnit(cx);
        super.setAttribute("cx", this.cx.getValueAsString());        
    }
    public void setCX(SVGLength cx) {
        this.cx = cx;
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
    public void setCY(float cy) {
        this.cy.newValueSpecifiedUnit(cy);
        super.setAttribute("cy", this.cy.getValueAsString());        
    }
    public void setCY(int cy) {
        this.cy.newValueSpecifiedUnit(cy);
        super.setAttribute("cy", this.cy.getValueAsString());        
    }
    public void setCY(SVGLength cy) {
        this.cy = cy;
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
    public void setR(float r) {
        this.r.newValueSpecifiedUnit(r);
        super.setAttribute("r", this.r.getValueAsString());        
    }
    public void setR(int r) {
        this.r.newValueSpecifiedUnit(r);
        super.setAttribute("r", this.r.getValueAsString());        
    }
    public void setR(SVGLength r) {
        this.r = r;
        super.setAttribute("r", this.r.getValueAsString());        
    }
}