// <pattern>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Pattern extends SVGElement{
    private SVGLength x = new SVGLength();
    private SVGLength y = new SVGLength();
    private SVGLength width = new SVGLength();
    private SVGLength height = new SVGLength();
    private short patternUnits;
    private short patternContentUnits;
    private String patternTransform;
    private String href;
    private SVGLengthList viewBox = new SVGLengthList();

    public Pattern(Document document) {
        super(document, "pattern");
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

    public short getPatternUnits() {
        return this.patternUnits;
    }

    public short getPatternContentUnits() {
        return this.patternContentUnits;
    }

    public String getPatternTransform() {
        return this.patternTransform;
    }

    public String getHref() {
        return this.href;
    }

    public SVGLengthList getViewBox() {
        return this.viewBox;
    }

    public void setX(String x){
        this.x.newValueSpecifiedUnit(x);
        super.setAttribute("x", this.x.getValueAsString());
    }
    public void setX(short unitType, float value) {
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
    public void setY(short unitType, float value) {
        this.y.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("y", this.y.getValueAsString());
    }
    public void setY(float y) {
        this.y.newValueSpecifiedUnit(y);
        super.setAttribute("y", this.y.getValueAsString());
    }
    public void setY(int y) {
        this.y.newValueSpecifiedUnit(y);
        super.setAttribute("y", this.y.getValueAsString());
    }
    public void setY(SVGLength y) {
        this.y = y;
        super.setAttribute("y", this.y.getValueAsString());
    }

    public void setWidth(String width){
        this.width.newValueSpecifiedUnit(width);
        super.setAttribute("width", this.width.getValueAsString());
    }
    public void setWidth(short unitType, float value) {
        this.width.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("width", this.width.getValueAsString());
    }
    public void setWidth(float width) {
        this.width.newValueSpecifiedUnit(width);
        super.setAttribute("width", this.width.getValueAsString());
    }
    public void setWidth(int width) {
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
    public void setHeight(short unitType, float value) {
        this.height.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("height", this.height.getValueAsString());
    }
    public void setHeight(float height) {
        this.height.newValueSpecifiedUnit(height);
        super.setAttribute("height", this.height.getValueAsString());
    }
    public void setHeight(int height) {
        this.height.newValueSpecifiedUnit(height);
        super.setAttribute("height", this.height.getValueAsString());
    }
    public void setHeight(SVGLength height) {
        this.height = height;
        super.setAttribute("height", this.height.getValueAsString());
    }

    public void setPatternUnits(String patternUnits) {
        this.patternUnits = SVGUnitTypes.stringToUnitType(patternUnits);
        super.setAttribute("patternUnits", SVGUnitTypes.unitTypeToString(this.patternUnits));
    }
    public void setPatternUnits(short patternUnits) {
        this.patternUnits = patternUnits;
        super.setAttribute("patternUnits", SVGUnitTypes.unitTypeToString(this.patternUnits));
    }

    public void setPatternContentUnits(String patternContentUnits) {
        this.patternContentUnits = SVGUnitTypes.stringToUnitType(patternContentUnits);
        super.setAttribute("patternContentUnits", SVGUnitTypes.unitTypeToString(this.patternContentUnits));
    }
    public void setPatternContentUnits(short patternContentUnits) {
        this.patternContentUnits = patternContentUnits;
        super.setAttribute("patternContentUnits", SVGUnitTypes.unitTypeToString(this.patternContentUnits));
    }

    public void setPatternTransform(String patternTransform) {
        this.patternTransform = patternTransform;
        super.setAttribute("patternTransform", this.patternTransform);
    }

    public void setHref(String href) {
        this.href = href;
        super.setAttribute("href", this.href);
    }

    public void setViewBox(SVGLengthList viewBox) {
        this.viewBox = viewBox;
        super.setAttribute("viewBox", this.viewBox.getAllItem());
    }
    public void setViewBox(String viewBox) {
        String[] list = viewBox.split(" ");     // 空白文字で区切ると想定
        for (int i = 0; i < list.length; i++) {
            this.viewBox.appendItem(list[i]);
        }
        super.setAttribute("viewBox", this.viewBox.getAllItem());
    }
}
