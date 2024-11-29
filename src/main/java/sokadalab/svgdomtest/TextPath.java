// <textPath>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class TextPath extends TextContentElement {
    // textPath Method Types
    public static final short METHODTYPE_UNKNOWN = 0;
    public static final short METHODTYPE_ALIGN = 1;
    public static final short METHODTYPE_STRETCH = 2;

    // textPath Spacing Types
    public static final short SPACINGTYPE_UNKNOWN = 0;
    public static final short SPACINGTYPE_AUTO = 1;
    public static final short SPACINGTYPE_EXACT = 2;

    private SVGLength startOffset = new SVGLength();
    private short method;
    private short spacing;

    public TextPath(Document document) {
        super(document, "textPath");
    }

    public SVGLength getStartOffset() {
        return this.startOffset;
    }

    public short getMethod() {
        return this.method;
    }

    public short getSpacing() {
        return this.spacing;
    }

    public void setStartOffset(String startOffset) {
        this.startOffset.newValueSpecifiedUnit(startOffset);
        super.setAttribute("startOffset", this.startOffset.getValueAsString());
    }
    public void setStartOffset(short unitType, float value) {
        this.startOffset.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("startOffset", this.startOffset.getValueAsString());
    }
    public void setStartOffset(float startOffset) {
        this.startOffset.newValueSpecifiedUnit(startOffset);
        super.setAttribute("startOffset", this.startOffset.getValueAsString());
    }
    public void setStartOffset(int startOffset) {
        this.startOffset.newValueSpecifiedUnit(startOffset);
        super.setAttribute("startOffset", this.startOffset.getValueAsString());
    }
    public void setStartOffset(SVGLength startOffset) {
        this.startOffset = startOffset;
        super.setAttribute("startOffset", this.startOffset.getValueAsString());
    }

    public void setMethod(String method) {
        this.method = stringToMethodType(method);
        super.setAttribute("method", methodTypeToString(this.method));
    }
    public void setMethod(short method) {
        this.method = method;
        super.setAttribute("method", methodTypeToString(this.method));
    }

    public void setSpacing(String spacing) {
        this.spacing = stringToSpacingType(spacing);
        super.setAttribute("spacing", methodTypeToString(this.spacing));
    }
    public void setSpacing(short spacing) {
        this.spacing = spacing;
        super.setAttribute("spacing", methodTypeToString(this.spacing));
    }

    public static short stringToMethodType(String str) {
        short result;
        switch(str) {
            case "aline" :
                result = METHODTYPE_ALIGN;
                break;
            case "stretch" :
                result = METHODTYPE_STRETCH;
                break;
            default :
                result = METHODTYPE_UNKNOWN;
        }
        return result;
    }

    public static String methodTypeToString(short methodType) {
        String result;
        switch(methodType) {
            case METHODTYPE_ALIGN :
                result = "aline";
                break;
            case METHODTYPE_STRETCH :
                result = "stretch";
                break;
            default :
                result = "";
        }
        return result;
    }

    public static short stringToSpacingType(String str) {
        short result;
        switch(str) {
            case "auto" :
                result = SPACINGTYPE_AUTO;
                break;
            case "exact" :
                result = SPACINGTYPE_EXACT;
                break;
            default :
                result = SPACINGTYPE_UNKNOWN;
        }
        return result;        
    }

    public static String spacingTypeToString(short spacingType) {
        String result;
        switch(spacingType) {
            case SPACINGTYPE_AUTO :
                result = "auto";
                break;
            case SPACINGTYPE_EXACT :
                result = "exact";
                break;
            default :
                result = "";
        }
        return result;
    }
}
