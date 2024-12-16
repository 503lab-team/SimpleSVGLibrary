package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * glyphRef要素<br>
 * https://www.w3.org/TR/SVG11/text.html#GlyphRefElement<br>
 * https://www.w3.org/TR/SVG11/text.html#InterfaceSVGGlyphRefElement
 */
public class GlyphRef extends SVGElement {
    private float x;
    private float y;
    private float dx;
    private float dy;
    private String glyphRef;
    private String format;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public GlyphRef(Document document) {
        super(document, "glyphRef");
    }

    /**
     * 属性xの取得
     * @return 属性x
     */
    public float getX() {
        return this.x;
    }

    /**
     * 属性yの取得
     * @return 属性y
     */
    public float getY() {
        return this.y;
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
     * 属性glyphRefの取得
     * @return 属性glyphRef
     */
    public String getGlyphRef() {
        return this.glyphRef;
    }

    /**
     * 属性formatの取得
     * @return 属性format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * 属性xのセット
     * @param x 属性xに与える値
     */
    public void setX(String x) {
        this.x = Float.parseFloat(x);
        super.setAttribute("x", String.valueOf(this.x));
    }
    public void setX(float x) {
        this.x = x;
        super.setAttribute("x", String.valueOf(this.x));
    }

    /**
     * 属性yのセット
     * @param y 属性yに与える値
     */
    public void setY(String y) {
        this.y = Float.parseFloat(y);
        super.setAttribute("y", String.valueOf(this.y));        
    }
    public void setY(float y) {
        this.y = y;
        super.setAttribute("y", String.valueOf(this.y));
    }

    /**
     * 属性dxのセット
     * @param dx 属性dxに与える値
     */
    public void setDX(String dx) {
        this.dx = Float.parseFloat(dx);
        super.setAttribute("dx", String.valueOf(this.dx));
    }
    public void setDX(float dx) {
        this.dx = dx;
        super.setAttribute("dx", String.valueOf(this.dx));
    }

    /**
     * 属性dyのセット
     * @param dy 属性dyに与える値
     */
    public void setDY(String dy) {
        this.dy = Float.parseFloat(dy);
        super.setAttribute("dy", String.valueOf(this.dy));
    }
    public void setDY(float dy) {
        this.dy = dy;
        super.setAttribute("dy", String.valueOf(this.dy));
    }

    /**
     * 属性glyphRefのセット
     * @param glyphRef 属性glyphRefに与える値
     */
    public void setGlyphRef(String glyphRef) {
        this.glyphRef = glyphRef;
        super.setAttribute("glyphRef", this.glyphRef);
    }

    /**
     * 属性formatのセット
     * @param format 属性formatに与える値
     */
    public void setFormat(String format) {
        this.format = format;
        super.setAttribute("format", this.format);
    }
}
