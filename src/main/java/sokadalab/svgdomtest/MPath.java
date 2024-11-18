package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class MPath extends SVGElement {
    public MPath(Document document) {
        super(document, "mpath");
    }

    public void setHref(String href) {
        super.setAttribute("href", href);
    }
}
