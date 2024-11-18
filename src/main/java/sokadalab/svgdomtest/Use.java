package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Use extends SVGElement {
    private SVGLength x;
    private SVGLength y;
    private SVGLength width;
    private SVGLength height;

    Use(Document document) {
        super(document, "use");
    }

    void setX(String x) {
        super.setAttribute("x", x);
    }

    void setY(String y) {
        super.setAttribute("y", y);
    }

    void setWidth(String width) {
        super.setAttribute("width", width);
    }

    void setHeight(String height) {
        super.setAttribute("height", height);
    }

    void setHref(String href) {
        super.setAttribute("href", href);
    }
}
