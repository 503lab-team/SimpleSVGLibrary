// <glyphRef>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class GlyphRef extends SVGElement {
    private float x;
    private float y;
    private float dx;
    private float dy;
    private String glyphRef;
    private String format;
    private String href;

    public GlyphRef(Document document) {
        super(document, "glyphRef");
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getDX() {
        return this.dx;
    }

    public float getDY() {
        return this.dy;
    }

    public String getGlyphRef() {
        return this.glyphRef;
    }

    public String getFormat() {
        return this.format;
    }

    public String getHref() {
        return this.href;
    }

    public void setX(String x) {
        this.x = Float.parseFloat(x);
        super.setAttribute("x", String.valueOf(this.x));
    }
    public void setX(float x) {
        this.x = x;
        super.setAttribute("x", String.valueOf(this.x));
    }

    public void setY(String y) {
        this.y = Float.parseFloat(y);
        super.setAttribute("y", String.valueOf(this.y));        
    }
    public void setY(float y) {
        this.y = y;
        super.setAttribute("y", String.valueOf(this.y));
    }
    
    public void setDX(String dx) {
        this.dx = Float.parseFloat(dx);
        super.setAttribute("dx", String.valueOf(this.dx));
    }
    public void setDX(float dx) {
        this.dx = dx;
        super.setAttribute("dx", String.valueOf(this.dx));
    }
    
    public void setDY(String dy) {
        this.dy = Float.parseFloat(dy);
        super.setAttribute("dy", String.valueOf(this.dy));
    }
    public void setDY(float dy) {
        this.dy = dy;
        super.setAttribute("dy", String.valueOf(this.dy));
    }

    public void setGlyphRef(String glyphRef) {
        this.glyphRef = glyphRef;
        super.setAttribute("glyphRef", this.glyphRef);
    }

    public void setFormat(String format) {
        this.format = format;
        super.setAttribute("format", this.format);
    }

    public void setHref(String href) {
        this.href = href;
        super.setAttribute("href", this.href);
    }
}
