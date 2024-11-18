package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Symbol extends SVGElement {
    public Symbol(Document document) {
        super(document, "symbol");
    }

    public void setViewbox(String viewbox) {
        super.setAttribute("viewBox", viewbox);
    }
}
