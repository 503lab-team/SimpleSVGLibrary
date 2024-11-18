package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class A extends SVGElement {
    public A(Document document) {
        super(document, "a");
    }

    public void setHref(String href) {
        super.setAttribute("href", href);
    }
}
