package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Use extends SVGElement {
    private SVGLength x;
    private SVGLength y;
    private SVGLength width;
    private SVGLength height;

    public Use(Document document) {
        super(document, "use");
        this.x = new SVGLength();
        this.y = new SVGLength();
        this.width = new SVGLength();
        this.height = new SVGLength();
    }

    public void setX(String x) {
        super.setAttribute("x", x);
    }

    public void setY(String y) {
        super.setAttribute("y", y);
    }

    public void setWidth(String width) {
        super.setAttribute("width", width);
    }

    public void setHeight(String height) {
        super.setAttribute("height", height);
    }

    public void setHref(String href) {
        super.setAttribute("href", href);
    }
}
