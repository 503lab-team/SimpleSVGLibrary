package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class ForeignObject extends SVGElement {
    private SVGLength x;
    private SVGLength y;
    private SVGLength width;
    private SVGLength height;

    ForeignObject(Document document) {
        super(document, "foreignObject");
    }

    void setX(String x){
        super.setAttribute("x", x);
    }
    void setX(short unitType, float value){
        this.x.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("x", this.x.getValueAsString());
    }
    
    void setY(String y){
        super.setAttribute("y", y);
    }
    void setY(short unitType, float value){
        this.y.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("y", this.y.getValueAsString());
    }    

    void setWidth(String width){
        super.setAttribute("width", width);
    }
    void setWidth(short unitType, float value){
        this.width.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("width", this.width.getValueAsString());
    }    

    void setHeight(String height){
        super.setAttribute("height", height);
    }
    void setHeight(short unitType, float value){
        this.height.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("height", this.height.getValueAsString());
    }    
}
