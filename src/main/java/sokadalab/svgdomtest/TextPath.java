package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class TextPath extends TextContentElement {
    // textPath Method Types
    public final short METHODTYPE_UNKNOWN = 0;
    public final short METHODTYPE_ALIGN = 1;
    public final short METHODTYPE_STRETCH = 2;

    // textPath Spacing Types
    public final short SPACINGTYPE_UNKNOWN = 0;
    public final short SPACINGTYPE_AUTO = 1;
    public final short SPACINGTYPE_EXACT = 2;

    private SVGLength startOffset = new SVGLength();
    private float method;
    private float spacing;

    public TextPath(Document document) {
        super(document, "textPath");
    }

    public void setStartOffset(String startOffset) {
        super.setAttribute("startOffset", startOffset);
    }
    public void setStartOffset(short unitType, float value) {
        this.startOffset.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("startOffset", this.startOffset.getValueAsString());
    }

    public void setMethod(String method) {
        super.setAttribute("method", method);
    }

    public void setSpacing(String spacing) {
        super.setAttribute("spacing", spacing);
    }
}
