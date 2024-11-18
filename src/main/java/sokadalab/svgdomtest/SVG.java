package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class SVG extends SVGElement{
    private SVGLength x = new SVGLength();
    private SVGLength y = new SVGLength();
    private SVGLength width = new SVGLength();
    private SVGLength height = new SVGLength();
    private SVGRect viewport = new SVGRect();
    private float pixelUnitToMillimeterX;
    private float pixelUnitToMillimeterY;
    private float screenPixelToMillimeterX;
    private float screenPixelToMillimeterY;
    private SVGPoint currentTranslate = new SVGPoint();
    private String contentScriptType;
    private String contentStyleType;
    private boolean useCurrentView;
    private float currentScale;
    
    public SVG(Document document){
        super(document, "svg");
        super.setAttribute("xmlns", "http://www.w3.org/2000/svg");
    }

    public void setX(String x){
        super.setAttribute("x", x);
    }
    public void setX(short unitType, float value){
        this.x.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("x", this.x.getValueAsString());
    }
    
    public void setY(String y){
        super.setAttribute("y", y);
    }
    public void setY(short unitType, float value){
        this.y.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("y", this.y.getValueAsString());
    }    

    public void setWidth(String width){
        super.setAttribute("width", width);
    }
    public void setWidth(short unitType, float value){
        this.width.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("width", this.width.getValueAsString());
    }    

    public void setHeight(String height){
        super.setAttribute("height", height);
    }
    public void setHeight(short unitType, float value){
        this.height.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("height", this.height.getValueAsString());
    }    

    public void setViewbox(String viewbox) {
        super.setAttribute("viewBox", viewbox);
    }

    public SVGNumber createSVGNumber(){
        return new SVGNumber();
    }

    public SVGLength createSVGLength(){
        return new SVGLength();
    }
    
    public SVGRect createSVGRect() {
        return new SVGRect();
    }
}
