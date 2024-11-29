// <script>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Script extends SVGElement {
    private String type;
    private String href;

    public Script(Document document) {
        super(document, "script");
    }

    public String getType() {
        return this.type;
    }

    public String getHref() {
        return this.href;
    }

    public void setType(String type) {
        this.type = type;
        super.setAttribute("type", this.type);
    }

    public void setHref(String href) {
        this.href = href;
        super.setAttribute("href", this.href);
    }
}
