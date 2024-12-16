package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * cursor要素<br>
 * https://www.w3.org/TR/SVG11/interact.html#CursorElement<br>
 * https://www.w3.org/TR/SVG11/interact.html#InterfaceSVGCursorElement
 */
public class Cursor extends SVGElement {
    private SVGLength x = new SVGLength();
    private SVGLength y = new SVGLength();
    
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Cursor(Document document) {
        super(document, "cursor");
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
     * 属性xのセット
     * @param x 属性xに与える値
     */
    public void setX(String x) {
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

    /**
     * 属性yのセット
     * @param y 属性yに与える値
     */
    public void setY(String y) {
        this.y.newValueSpecifiedUnit(y);
        super.setAttribute("y", this.y.getValueAsString());
    }
    public void setY(short unitType, float value){
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
}
