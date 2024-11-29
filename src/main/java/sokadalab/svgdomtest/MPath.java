// <mpath>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class MPath extends SVGElement {
    private String href;

    public MPath(Document document) {
        super(document, "mpath");
    }

    public String getHref() {
        return this.href;
    }

    public void setHref(String href) {
        this.href = href;
        super.setAttribute("href", this.href);
    }
}
