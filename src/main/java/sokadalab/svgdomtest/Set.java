package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Set extends Animation {
    public Set(Document document) {
        super(document, "set");
    }

    public void setTo(String to) {
        super.setAttribute("to", to);
    }
}
