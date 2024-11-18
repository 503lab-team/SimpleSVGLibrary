package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class SVG extends SVGElement{
    private SVGLength x;
    private SVGLength y;
    private SVGLength width;
    private SVGLength height;
    private SVGRect viewport;
    private float pixelUnitToMillimeterX;
    private float pixelUnitToMillimeterY;
    private float screenPixelToMillimeterX;
    private float screenPixelToMillimeterY;
    private SVGPoint currentTranslate;
    String contentScriptType;
    String contentStyleType;
    boolean useCurrentView;
    float currentScale;
    
    SVG(Document document){
        super(document, "svg");
        super.setAttribute("xmlns", "http://www.w3.org/2000/svg");
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

    void setViewbox(String viewbox) {
        super.setAttribute("viewBox", viewbox);
    }

    SVGNumber createSVGNumber(){
        return new SVGNumber();
    }

    SVGLength createSVGLength(){
        return new SVGLength();
    }
    
    SVGRect createSVGRect() {
        return new SVGRect();
    }
}
