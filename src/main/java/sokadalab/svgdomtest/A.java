package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class A extends SVGElement {
    A(Document document) {
        super(document, "a");
    }

    void setHref(String href) {
        super.setAttribute("href", href);
    }
}
