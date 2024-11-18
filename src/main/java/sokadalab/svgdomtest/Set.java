package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Set extends Animation {
    Set(Document document) {
        super(document, "set");
    }

    void setTo(String to) {
        super.setAttribute("to", to);
    }
}
