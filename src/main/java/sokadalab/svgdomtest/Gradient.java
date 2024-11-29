package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Gradient extends SVGElement {
    // Spread Method Types
    public final static short SPREADMETHOD_UNKNOWN = 0;
    public final static short SPREADMETHOD_PAD = 1;
    public final static short SPREADMETHOD_REFLECT = 2;
    public final static short SPREADMETHOD_REPEAT = 3;

    private short gradientUnits;
    private short spreadMethod;
    private String gradientTransform;
    private String href;

    public Gradient(Document document, String name) {
        super(document, name);
    }

    public short getGradientUnits() {
        return this.gradientUnits;
    }

    public short getSpreadMethod() {
        return this.spreadMethod;
    }

    public String getGradientTransform() {
        return this.gradientTransform;
    }

    public String getHref() {
        return this.href;
    }
    
    public void setGradientUnits(String units) {
        this.gradientUnits = SVGUnitTypes.stringToUnitType(units);
        this.setAttribute("gradientUnits", SVGUnitTypes.unitTypeToString(this.gradientUnits));
    }
    public void setGradientUnits(short units) {
        this.gradientUnits = units;
        this.setAttribute("gradientUnits", SVGUnitTypes.unitTypeToString(this.gradientUnits));
    }

    public void setSpreadMethod(String method) {
        this.spreadMethod = stringToSpreadMethod(method);
        this.setAttribute("spreadMethod", spreadMethodToString(this.spreadMethod));
    }
    public void setSpreadMethod(short method) {
        this.spreadMethod = method;
        this.setAttribute("spreadMethod", spreadMethodToString(this.spreadMethod));
    }

    public void setGradientTransform(String transform) {
        this.gradientTransform = transform;
        this.setAttribute("gradientTransform", this.gradientTransform);
    }
    
    public void setHref(String href) {
        this.href = href;
        super.setAttribute("href", this.href);
    }

    public static short stringToSpreadMethod(String str) {
        switch (str) {
            case "pad" :
                return SPREADMETHOD_PAD;
            case "reflect" :
                return SPREADMETHOD_REFLECT;
            case "repeat" :
                return SPREADMETHOD_REPEAT;
            default :
                return SPREADMETHOD_UNKNOWN;
        }
    }

    public static String spreadMethodToString(short type) {
        switch (type) {
            case SPREADMETHOD_PAD :
                return "pad";
            case SPREADMETHOD_REFLECT :
                return "reflect";
            case SPREADMETHOD_REPEAT :
                return "repeat";
            default :
                return "";
        }
    }
}
