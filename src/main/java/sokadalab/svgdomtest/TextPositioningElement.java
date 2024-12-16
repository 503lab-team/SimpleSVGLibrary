package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * Text、Tref、Tspan、AltGlyphの基本となるクラス<br>
 * https://www.w3.org/TR/SVG11/text.html#InterfaceSVGTextPositioningElement
 */
public class TextPositioningElement extends TextContentElement {
    private SVGLengthList x = new SVGLengthList();
    private SVGLengthList y = new SVGLengthList();
    private SVGLengthList dx = new SVGLengthList();
    private SVGLengthList dy = new SVGLengthList();
    private SVGNumberList rotate = new SVGNumberList();

    /**
     * コンストラクタ
     * @param document ドキュメント
     * @param name 要素名
     */
    public TextPositioningElement(Document document, String name) {
        super(document, name);
    }

    /**
     * 属性xの取得
     * @return 属性x
     */
    public SVGLengthList getX() {
        return this.x;
    }

    /**
     * 属性yの取得
     * @return 属性y
     */
    public SVGLengthList getY() {
        return this.y;
    }

    /**
     * 属性dxの取得
     * @return 属性dx
     */
    public SVGLengthList getDX() {
        return this.dx;
    }

    /**
     * 属性dyの取得
     * @return 属性dy
     */
    public SVGLengthList getDY() {
        return this.dy;
    }

    /**
     * 属性rotateの取得
     * @return 属性rotate
     */
    public SVGNumberList getRotate() {
        return this.rotate;
    }

    /**
     * 属性xのセット
     * @param x 属性xに与える値
     */
    public void setX(String x) {
        this.x.clear();
        this.x.appendItem(x);
        super.setAttribute("x", this.x.getAllItem());
    }
    public void setX(float x) {
        this.x.clear();
        this.x.appendItem(x);
        super.setAttribute("x", this.x.getAllItem());
    }
    public void setX(SVGLength x) {
        this.x.clear();
        this.x.appendItem(x);
        super.setAttribute("x", this.x.getAllItem());
    }
    public void setX(SVGLengthList x) {
        this.x = x;
        super.setAttribute("x", this.x.getAllItem());
    }

    /**
     * 属性yのセット
     * @param y 属性yに与える値
     */
    public void setY(String y) {
        this.y.clear();
        this.y.appendItem(y);
        super.setAttribute("y", this.y.getAllItem());
    }
    public void setY(float y) {
        this.y.clear();
        this.y.appendItem(y);
        super.setAttribute("y", this.y.getAllItem());
    }
    public void setY(SVGLength y) {
        this.y.clear();
        this.y.appendItem(y);
        super.setAttribute("y", this.y.getAllItem());
    }
    public void setY(SVGLengthList y) {
        this.y = y;
        super.setAttribute("y", this.y.getAllItem());
    }

    /**
     * 属性dxのセット
     * @param dx 属性dxに与える値
     */
    public void setDX(String dx) {
        this.dx.clear();
        this.dx.appendItem(dx);
        super.setAttribute("dx", this.dx.getAllItem());
    }
    public void setDX(float dx) {
        this.dx.clear();
        this.dx.appendItem(dx);
        super.setAttribute("dx", this.dx.getAllItem());
    }
    public void setDX(SVGLength dx) {
        this.dx.clear();
        this.dx.appendItem(dx);
        super.setAttribute("dx", this.dx.getAllItem());
    }
    public void setDX(SVGLengthList dx) {
        this.dx = dx;
        super.setAttribute("dx", this.dx.getAllItem());
    }

    /**
     * 属性dyのセット
     * @param dy 属性dyに与える値
     */
    public void setDY(String dy) {
        this.dy.clear();
        this.dy.appendItem(dy);
        super.setAttribute("dy", this.dy.getAllItem());
    }
    public void setDY(float dy) {
        this.dy.clear();
        this.dy.appendItem(dy);
        super.setAttribute("dy", this.dy.getAllItem());
    }
    public void setDY(SVGLength dy) {
        this.dy.clear();
        this.dy.appendItem(dy);
        super.setAttribute("dy", this.dy.getAllItem());
    }
    public void setDY(SVGLengthList dy) {
        this.dy = dy;
        super.setAttribute("dy", this.dy.getAllItem());
    }

    /**
     * 属性rotateのセット
     * @param rotate 属性rotateに与える値
     */
    public void setRotate(String rotate) {
        this.rotate.clear();
        this.rotate.appendItem(rotate);
        super.setAttribute("rotate", this.rotate.getAllItem());
    }
    public void setRotate(float rotate) {
        this.rotate.clear();
        this.rotate.appendItem(rotate);
        super.setAttribute("rotate", this.rotate.getAllItem());
    }
    public void setRotate(SVGNumberList rotate) {
        this.rotate = rotate;
        super.setAttribute("rotate", this.rotate.getAllItem());
    }
}
