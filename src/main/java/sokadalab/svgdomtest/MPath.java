package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class MPath extends SVGElement {
    MPath(Document document) {
        super(document, "mpath");
    }

    void setHref(String href) {
        super.setAttribute("href", href);
    }
}
