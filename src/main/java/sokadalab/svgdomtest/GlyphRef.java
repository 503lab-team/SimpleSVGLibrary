package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class GlyphRef extends SVGElement {
    String glyphRef;
    String format;
    float x;
    float y;
    float dx;
    float dy;

    GlyphRef(Document document) {
        super(document, "glyphRef");
    }

    void setGlyphRef(String glyphRef) {
        this.glyphRef = glyphRef;
        super.setAttribute("glyphRef", glyphRef);
    }

    void setFormat(String format) {
        this.format = format;
        super.setAttribute("format", format);
    }

    void setX(String x) {
        this.x = Float.valueOf(x);
        super.setAttribute("x", x);
    }
    void setX(float x) {
        this.x = x;
        super.setAttribute("x", Float.toString(x));
    }

    void setY(String y) {
        this.y = Float.valueOf(y);
        super.setAttribute("y", y);        
    }
    void setY(float y) {
        this.y = y;
        super.setAttribute("y", Float.toString(y));
    }
    
    void setDX(String dx) {
        this.dx = Float.valueOf(dx);
        super.setAttribute("dx", dx);
    }
    void setDX(float dx) {
        this.dx = dx;
        super.setAttribute("dx", Float.toString(dx));
    }
    
    void setDY(String dy) {
        this.dy = Float.valueOf(dy);
        super.setAttribute("dy", dy);
    }
    void setDY(float dy) {
        this.dy = dy;
        super.setAttribute("dy", Float.toString(dy));
    }
}
