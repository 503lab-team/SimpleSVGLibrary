package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class FontFaceFormat extends SVGElement {
    private String string;

    public FontFaceFormat(Document document) {
        super(document, "font-face-format");
    }

    public String getString() {
        return this.string;
    }

    public void setString(String string) {
        this.string = string;
        super.setAttribute("string", this.string);
    }
}