package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class GlyphRef extends SVGElement {
    private String glyphRef;
    private String format;
    private float x;
    private float y;
    private float dx;
    private float dy;

    public GlyphRef(Document document) {
        super(document, "glyphRef");
    }

    public void setGlyphRef(String glyphRef) {
        this.glyphRef = glyphRef;
        super.setAttribute("glyphRef", glyphRef);
    }

    public void setFormat(String format) {
        this.format = format;
        super.setAttribute("format", format);
    }

    public void setX(String x) {
        this.x = Float.valueOf(x);
        super.setAttribute("x", x);
    }
    public void setX(float x) {
        this.x = x;
        super.setAttribute("x", Float.toString(x));
    }

    public void setY(String y) {
        this.y = Float.valueOf(y);
        super.setAttribute("y", y);        
    }
    public void setY(float y) {
        this.y = y;
        super.setAttribute("y", Float.toString(y));
    }
    
    public void setDX(String dx) {
        this.dx = Float.valueOf(dx);
        super.setAttribute("dx", dx);
    }
    public void setDX(float dx) {
        this.dx = dx;
        super.setAttribute("dx", Float.toString(dx));
    }
    
    public void setDY(String dy) {
        this.dy = Float.valueOf(dy);
        super.setAttribute("dy", dy);
    }
    public void setDY(float dy) {
        this.dy = dy;
        super.setAttribute("dy", Float.toString(dy));
    }
}
