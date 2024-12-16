package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feOffset要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feOffsetElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEOffsetElement
 */
public class FeOffset extends FeStandardAttributes {
    private String in;
    private float dx;
    private float dy;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeOffset(Document document) {
        super(document, "feOffset");
    }

    /**
     * 属性inの取得
     * @return 属性in
     */
    public String getIn() {
        return this.in;
    }

    /**
     * 属性dxの取得
     * @return 属性dx
     */
    public float getDX() {
        return this.dx;
    }

    /**
     * 属性dyの取得
     * @return 属性dy
     */
    public float getDY() {
        return this.dy;
    }

    /**
     * 属性inのセット
     * @param in 属性inに与える値
     */
    public void setIn(String in) {
        this.in = in;
        super.setAttribute("in", this.in);
    }

    /**
     * 属性dxのセット
     * @param dx 属性dxに与える値
     */
    public void setDX(float dx) {
        this.dx = dx;
        super.setAttribute("dx", String.valueOf(this.dx));
    }
    public void setDX(String dx) {
        this.dx = Float.parseFloat(dx);
        super.setAttribute("dx", String.valueOf(this.dx));
    }

    /**
     * 属性dyのセット
     * @param dy 属性dyに与える値
     */
    public void setDY(float dy) {
        this.dy = dy;
        super.setAttribute("dy", String.valueOf(this.dy));
    }
    public void setDY(String dy) {
        this.dy = Float.parseFloat(dy);
        super.setAttribute("dy", String.valueOf(this.dy));
    }
}
