package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Pattern extends SVGElement{
    private SVGLength x;
    private SVGLength y;
    private SVGLength width;
    private SVGLength height;

    public Pattern(Document document) {
        super(document, "pattern");
        this.x = new SVGLength();
        this.y = new SVGLength();
        this.width = new SVGLength();
        this.height = new SVGLength();
    }

    public void setX(String x){
          super.setAttribute("x", x);
    }
    public void setX(short unitType, float value) {
        this.x.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("x", this.x.getValueAsString());
    }

    public void setY(String y){
          super.setAttribute("y", y);
    }
    public void setY(short unitType, float value) {
        this.y.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("y", this.y.getValueAsString());
    }

    public void setWidth(String width){
          super.setAttribute("width", width);
    }
    public void setWidth(short unitType, float value) {
        this.width.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("width", this.width.getValueAsString());
    }

    public void setHeight(String height){
        super.setAttribute("height", height);
    }
    public void setHeight(short unitType, float value) {
        this.height.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("height", this.height.getValueAsString());
    }

    public void setPatternUnits(String pattern_units) {
        super.setAttribute("patternUnits", pattern_units);
    }

    public void setViewBox(String view_box) {
        super.setAttribute("viewBox", view_box);
    }

    public void setHref(String href) {
        super.setAttribute("href", href);
    }
}
