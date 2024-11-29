package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class FontFaceUri extends SVGElement {
    private String href;

    public FontFaceUri(Document document) {
        super(document, "font-face-uri");
    }

    public String getHref() {
        return this.href;
    }

    public void setHref(String href) {
        this.href = href;
        super.setAttribute("href", this.href);
    }
}
