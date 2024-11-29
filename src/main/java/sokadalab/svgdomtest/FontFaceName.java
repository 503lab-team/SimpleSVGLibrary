package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class FontFaceName extends SVGElement {
    private String name;

    public FontFaceName(Document document) {
        super(document, "font-face-name");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        super.setAttribute("name", this.name);
    }
}
