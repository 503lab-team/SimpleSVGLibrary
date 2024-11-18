package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class FontFaceUri extends SVGElement {
    public FontFaceUri(Document document) {
        super(document, "font-face-uri");
    }

    public void setHref(String href) {
        super.setAttribute("href", href);
    }
}
