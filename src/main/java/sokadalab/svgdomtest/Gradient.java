package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Gradient extends SVGElement {
    // Spread Method Types
    final short SPREADMETHOD_UNKNOWN = 0;
    final short SPREADMETHOD_PAD = 1;
    final short SPREADMETHOD_REFLECT = 2;
    final short SPREADMETHOD_REPEAT = 3;

    float gradientUnits;
    float spreadMethod;

    Gradient(Document document, String name) {
        super(document, name);
    }
    
    void setGradientUnits(String units) {
        this.gradientUnits = Float.parseFloat(units);
        this.setAttribute("gradientUnits", units);
    }
    void setGradientUnits(float units) {
        this.gradientUnits = units;
        this.setAttribute("gradientUnits", String.valueOf(units));
    }

    void setGradientTransform(String transform) {
        this.setAttribute("gradientTransform", transform);
    }
    
    void setSpreadMethod(String method) {
        this.spreadMethod = Short.valueOf(method);
        this.setAttribute("spreadMethod", method);
    }
    void setSpreadMethod(short method) {
        this.spreadMethod = method;
        this.setAttribute("spreadMethod", String.valueOf(method));
    }

    void setHref(String href) {
        super.setAttribute("href", href);
    }
}
