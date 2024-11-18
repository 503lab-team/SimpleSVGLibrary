package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class TextPositioningElement extends TextContentElement {
    SVGLengthList x;
    SVGLengthList y;
    SVGLengthList dx;
    SVGLengthList dy;
    float rotate;

    TextPositioningElement(Document document, String name) {
        super(document, name);
        this.x = new SVGLengthList();
        this.y = new SVGLengthList();
        this.dx = new SVGLengthList();
        this.dy = new SVGLengthList();
    }

    void setX(String x) {
        super.setAttribute("x", x);
    }

    void setY(String y) {
        super.setAttribute("y", y);        
    }
    
    void setDX(String dx) {
        super.setAttribute("dx", dx);
    }
    
    void setDY(String dy) {
        super.setAttribute("dy", dy);
    }
    
    void setRotate(String rotate) {
        super.setAttribute("rotate", rotate);
    }
}
