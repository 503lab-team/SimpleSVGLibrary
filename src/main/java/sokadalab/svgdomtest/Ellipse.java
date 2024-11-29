// <ellipse>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Ellipse extends SVGElement {
    private SVGLength cx = new SVGLength();
    private SVGLength cy = new SVGLength();
    private SVGLength rx = new SVGLength();
    private SVGLength ry = new SVGLength();

    public Ellipse(Document document) {
        super(document, "ellipse");
    }

    public SVGLength getCX() {
        return this.cx;
    }

    public SVGLength getCY() {
        return this.cy;
    }

    public SVGLength getRX() {
        return this.rx;
    }

    public SVGLength getRY() {
        return this.ry;
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

    public void setRX(String rx) {
        this.rx.newValueSpecifiedUnit(rx);
        super.setAttribute("rx", this.rx.getValueAsString());
    }
    public void setRX(short unitType, float value){
        this.rx.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("rx", this.rx.getValueAsString());
    }
    public void setRX(float rx) {
        this.rx.newValueSpecifiedUnit(rx);
        super.setAttribute("rx", this.rx.getValueAsString());        
    }
    public void setRX(int rx) {
        this.rx.newValueSpecifiedUnit(rx);
        super.setAttribute("rx", this.rx.getValueAsString());        
    }
    public void setRX(SVGLength rx) {
        this.rx = rx;
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
    public void setRY(float ry) {
        this.ry.newValueSpecifiedUnit(ry);
        super.setAttribute("ry", this.ry.getValueAsString());        
    }
    public void setRY(int ry) {
        this.ry.newValueSpecifiedUnit(ry);
        super.setAttribute("ry", this.ry.getValueAsString());        
    }
    public void setRY(SVGLength ry) {
        this.ry = ry;
        super.setAttribute("ry", this.ry.getValueAsString());        
    }
}
