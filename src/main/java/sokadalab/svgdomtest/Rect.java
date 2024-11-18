//ok
package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Rect extends SVGElement{
    private SVGLength x;
    private SVGLength y;
    private SVGLength width;
    private SVGLength height;
    private SVGLength rx;
    private SVGLength ry;

    public Rect(Document document){
        super(document, "rect");
        this.x = new SVGLength();
        this.y = new SVGLength();
        this.width = new SVGLength();
        this.height = new SVGLength();
        this.rx = new SVGLength();
        this.ry = new SVGLength();
    }

    public void setX(String x){
        this.x.newValueSpecifiedUnit(x);
        super.setAttribute("x", this.x.getValueAsString());
    }
    public void setX(short unitType, float value){
        this.x.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("x", this.x.getValueAsString());
    }
    public void setX(float value) {
        this.x.newValueSpecifiedUnit(value);
        super.setAttribute("x", this.x.getValueAsString());
    }
    public void setX(int value) {
        this.x.newValueSpecifiedUnit(value);
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
    public void setY(float value){
        this.y.newValueSpecifiedUnit(value);
        super.setAttribute("y", this.y.getValueAsString());
    }
    public void setY(int value){
        this.y.newValueSpecifiedUnit(value);
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
    public void setWidth(float value){
        this.width.newValueSpecifiedUnit(value);
        super.setAttribute("width", this.width.getValueAsString());
    }    
    public void setWidth(int value){
        this.width.newValueSpecifiedUnit(value);
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
    public void setHeight(float value){
        this.height.newValueSpecifiedUnit(value);
        super.setAttribute("height", this.height.getValueAsString());
    }    
    public void setHeight(int value){
        this.height.newValueSpecifiedUnit(value);
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
    public void setRX(float value){
        this.rx.newValueSpecifiedUnit(value);
        super.setAttribute("rx", this.rx.getValueAsString());
    }    
    public void setRX(int value){
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
    public void setRY(float value){
        this.ry.newValueSpecifiedUnit(value);
        super.setAttribute("ry", this.ry.getValueAsString());
    }    
    public void setRY(int value){
        this.ry.newValueSpecifiedUnit(value);
        super.setAttribute("ry", this.ry.getValueAsString());
    }    
}