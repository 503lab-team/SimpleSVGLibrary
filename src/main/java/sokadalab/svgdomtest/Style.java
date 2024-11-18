package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Style extends SVGElement {
    public Style(Document document) {
        super(document, "style");
    }

    public void setType(String type) {
        super.setAttribute("type", type);
    }

    public void setMedia(String media) {
        super.setAttribute("media", media);
    }

    public void setTitle(String title) {
        super.setAttribute("title", title);
    }
}
