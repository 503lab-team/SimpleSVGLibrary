package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Symbol extends SVGElement {
    Symbol(Document document) {
        super(document, "symbol");
    }

    void setViewbox(String viewbox) {
        super.setAttribute("viewBox", viewbox);
    }
}
