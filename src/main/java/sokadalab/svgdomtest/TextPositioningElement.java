package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class TextPositioningElement extends TextContentElement {
    private SVGLengthList x = new SVGLengthList();
    private SVGLengthList y = new SVGLengthList();
    private SVGLengthList dx = new SVGLengthList();
    private SVGLengthList dy = new SVGLengthList();
    private SVGNumberList rotate = new SVGNumberList();

    public TextPositioningElement(Document document, String name) {
        super(document, name);
    }

    public SVGLengthList getX() {
        return this.x;
    }

    public SVGLengthList getY() {
        return this.y;
    }

    public SVGLengthList getDX() {
        return this.dx;
    }

    public SVGLengthList getDY() {
        return this.dy;
    }

    public SVGNumberList getRotate() {
        return this.rotate;
    }

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
