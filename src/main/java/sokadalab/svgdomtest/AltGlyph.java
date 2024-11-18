package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class AltGlyph extends TextPositioningElement {
    String glyphRef;
    String format;

    AltGlyph(Document document) {
        super(document, "altGlyph");
    }

    void setGlyphRef(String glyphRef) {
        this.glyphRef = glyphRef;
        super.setAttribute("glyphRef", glyphRef);
    }

    void setFormat(String format) {
        this.format = format;
        super.setAttribute("format", format);
    }
}
