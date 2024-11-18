package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class TextPath extends TextContentElement {
    // textPath Method Types
    final short METHODTYPE_UNKNOWN = 0;
    final short METHODTYPE_ALIGN = 1;
    final short METHODTYPE_STRETCH = 2;

    // textPath Spacing Types
    final short SPACINGTYPE_UNKNOWN = 0;
    final short SPACINGTYPE_AUTO = 1;
    final short SPACINGTYPE_EXACT = 2;

    private SVGLength startOffset;
    private float method;
    private float spacing;

    TextPath(Document document) {
        super(document, "textPath");
    }

    void setStartOffset(String startOffset) {
        super.setAttribute("startOffset", startOffset);
    }
    void setStartOffset(short unitType, float value) {
        this.startOffset.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("startOffset", this.startOffset.getValueAsString());
    }

    void setMethod(String method) {
        super.setAttribute("method", method);
    }

    void setSpacing(String spacing) {
        super.setAttribute("spacing", spacing);
    }
}
