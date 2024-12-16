package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * foreignObject要素<br>
 * https://www.w3.org/TR/SVG11/extend.html#ForeignObjectElement<br>
 * https://www.w3.org/TR/SVG11/extend.html#InterfaceSVGForeignObjectElement
 */
public class ForeignObject extends SVGElement {
    private SVGLength x = new SVGLength();
    private SVGLength y = new SVGLength();
    private SVGLength width = new SVGLength();
    private SVGLength height = new SVGLength();
    private SVGLengthList viewBox = new SVGLengthList();

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public ForeignObject(Document document) {
        super(document, "foreignObject");
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
     * 属性viewBoxを取得
     * @return 属性viewBox
     */
    public SVGLengthList getViewBox() {
        return this.viewBox;
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
     * 属性viewBoxのセット
     * @param viewBox 属性viewBoxに与える値
     */
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
