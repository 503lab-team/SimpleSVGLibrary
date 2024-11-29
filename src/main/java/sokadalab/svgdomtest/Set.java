// <set>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Set extends Animation {
    private String to;

    public Set(Document document) {
        super(document, "set");
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
        super.setAttribute("to", this.to);
    }
}
