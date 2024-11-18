package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class FontFaceFormat extends SVGElement {
    public FontFaceFormat(Document document) {
        super(document, "font-face-format");
    }

    public void setString(String string) {
        super.setAttribute("string", string);
    }
}