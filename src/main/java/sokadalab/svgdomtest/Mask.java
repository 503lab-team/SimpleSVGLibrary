package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * mask要素<br>
 * https://www.w3.org/TR/SVG11/masking.html#MaskElement<br>
 * https://www.w3.org/TR/SVG11/masking.html#InterfaceSVGMaskElement
 */
public class Mask extends SVGElement {
    private SVGLength x = new SVGLength();
    private SVGLength y = new SVGLength();
    private SVGLength width = new SVGLength();
    private SVGLength height = new SVGLength();
    private short maskUnits;
    private short maskContentUnits;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Mask(Document document) {
        super(document, "mask");
    }

    /**
     * 属性xの取得
     * @return 属性x
     */
    public SVGLength getX() {
        return this.x;
    }

    /**
     * 属性yの取得
     * @return 属性y
     */
    public SVGLength getY() {
        return this.y;
    }

    /**
     * 属性widthの取得
     * @return 属性width
     */
    public SVGLength getWidth() {
        return this.width;
    }

    /**
     * 属性heightの取得
     * @return 属性height
     */
    public SVGLength getHeight() {
        return this.height;
    }

    /**
     * 属性maskUnitsの取得
     * @return 属性maskUnits
     */
    public short getMaskUnits() {
        return this.maskUnits;
    }

    /**
     * 属性maskContentUnitsの取得
     * @return 属性maskContentUnits
     */
    public short getMaskContentUnits() {
        return this.maskContentUnits;
    }

    /**
     * 属性xのセット
     * @param x 属性xに与える値
     */
    public void setX(String x) {
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

    /**
     * 属性yのセット
     * @param y 属性yに与える値
     */
    public void setY(String y) {
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

    /**
     * 属性widthのセット
     * @param width 属性widthに与える値
     */
    public void setWidth(String width) {
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

    /**
     * 属性heightのセット
     * @param height 属性heightに与える値
     */
    public void setHeight(String height) {
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

    /**
     * 属性maskUnitsのセット
     * @param units 属性maskUnitsに与える値
     */
    public void setMaskUnits(String units) {
        this.maskUnits = SVGUnitTypes.stringToUnitType(units);
        super.setAttribute("maskUnits", SVGUnitTypes.unitTypeToString(this.maskUnits));
    }
    public void setMaskUnits(short units) {
        this.maskUnits = units;
        super.setAttribute("maskUnits", SVGUnitTypes.unitTypeToString(this.maskUnits));
    }

    /**
     * 属性maskContentUnitsのセット
     * @param contentUnits 属性maskContentUnitsに与える値
     */
    public void setMaskContentUnits(String contentUnits) {
        this.maskContentUnits = SVGUnitTypes.stringToUnitType(contentUnits);
        super.setAttribute("maskContentUnits", SVGUnitTypes.unitTypeToString(this.maskContentUnits));
    }
    public void setMaskContentUnits(short contentUnits) {
        this.maskContentUnits = contentUnits;
        super.setAttribute("maskContentUnits", SVGUnitTypes.unitTypeToString(this.maskContentUnits));
    }
}
