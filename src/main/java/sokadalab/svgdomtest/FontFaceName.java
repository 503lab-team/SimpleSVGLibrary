package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class FontFaceName extends SVGElement {
    public FontFaceName(Document document) {
        super(document, "font-face-name");
    }

    public void setName(String name) {
        super.setAttribute("name", name);
    }
}
