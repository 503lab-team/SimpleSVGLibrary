package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class AltGlyph extends TextPositioningElement {
    private String glyphRef;
    private String format;

    public AltGlyph(Document document) {
        super(document, "altGlyph");
    }

    public void setGlyphRef(String glyphRef) {
        this.glyphRef = glyphRef;
        super.setAttribute("glyphRef", glyphRef);
    }

    public void setFormat(String format) {
        this.format = format;
        super.setAttribute("format", format);
    }
}
