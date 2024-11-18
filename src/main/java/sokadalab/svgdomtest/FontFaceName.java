package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class FontFaceName extends SVGElement {
    FontFaceName(Document document) {
        super(document, "font-face-name");
    }

    void setName(String name) {
        super.setAttribute("name", name);
    }
}
