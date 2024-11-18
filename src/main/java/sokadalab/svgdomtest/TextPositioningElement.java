package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class TextPositioningElement extends TextContentElement {
    private SVGLengthList x;
    private SVGLengthList y;
    private SVGLengthList dx;
    private SVGLengthList dy;
    private float rotate;

    public TextPositioningElement(Document document, String name) {
        super(document, name);
        this.x = new SVGLengthList();
        this.y = new SVGLengthList();
        this.dx = new SVGLengthList();
        this.dy = new SVGLengthList();
    }

    public void setX(String x) {
        super.setAttribute("x", x);
    }

    public void setY(String y) {
        super.setAttribute("y", y);        
    }
    
    public void setDX(String dx) {
        super.setAttribute("dx", dx);
    }
    
    public void setDY(String dy) {
        super.setAttribute("dy", dy);
    }
    
    public void setRotate(String rotate) {
        super.setAttribute("rotate", rotate);
    }
}
