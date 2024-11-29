// <rect>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Rect extends SVGElement{
    private SVGLength x = new SVGLength();
    private SVGLength y = new SVGLength();
    private SVGLength width = new SVGLength();
    private SVGLength height = new SVGLength();
    private SVGLength rx = new SVGLength();
    private SVGLength ry = new SVGLength();

    public Rect(Document document){
        super(document, "rect");
    }

    public SVGLength getX() {
        return this.x;
    }

    public SVGLength getY() {
        return this.y;
    }

    public SVGLength getWidth() {
        return this.width;
    }

    public SVGLength getHeight() {
        return this.height;
    }

    public SVGLength getRX() {
        return this.rx;
    }

    public SVGLength getRY() {
        return this.ry;
    }

    public void setX(String x){
        this.x.newValueSpecifiedUnit(x);
        super.setAttribute("x", this.x.getValueAsString());
    }
    public void setX(short unitType, float value){
        this.x.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("x", this.x.getValueAsString());
    }
    public void setX(float x) {
        this.x.newValueSpecifiedUnit(x);
        super.setAttribute("x", this.x.getValueAsString());
    }
    public void setX(int x) {
        this.x.newValueSpecifiedUnit(x);
        super.setAttribute("x", this.x.getValueAsString());
    }
    public void setX(SVGLength x) {
        this.x = x;
        super.setAttribute("x", this.x.getValueAsString());
    }
    
    public void setY(String y){
        this.y.newValueSpecifiedUnit(y);
        super.setAttribute("y", this.y.getValueAsString());
    }
    public void setY(short unitType, float value){
        this.y.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("y", this.y.getValueAsString());
    }
    public void setY(float y){
        this.y.newValueSpecifiedUnit(y);
        super.setAttribute("y", this.y.getValueAsString());
    }
    public void setY(int y){
        this.y.newValueSpecifiedUnit(y);
        super.setAttribute("y", this.y.getValueAsString());
    }
    public void setY(SVGLength y){
        this.y = y;
        super.setAttribute("y", this.y.getValueAsString());
    }

    public void setWidth(String width){
        this.width.newValueSpecifiedUnit(width);
        super.setAttribute("width", this.width.getValueAsString());
    }
    public void setWidth(short unitType, float value){
        this.width.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("width", this.width.getValueAsString());
    }    
    public void setWidth(float width){
        this.width.newValueSpecifiedUnit(width);
        super.setAttribute("width", this.width.getValueAsString());
    }    
    public void setWidth(int width){
        this.width.newValueSpecifiedUnit(width);
        super.setAttribute("width", this.width.getValueAsString());
    }
    public void setWidth(SVGLength width) {
        this.width = width;
        super.setAttribute("width", this.width.getValueAsString());
    }

    public void setHeight(String height){
        this.height.newValueSpecifiedUnit(height);
        super.setAttribute("height", this.height.getValueAsString());
    }
    public void setHeight(short unitType, float value){
        this.height.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("height", this.height.getValueAsString());
    }    
    public void setHeight(float height){
        this.height.newValueSpecifiedUnit(height);
        super.setAttribute("height", this.height.getValueAsString());
    }    
    public void setHeight(int height){
        this.height.newValueSpecifiedUnit(height);
        super.setAttribute("height", this.height.getValueAsString());
    }
    public void setHeight(SVGLength height) {
        this.height = height;
        super.setAttribute("height", this.height.getValueAsString());
    }

    public void setRX(String rx) {
        this.rx.newValueSpecifiedUnit(rx);
        super.setAttribute("rx", this.rx.getValueAsString());
    }
    public void setRX(short unitType, float value){
        this.rx.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("rx", this.rx.getValueAsString());
    }    
    public void setRX(float rx){
        this.rx.newValueSpecifiedUnit(rx);
        super.setAttribute("rx", this.rx.getValueAsString());
    }    
    public void setRX(int rx){
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
    public void setRY(float ry){
        this.ry.newValueSpecifiedUnit(ry);
        super.setAttribute("ry", this.ry.getValueAsString());
    }    
    public void setRY(int ry){
        this.ry.newValueSpecifiedUnit(ry);
        super.setAttribute("ry", this.ry.getValueAsString());
    }
    public void setRY(SVGLength ry) {
        this.ry = ry;
        super.setAttribute("ry", this.ry.getValueAsString());
    }
}