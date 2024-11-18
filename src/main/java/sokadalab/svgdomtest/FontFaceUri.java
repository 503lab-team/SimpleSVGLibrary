package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class FontFaceUri extends SVGElement {
    FontFaceUri(Document document) {
        super(document, "font-face-uri");
    }

    void setHref(String href) {
        super.setAttribute("href", href);
    }
}
