// <a>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class A extends SVGElement {
    private String href;

    public A(Document document) {
        super(document, "a");
    }

    public String getHref() {
        return this.href;
    }

    public void setHref(String href) {
        this.href = href;
        super.setAttribute("href", this.href);
    }
}
