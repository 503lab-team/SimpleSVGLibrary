package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Style extends SVGElement {
    Style(Document document) {
        super(document, "style");
    }

    void setType(String type) {
        super.setAttribute("type", type);
    }

    void setMedia(String media) {
        super.setAttribute("media", media);
    }

    void setTitle(String title) {
        super.setAttribute("title", title);
    }
}
