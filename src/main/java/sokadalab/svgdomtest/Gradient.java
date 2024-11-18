package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Gradient extends SVGElement {
    // Spread Method Types
    public final short SPREADMETHOD_UNKNOWN = 0;
    public final short SPREADMETHOD_PAD = 1;
    public final short SPREADMETHOD_REFLECT = 2;
    public final short SPREADMETHOD_REPEAT = 3;

    private float gradientUnits;
    private float spreadMethod;

    public Gradient(Document document, String name) {
        super(document, name);
    }
    
    public void setGradientUnits(String units) {
        this.gradientUnits = Float.parseFloat(units);
        this.setAttribute("gradientUnits", units);
    }
    public void setGradientUnits(float units) {
        this.gradientUnits = units;
        this.setAttribute("gradientUnits", String.valueOf(units));
    }

    public void setGradientTransform(String transform) {
        this.setAttribute("gradientTransform", transform);
    }
    
    public void setSpreadMethod(String method) {
        this.spreadMethod = Short.valueOf(method);
        this.setAttribute("spreadMethod", method);
    }
    public void setSpreadMethod(short method) {
        this.spreadMethod = method;
        this.setAttribute("spreadMethod", String.valueOf(method));
    }

    public void setHref(String href) {
        super.setAttribute("href", href);
    }
}
