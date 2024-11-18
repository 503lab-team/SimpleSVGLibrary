package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class FontFaceFormat extends SVGElement {
    FontFaceFormat(Document document) {
        super(document, "font-face-format");
    }

    void setString(String string) {
        super.setAttribute("string", string);
    }
}